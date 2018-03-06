package model;

import java.awt.Point;

public class Board {

	private char[][] boardData = new char[10][10];
	private static Hero myHero;
	private static Guard myGuard;

	public Board(char[][] board) {
		for (int i = 0; i < this.boardData.length; i++) { 
			for (int j = 0; j < this.boardData[i].length; j++) {
				this.boardData[i][j] = board[i][j];
			}
		}

		fillEmpty();

		// initializes Hero
		myHero = new Hero(1, 1, 'H');
		setHeroPos(myHero);

		// initializes Guards
		char[] guard1Patrol = { 'L', 'D', 'D', 'D', 'D', 'L', 'L', 'L', 'L',
				'L', 'L', 'D', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'U', 'U',
				'U', 'U', 'U' }; // hardcoded patrol
		myGuard = new Guard(1, 8, guard1Patrol);
		setGuardPos(myGuard);
	}

	public void fillEmpty() {
		for (int i = 0; i < this.boardData.length; i++) {
			for (int j = 0; j < this.boardData[i].length; j++) {
				if (this.boardData[i][j] == 0) {
					this.boardData[i][j] = ' ';
				}
			}
		}

	}

	public void printBoard() {
		for (int i = 0; i < this.boardData.length; i++) {
			System.out.println();
			for (int j = 0; j < this.boardData[i].length; j++) {
				System.out.print(" " + this.boardData[i][j] + " ");
			}

		}
		System.out.println();
	}

	public void setCharOnBoard(int x, int y, char ch) {
		this.boardData[x][y] = ch;
	}

	public boolean checkValidPosition(int x, int y) {

		if (x < 10 && x >= 0 && y < 10 && y >= 0 && this.boardData[x][y] == ' '
				|| x < 10 && x >= 0 && y < 10 && y >= 0
				&& this.boardData[x][y] == 'k') {
			return true;
		} else {
			System.out.println("Cant place character in that position"
					+ this.boardData[x][y]);
			return false;
		}
	}

	public char[][] getBoardData() {
		return boardData;
	}

	public void setHeroPos(Hero h) {
		if (checkValidPosition(h.getHeroX(), h.getHeroY())) {
			setCharOnBoard(h.getHeroX(), h.getHeroY(), h.getSymbol());
		}
	}

	public void setGuardPos(Guard g) {
		if (checkValidPosition(g.getGuardX(), g.getGuardY())) {
			setCharOnBoard(g.getGuardX(), g.getGuardY(), 'G');
		}
	}

	public Guard getMyGuard() {
		return myGuard;
	}

	public Hero getMyHero() {
		return myHero;
	}

	public boolean checkCollisionWithGuards(Hero myHero, Guard myGuard) {
		if (myHero.getHeroX() - 1 == myGuard.getGuardX()
				&& myHero.getHeroY() == myGuard.getGuardY()
				|| myHero.getHeroX() + 1 == myGuard.getGuardX()
				&& myHero.getHeroY() == myGuard.getGuardY()
				|| myHero.getHeroX() == myGuard.getGuardX()
				&& myHero.getHeroY() + 1 == myGuard.getGuardY()
				|| myHero.getHeroX() == myGuard.getGuardX()
				&& myHero.getHeroY() - 1 == myGuard.getGuardY()) {
			return true;
		}
		return false;
	}

	public Point getKeyCoords() {
		Point p = new Point(-1, -1);
		for (int i = 0; i < this.boardData.length; i++) {
			for (int j = 0; j < this.boardData[i].length; j++) {
				if (this.boardData[i][j] == 'k') {
					p.setLocation(i, j);
					return p;
				}
			}
		}
		return p;
	}

	public boolean checkCollisionWithKey(Hero myHero, Point key) {
		if (myHero.getHeroX() == key.getX() && myHero.getHeroY() == key.getY())
			return true;
		else
			return false;
	}
	
	public void openStairs(){
		for (int i = 0; i < this.boardData.length; i++) {
			for (int j = 0; j < this.boardData[i].length; j++) {
				if(this.boardData[i][j] == 'I'){
					this.boardData[i][j] = 'S';
				}
			}
		}
	}
}
