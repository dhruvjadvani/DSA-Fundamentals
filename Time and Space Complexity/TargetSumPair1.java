import java.util.*;
public class TargetSumPair {
	public static void targetSumPair(int[] arr, int target){
	    //write your code here
		Arrays.sort(arr); 
		int leftIndex = 0;
		int rightIndex = arr.length - 1;
		while(leftIndex < rightIndex) {
			if(arr[leftIndex] + arr[rightIndex] < target) {
				leftIndex++;
			} else if(arr[leftIndex] + arr[rightIndex] > target) {
				rightIndex--;
			} else { 
				System.out.println(arr[leftIndex] + ", " + arr[rightIndex]);
				leftIndex++;
				rightIndex--;
			}
		}
	  }
	  public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ;i < n; i++){
	      arr[i] = scn.nextInt();
	    }
	    int target = scn.nextInt();
	    targetSumPair(arr,target);
	  }

}

