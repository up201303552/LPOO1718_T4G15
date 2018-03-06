package test;

import java.awt.Point;
import java.util.Scanner;

import model.Board;
import model.Guard;
import model.Hero;
import model.Utils;

public class main {

	private static Board myBoard;

	public static void main(String[] args) {
		//init board
		myBoard = new Board(Utils.prepareLVL1());
		boolean exit = true;
		int patrolIterator = 0;
		
		//finds the coords of the key in the board
		Point key = new Point();
		key = myBoard.getKeyCoords();
		
		//checks for existance of key
		if(key.getX() == -1 && key.getY() == -1){
			System.out.println("Key not found on your board");
		}
		
		//game cycle
		while (exit) {
			System.out.println("Welcome to Dungeon Keep");
			System.out
					.println("Use 'W', 'A', 'S', 'D' to move the hero. Input 'E' to exit");
			System.out.println();
			myBoard.printBoard();
			System.out.println();
			System.out.print("Input Commands: ");
			Scanner input = new Scanner(System.in);
			char c = input.next().charAt(0);
			int heroX = myBoard.getMyHero().getHeroX();
			int heroY = myBoard.getMyHero().getHeroY();
			int guard1X = myBoard.getMyGuard().getGuardX();
			int guard1Y = myBoard.getMyGuard().getGuardY();

			switch (c) {  //hero input handler
			case 'w':
				if (myBoard.checkValidPosition(heroX - 1, heroY)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroX(heroX - 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else {
					Utils.clearScreen();
					System.out.println("Can go throw that...");
				}
				break;
			case 's':
				if (myBoard.checkValidPosition(heroX + 1, heroY)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroX(heroX + 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else {
					Utils.clearScreen();
					System.out.println("Can go throw that...");
				}
				break;

			case 'd':
				if (myBoard.checkValidPosition(heroX, heroY + 1)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroY(heroY + 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else {
					Utils.clearScreen();
					System.out.println("Can go throw that...");
				}
				break;
			case 'a':
				if (myBoard.checkValidPosition(heroX, heroY - 1)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroY(heroY - 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else {
					Utils.clearScreen();
					System.out.println("Can go throw that...");
				}
				break;
			case 'e':
				System.out.println("Thanks for playing!");
				input.close();
				System.exit(0);
			default:
				Utils.clearScreen();
				System.out.println("Invalid Key...");
				break;
			}

			// guard patrol controller
			char[] guard1Patrol = myBoard.getMyGuard().getGuardPatrol();

			switch (guard1Patrol[patrolIterator]) {
			case 'L':
				myBoard.setCharOnBoard(guard1X, guard1Y, ' '); // clears the
																// current guard
																// pos
				myBoard.getMyGuard().setGuardY(guard1Y - 1);
				myBoard.setGuardPos(myBoard.getMyGuard());
				break;
			case 'R':
				myBoard.setCharOnBoard(guard1X, guard1Y, ' '); // clears the
																// current guard
																// pos
				myBoard.getMyGuard().setGuardY(guard1Y + 1);
				myBoard.setGuardPos(myBoard.getMyGuard());
				break;
			case 'U':
				myBoard.setCharOnBoard(guard1X, guard1Y, ' '); // clears the
																// current guard
																// pos
				myBoard.getMyGuard().setGuardX(guard1X - 1);
				myBoard.setGuardPos(myBoard.getMyGuard());
				break;
			case 'D':
				myBoard.setCharOnBoard(guard1X, guard1Y, ' '); // clears the
																// current guard
																// pos
				myBoard.getMyGuard().setGuardX(guard1X + 1);
				myBoard.setGuardPos(myBoard.getMyGuard());
				break;
			default:
				System.out.println("Error on Guard patrol");
				break;
			}
			
			//after every coord update it checks the collision
			
			if(myBoard.checkCollisionWithGuards(myBoard.getMyHero(),myBoard.getMyGuard())){
				Utils.clearScreen();
				myBoard.printBoard();
				System.out.println("YOU JUST GOT CAUGHT!");
				System.out.println("GAME OVER");
				input.close();
				System.exit(0);
			}
			
			//after every coord update it checks if the hero reached the key
			if(myBoard.checkCollisionWithKey(myBoard.getMyHero(), key)){ 
				myBoard.openStairs();
			}
			
			
			
			if (patrolIterator == 23) { // if it hits the end of patrol, //
				// iterator goes back to 0 patrolIterator = 0
				patrolIterator = 0;
			}
			else {
				patrolIterator++;
			}

		}

		

	}

	
}
