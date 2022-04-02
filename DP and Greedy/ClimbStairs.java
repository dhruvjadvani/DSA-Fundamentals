import java.util.*;
public class ClimbingStairs {
	 public static void main(String[] args) throws Exception {
	        // write your code here
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int cp = countPaths(n, new int[n + 1]);
		 System.out.println(cp);
	    }
	 
	 public static int countPaths(int n, int[] qb) {
		 if(n == 0) {
			 return 1;
		 } else if(n < 0) {
			 return 0;
		 }
		 
		 if(qb[n] > 0) {
			 return qb[n];
		 }
		 
		 int nm1 = countPaths(n - 1, qb);
		 int nm2 = countPaths(n - 2, qb);
		 int nm3 = countPaths(n - 3, qb);
		 int cp = nm1 + nm2 + nm3;
		 
		 qb[n] = cp;
		 return cp;
	 }
}
