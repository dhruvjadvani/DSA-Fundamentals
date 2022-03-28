package dp.TimeAndSpaceCompexity;
import java.util.*;
public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
	    //write your code here
		for(int itr = 1; itr <= arr.length - 1; itr++) { // if array has five elements then loop will run for 4 times
			for(int j = 0; j < arr.length - itr; j++) {
				if(isSmaller(arr, j + 1, j)) {
					swap(arr, j + 1, j);
				}
			}
		}
	    
	  }


	// used for swapping ith and jth elements of array
	  public static void swap(int[] arr, int i, int j) {
	    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }
	
	
	// return true if ith element is smaller than jth element
	  public static boolean isSmaller(int[] arr, int i, int j) {
	    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
	    if (arr[i] < arr[j]) {
	      return true;
	    } else {
	      return false;
	    }
	  }
	
	public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.println(arr[i]);
	    }
	  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    bubbleSort(arr);
	    print(arr);
	}

}

