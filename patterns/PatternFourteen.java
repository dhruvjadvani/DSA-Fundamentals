import java.util.*;

public class PatternFourteen {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//int inc = 1;
		for(int i = 1; i <= 10; i++) {
			int mul = n * i;
			System.out.println( n + " * " + i + " = " + mul);
			//inc++;
		}
	}

}
