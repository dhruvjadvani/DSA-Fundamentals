
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int rowOne = scn.nextInt();
		int colOne = scn.nextInt();
		
		int[][] arrOne = new int[rowOne][colOne];
		for(int i = 0; i < arrOne.length; i++) {  
			for(int j = 0; j < arrOne[0].length; j++) { 
				arrOne[i][j] = scn.nextInt();
			}
		}
		
		int rowTwo = scn.nextInt();
		int colTwo = scn.nextInt();
		
		int[][] arrTwo = new int[rowTwo][colTwo];
		for(int i = 0; i < arrTwo.length; i++) { 
			for(int j = 0; j < arrTwo[0].length; j++) { 
				arrTwo[i][j] = scn.nextInt();
			}
		}
		
		if(colOne != rowTwo) {
			System.out.println("Invalid input");
			return;
		}
		
	
		int[][] prd = new int[rowOne][colTwo];
		for(int i = 0; i < prd.length; i++) {
			for(int j = 0; j < prd[0].length; j++) {
				for(int k = 0; k < colOne; k++) { 
					prd[i][j] = prd[i][j] + arrOne[i][k] * arrTwo[k][j]; 
				}
			}
		}
		
		
		for(int i = 0; i < prd.length; i++) {
			for(int j = 0; j < prd[0].length; j++) {
				System.out.print(prd[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
