import java.util.*;
public class BestTimeToBuyAndSellStockInfiniteTransactionAllowed {
	public static void main(String[] args) throws Exception {
        
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); //no of days
		 
		int[] arr = new int[n]; //prices of n days stored in this array
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int BuyingDate = 0;
		int sellingDate = 0;
		int profit = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] >= arr[i - 1]) {
				sellingDate++;
			} else {
				profit = profit + arr[sellingDate] - arr[BuyingDate];
				BuyingDate =sellingDate = i;
			}
		}
		profit = profit + arr[sellingDate] - arr[BuyingDate];
		System.out.println(profit);
		
		
    }
}
