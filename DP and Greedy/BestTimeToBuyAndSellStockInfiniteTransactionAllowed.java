import java.util.*;
public class BestTimeToBuyAndSellStockInfiniteTransactionAllowed {
	public static void main(String[] args) throws Exception {
        // write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); 
		 
		int[] arr = new int[n]; 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int BuyingDip = 0;
		int sellingHigh = 0;
		int profit = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] >= arr[i - 1]) {
				sellingHigh++;
			} else {
				profit = profit + arr[sellingHigh] - arr[BuyingDip];
				BuyingDip =sellingHigh = i;
			}
		}
		
		System.out.println(profit);
		
    }
}
