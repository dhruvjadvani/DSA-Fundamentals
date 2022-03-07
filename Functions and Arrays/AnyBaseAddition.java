import java.util.*;
public class AnyBaseAddition {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt(); // base
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getSum(b, n1, n2);
	      System.out.println(d);
	}
	
	public static int getSum(int b, int n1, int n2){
	      
			int sum = 0;
			int carry = 0;
			int power = 1;
			while(n1 > 0 || n2 > 0 || carry > 0) {
				int digOne = n1 % 10;
				int digTwo = n2 % 10;
				n1 = n1 / 10;  
				n2 = n2 / 10;
				
				int digit = digOne + digTwo + carry;
				carry = digit / b; 
				digit = digit % b;
				
				sum = sum + (digit * power);
				power = power * 10; 
				
			}
			
			return sum;
	   }

}
