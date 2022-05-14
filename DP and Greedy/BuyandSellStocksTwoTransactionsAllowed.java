import java.io.*;
import java.util.*;

public class BuyandSellStocksTwoTransactionsAllowed {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		
		int mpist = 0; 
		int leastsf = arr[0]; 
	
		int[] dpLeft = new int[n]; 
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < leastsf) {
				leastsf = arr[i];
			}
			
			mpist = arr[i] - leastsf; 
			
			
			if(mpist > dpLeft[i - 1]) { 
				dpLeft[i] = mpist;
			} else { 
				dpLeft[i] = dpLeft[i - 1];
			}
		}
		
		int mpibt = 0; 
		int maxsf = arr[arr.length - 1];
		int[] dpRight = new int[n];
		
		for(int i = arr.length - 2; i >= 0; i--) {
			if(arr[i] > maxsf) {
				maxsf = arr[i];
			}
			
			mpibt = maxsf - arr[i]; 
			
			if(mpibt > dpRight[i + 1]) { 
				dpRight[i] = mpibt;
			} else { 
				dpRight[i] = dpRight[i + 1];
			}
		} 
		
		
		int[] sum = new int[n];
		int maxProfitInculdingBothTransaction = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum[i] = dpLeft[i] + dpRight[i]; 
			
			if(sum[i] > maxProfitInculdingBothTransaction) {
				maxProfitInculdingBothTransaction = sum[i];
			}
		} 
		
		
		System.out.println(maxProfitInculdingBothTransaction);
    }

}
