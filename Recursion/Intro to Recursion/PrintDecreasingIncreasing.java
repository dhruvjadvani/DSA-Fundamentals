import java.util.*;
public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		printDecreasingIncreasing(n);
	}
	
	public static void printDecreasingIncreasing(int n) {
		printDecreasing(n);
		printIncreasing(n);
	}
	
	public static void printDecreasing(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		printDecreasing(n - 1);
	}
	
	public static void printIncreasing(int n) {
		if(n == 0) {
			return;
		}
		printIncreasing(n - 1);
		System.out.println(n);
	}
	
}
