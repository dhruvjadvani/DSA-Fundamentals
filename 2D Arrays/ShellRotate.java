import java.io.*;
import java.util.*;

public class ShellRotate {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		int shell = scn.nextInt();
		int rotate = scn.nextInt();
		
		rotateShell(arr, shell, rotate);
		display(arr);
    }
    
    public static void rotateShell(int[][] arr, int shell, int rotate) {
		int[] oneD = fillOneDFromShell(arr, shell);
		rotate(oneD, rotate);
		fillShellFromOneD(arr, shell, oneD);
	}
	
	public static int[] fillOneDFromShell(int[][] arr, int shell) {
		int minRow = shell - 1;
		int minCol = shell - 1;
		int maxRow = arr.length - shell;
		int maxCol = arr[0].length - shell;
		int sizeOfShell =  2 * (maxRow - minRow + maxCol - minCol); 
		
		int[] oneD = new int[sizeOfShell];	
		int index = 0;
		//left wall  up to down
		for(int i = minRow, j = minCol; i <= maxRow; i++) {
			oneD[index] = arr[i][j];   
			index++;
		}
		
		//bottom wall left to right
		for(int j = minCol + 1, i = maxRow; j <= maxCol; j++) {
			oneD[index] = arr[i][j];
			index++;
		}
		
		//right wall down to up
		for(int i = maxRow - 1, j = maxCol; i >= minRow; i--) {
			oneD[index] = arr[i][j];
			index++;
		}
		//top wall right to left
		for(int j = maxCol - 1, i = minRow; j >= minCol + 1; j--) {
			oneD[index] = arr[i][j];
			index++;
		}
		
		return oneD;
	}
	
	public static void fillShellFromOneD(int[][] arr, int shell,int[] oneD) {
		int minRow = shell - 1;
		int minCol = shell - 1;
		int maxRow = arr.length - shell;
		int maxCol = arr[0].length - shell;

		int index = 0;
		//left wall  up to down
		for(int i = minRow, j = minCol; i <= maxRow; i++) {
			 arr[i][j] = oneD[index]; 
			index++;
		}
		
		//bottom wall left to right
		for(int j = minCol + 1, i = maxRow; j <= maxCol; j++) {
			arr[i][j] = oneD[index];
			index++;
		}
		
		//right wall down to up
		for(int i = maxRow - 1, j = maxCol; i >= minRow; i--) {
			arr[i][j] = oneD[index];
			index++;
		}
		//top wall right to left
		for(int j = maxCol - 1, i = minRow; j >= minCol + 1; j--) {
			arr[i][j] = oneD[index];
			index++;
		}
		
	}
	
	public static void rotate(int[] oneD, int rotate) {
		rotate = rotate % oneD.length;   
		if(rotate < 0) {
			rotate = rotate + oneD.length; 
		}
		
		reverse(oneD, 0, oneD.length - rotate - 1);  
		reverse(oneD, oneD.length - rotate, oneD.length - 1);  
		reverse(oneD, 0, oneD.length - 1); 
	}
	
	
	public static void reverse(int[] oneD, int leftIndex, int rightIndex) {
		while(leftIndex < rightIndex) {
			int temp = oneD[leftIndex];
			oneD[leftIndex] = oneD[rightIndex];
			oneD[rightIndex] = temp;
			
			leftIndex++;
			rightIndex--;
		}
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
