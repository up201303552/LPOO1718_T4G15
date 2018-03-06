package model;

public class Utils{
	private static char[][] firstLVL = new char[10][10];
	public static void clearScreen() {  
		for (int i = 0; i < 50; ++i) System.out.println();
	}
	
	public static char[][] prepareLVL1(){
		
		// first row
		firstLVL[0][0] = 'X';
		firstLVL[0][1] = 'X';
		firstLVL[0][2] = 'X';
		firstLVL[0][3] = 'X';
		firstLVL[0][4] = 'X';
		firstLVL[0][5] = 'X';
		firstLVL[0][6] = 'X';
		firstLVL[0][7] = 'X';
		firstLVL[0][8] = 'X';
		firstLVL[0][9] = 'X';

		// second row
		firstLVL[1][0] = 'X';
		firstLVL[1][4] = 'I';
		firstLVL[1][6] = 'X';
		firstLVL[1][9] = 'X';

		// third row
		firstLVL[2][0] = 'X';
		firstLVL[2][1] = 'X';
		firstLVL[2][2] = 'X';
		firstLVL[2][4] = 'X';
		firstLVL[2][5] = 'X';
		firstLVL[2][6] = 'X';
		firstLVL[2][9] = 'X';

		// fourth row
		firstLVL[3][0] = 'X';
		firstLVL[3][2] = 'I';
		firstLVL[3][4] = 'I';
		firstLVL[3][6] = 'X';
		firstLVL[3][9] = 'X';

		// fifth row
		firstLVL[4][0] = 'X';
		firstLVL[4][1] = 'X';
		firstLVL[4][2] = 'X';
		firstLVL[4][4] = 'X';
		firstLVL[4][5] = 'X';
		firstLVL[4][6] = 'X';
		firstLVL[4][9] = 'X';

		// sixth row
		firstLVL[5][0] = 'I';
		firstLVL[5][9] = 'X';

		// seventh row
		firstLVL[6][0] = 'I';
		firstLVL[6][9] = 'X';

		// eighth row
		firstLVL[7][0] = 'X';
		firstLVL[7][1] = 'X';
		firstLVL[7][2] = 'X';
		firstLVL[7][4] = 'X';
		firstLVL[7][5] = 'X';
		firstLVL[7][6] = 'X';
		firstLVL[7][7] = 'X';
		firstLVL[7][9] = 'X';

		// ninth row
		firstLVL[8][0] = 'X';
		firstLVL[8][2] = 'I';
		firstLVL[8][4] = 'I';
		firstLVL[8][6] = 'X';
		firstLVL[8][7] = 'k';
		firstLVL[8][9] = 'X';

		firstLVL[9][0] = 'X';
		firstLVL[9][1] = 'X';
		firstLVL[9][2] = 'X';
		firstLVL[9][3] = 'X';
		firstLVL[9][4] = 'X';
		firstLVL[9][5] = 'X';
		firstLVL[9][6] = 'X';
		firstLVL[9][7] = 'X';
		firstLVL[9][8] = 'X';
		firstLVL[9][9] = 'X';
		
		return firstLVL;
	}
	
	
}

	

