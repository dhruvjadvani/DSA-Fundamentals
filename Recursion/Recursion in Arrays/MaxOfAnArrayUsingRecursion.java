import java.util.*;
public class MaxOfAnArrayUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int max = maxOfArray(arr, 0);
		System.out.println(max);
	}
	
	
	public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1) {
        	return arr[idx];
        }
        
        int misa = maxOfArray(arr, idx + 1); 
        
        if(misa > arr[idx]) {
        	return misa;
        } else {
        	return arr[idx];
        } 
    }
}
