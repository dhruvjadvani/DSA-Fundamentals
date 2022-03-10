
import java.util.*;
public class SpiralTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		
		
		int minRow = 0;
		int minCol = 0;
		int maxRow = arr.length - 1;
		int maxCol = arr[0].length - 1;
		int totalNoOfElements = n * m;
		int count = 0;
		
		while(count < totalNoOfElements) {  
			
			for(int i = minRow, j = minCol; i <= maxRow && count < totalNoOfElements; i++) { // here j is constant
				System.out.println(arr[i][j]);
				count++;
			}
			minCol++;
			
			
			for(int j = minCol, i = maxRow; j <= maxCol && count < totalNoOfElements; j++) { // here i is constant
				System.out.println(arr[i][j]);
				count++;
			}
			maxRow--;
			
			
			for(int i = maxRow, j = maxCol; i >= minRow && count < totalNoOfElements; i--) { // here j is constant
				System.out.println(arr[i][j]);
				count++;
			}
			maxCol--;
			
			
			
			for(int j = maxCol, i = minRow; j >= minCol && count < totalNoOfElements; j--) { // here i is constant
				System.out.println(arr[i][j]);
				count++;
			}
			minRow++;
			
		}
		
	}

}
