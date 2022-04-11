import java.util.Scanner;

public class CountBinaryStringsAlt {
	public static void main(String[] args) throws Exception {
	    // write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int oczeros = 1;
		int ocones = 1;
		
		for(int i = 2; i <= n; i++) {
			int nczeros = ocones;
			int ncones = oczeros + ocones;
			
			ocones = ncones;
			oczeros = nczeros;
			
		}
		
		System.out.println(oczeros + ocones);
		
	}
}

