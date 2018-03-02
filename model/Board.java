package model;

import com.sun.prism.paint.Color;

public class Board {

	private char[][] boardData = new char[10][10];
	private static Hero myHero;
	private static Guard myGuard;

	public Board() {
		// first row
		boardData[0][0] = 'X';
		boardData[0][1] = 'X';
		boardData[0][2] = 'X';
		boardData[0][3] = 'X';
		boardData[0][4] = 'X';
		boardData[0][5] = 'X';
		boardData[0][6] = 'X';
		boardData[0][7] = 'X';
		boardData[0][8] = 'X';
		boardData[0][9] = 'X';

		// second row
		boardData[1][0] = 'X';
		boardData[1][4] = 'I';
		boardData[1][6] = 'X';
		boardData[1][9] = 'X';

		// third row
		boardData[2][0] = 'X';
		boardData[2][1] = 'X';
		boardData[2][2] = 'X';
		boardData[2][4] = 'X';
		boardData[2][5] = 'X';
		boardData[2][6] = 'X';
		boardData[2][9] = 'X';

		// fourth row
		boardData[3][0] = 'X';
		boardData[3][2] = 'I';
		boardData[3][4] = 'I';
		boardData[3][6] = 'X';
		boardData[3][9] = 'X';

		// fifth row
		boardData[4][0] = 'X';
		boardData[4][1] = 'X';
		boardData[4][2] = 'X';
		boardData[4][4] = 'X';
		boardData[4][5] = 'X';
		boardData[4][6] = 'X';
		boardData[4][9] = 'X';

		// sixth row
		boardData[5][0] = 'I';
		boardData[5][9] = 'X';

		// seventh row
		boardData[6][0] = 'I';
		boardData[6][9] = 'X';

		// eighth row
		boardData[7][0] = 'X';
		boardData[7][1] = 'X';
		boardData[7][2] = 'X';
		boardData[7][4] = 'X';
		boardData[7][5] = 'X';
		boardData[7][6] = 'X';
		boardData[7][7] = 'X';
		boardData[7][9] = 'X';

		// ninth row
		boardData[8][0] = 'X';
		boardData[8][2] = 'I';
		boardData[8][4] = 'I';
		boardData[8][6] = 'X';
		boardData[8][7] = 'k';
		boardData[8][9] = 'X';

		boardData[9][0] = 'X';
		boardData[9][1] = 'X';
		boardData[9][2] = 'X';
		boardData[9][3] = 'X';
		boardData[9][4] = 'X';
		boardData[9][5] = 'X';
		boardData[9][6] = 'X';
		boardData[9][7] = 'X';
		boardData[9][8] = 'X';
		boardData[9][9] = 'X';

		fillEmpty();

		// initializes Hero
		myHero = new Hero(1, 1, Color.RED);
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
	}

	public void setCharOnBoard(int x, int y, char ch) {
		this.boardData[x][y] = ch;
	}

	public boolean checkValidPosition(int x, int y) {

		if (x < 10 && x >= 0 && y < 10 && y >= 0 && this.boardData[x][y] == ' ') {
			return true;
		} else {
			System.out.println("Cant place Hero in that position"
					+ this.boardData[x][y]);
			return false;
		}
	}

	public char[][] getBoardData() {
		return boardData;
	}

	public void setHeroPos(Hero h) {
		if (checkValidPosition(h.getHeroX(), h.getHeroY())) {
			setCharOnBoard(h.getHeroX(), h.getHeroY(), 'H');
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

}
