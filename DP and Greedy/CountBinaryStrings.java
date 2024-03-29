
import java.util.*;
public class CountBinaryStrings {
	public static void main(String[] args) throws Exception {
	    // write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] dp0 = new int[n + 1];
		int[] dp1 = new int[n + 1];
		
		dp0[1] = 1;
		dp1[1] = 1;
		
		for(int i = 2; i < dp1.length; i++) {
			dp1[i] = dp1[i - 1] + dp0[i - 1];
			dp0[i] = dp1[i - 1];
		}
		
		System.out.println(dp1[n] + dp0[n]);
	 }
}

