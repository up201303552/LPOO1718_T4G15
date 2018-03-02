package test;

import java.util.Scanner;

import model.Board;
import model.Utils;

public class main {

	private static Board myBoard;

	public static void main(String[] args) {
		myBoard = new Board();
		boolean exit = true;
		int patrolIterator = 0;

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

			switch (c) {
			case 'w':
				if (myBoard.checkValidPosition(heroX - 1, heroY)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroX(heroX - 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else
					Utils.clearScreen();
				System.out.println("Can go throw that...");
				break;
			case 's':
				if (myBoard.checkValidPosition(heroX + 1, heroY)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroX(heroX + 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else
					Utils.clearScreen();
				System.out.println("Can go throw that...");
				break;

			case 'd':
				if (myBoard.checkValidPosition(heroX, heroY + 1)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroY(heroY + 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else
					Utils.clearScreen();
				System.out.println("Can go throw that...");
				break;
			case 'a':
				if (myBoard.checkValidPosition(heroX, heroY - 1)) {
					myBoard.setCharOnBoard(heroX, heroY, ' ');
					myBoard.getMyHero().setHeroY(heroY - 1);
					myBoard.setHeroPos(myBoard.getMyHero());
					Utils.clearScreen();
				} else
					Utils.clearScreen();
				System.out.println("Can go throw that...");
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

			/*switch (guard1Patrol[patrolIterator]) {
			case 'L':
				//myBoard.

			}

			if (patrolIterator == 23) { // if it hits the end of patrol,
										// iterator goes back to 0
				patrolIterator = 0;
			}*/

		}

	}
}
