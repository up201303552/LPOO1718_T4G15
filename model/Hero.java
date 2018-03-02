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
	private Color heroColor;

	public Hero(int initX, int initY, final Color color) {
		heroX = initX;
		heroY = initY;
		heroColor = color;
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

	public Color getHeroColor() {
		return heroColor;
	}

	public void setHeroColor(Color heroColor) {
		this.heroColor = heroColor;
	}

}
