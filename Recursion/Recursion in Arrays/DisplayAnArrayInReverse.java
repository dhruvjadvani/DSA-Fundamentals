import java.util.*;
public class DisplayAnArrayInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		displayArrReverse(arr, 0);
		
	}
	
	
	public static void displayArrReverse(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		
		displayArrReverse(arr, idx + 1);
		System.out.println(arr[idx]);
    }

}
