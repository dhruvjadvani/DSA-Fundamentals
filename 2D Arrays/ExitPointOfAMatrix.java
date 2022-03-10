package basicOfProgramming.TwoDArrays;
import java.util.*;
public class ExitPointOfAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		int direction = 0; // 0 - east, 1 - south, 2 - west, 3 - north
		int i = 0; 
		int j = 0; 
		
		while(true) {
			direction = (direction + arr[i][j]) % 4;  
			
			if(direction == 0) {  
				j++; 
			} else if(direction == 1) { 
				i++; 
			} else if(direction == 2) { 
				j--; 
			} else if(direction == 3) { 
				i--; 
			} else if(direction % 2 == 1) {
				
			}
			
			if(i < 0) {  
				i++;   
				break;
			} else if(j < 0) { 
				j++;  
				break;
			} else if(i == arr.length) {  
				i--; 
				break;
			} else if(j == arr[0].length) { 
				j--;  
				break;
			}
		}
		
		System.out.println(i);
		System.out.println(j);
	}

}
