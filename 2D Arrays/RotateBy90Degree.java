package basicOfProgramming.TwoDArrays;
import java.util.*;
public class RotateBy90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); 
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		  
		
		for(int i = 0; i < arr.length; i++) { 
			for(int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			} 
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			int leftIndex = 0;
			int rightIndex = arr[i].length - 1;
			
			while(leftIndex < rightIndex) {
				int temp = arr[i][leftIndex];
				arr[i][leftIndex] = arr[i][rightIndex];
				arr[i][rightIndex] = temp;
				
				leftIndex++;
				rightIndex--;
			}
			
		}
		
		display(arr);
		
	}
	
	public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
