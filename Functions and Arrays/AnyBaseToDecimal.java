import java.util.*;
public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int d = getValueIndecimal(n, b);
	      System.out.println(d);
	}
	
	public static int getValueIndecimal(int n, int b){
	      // write your code here
		
		int temp = n;
		 int rem = 0;
		 int quo = 0;
		 int pow = 1;
		 int decNum = 0;
		 while(temp > 0) {
			 rem = temp % 10;
			 quo = temp / 10;
			 temp = quo;
			 decNum = decNum + (rem * pow);
			 pow = pow * b; 
		 }
		 
		 return decNum;
	   }

}
