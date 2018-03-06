/**
 * 
 */
package model;

import com.sun.prism.paint.Color;

/**
 * @author Matheus Gonçalves 28/02/2018
 * 
 */

public class Hero {
	/* represents the position of our hero in the bidimensional array */
	private int heroX;
	private int heroY;
	private char symbol;

	public Hero(int initX, int initY, char representation) {
		this.heroX = initX;
		this.heroY = initY;
		this.symbol = representation;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getHeroX() {
		return heroX;
	}

	public void setHeroX(int heroX) {
		this.heroX = heroX;
	}

	public int getHeroY() {
		return heroY;
	}

	public void setHeroY(int heroY) {
		this.heroY = heroY;
	}


}
