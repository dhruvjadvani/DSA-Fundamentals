import java.util.Scanner;

public class PrintDecreasingIncreasingAnotherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		printDecreasingIncreasing(n);
	}
	
	
	public static void printDecreasingIncreasing(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasingIncreasing(n - 1);
		System.out.println(n);
	}
}
