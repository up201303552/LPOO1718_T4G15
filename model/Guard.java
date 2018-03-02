/**
 * 
 */
package model;

/**
 * @author Matheus
 *
 */
public class Guard {
	private int guardX;
	private int guardY; 
	private char[] guardPatrol = new char[24];
	
	
	public Guard(int guardX, int guardY, char[] patrol){
		this.guardX = guardX; 
		this.guardY = guardY;
		this.guardPatrol = patrol;
	}
	
	public int getGuardX() {
		return guardX;
	}


	public void setGuardX(int guardX) {
		this.guardX = guardX;
	}


	public int getGuardY() {
		return guardY;
	}


	public void setGuardY(int guardY) {
		this.guardY = guardY;
	}


	public char[] getGuardPatrol() {
		return guardPatrol;
	}


	public void setGuardPatrol(char[] guardPatrol) {
		this.guardPatrol = guardPatrol;
	}
	
	
	

}
