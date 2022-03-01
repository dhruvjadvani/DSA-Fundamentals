import java.util.*;
public class GcdAndLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int numOne = scn.nextInt();
		int numTwo = scn.nextInt();
		
		int originalNumOne = numOne;
		int originalNumTwo = numTwo;
		
		while(numOne % numTwo != 0) {
			int rem = numOne % numTwo;
			numOne = numTwo;
			numTwo = rem;
		}
		
		int gcd = numTwo;
		int lcm = (originalNumOne * originalNumTwo) / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);

	}

}
