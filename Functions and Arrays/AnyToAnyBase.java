import java.util.*;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	     int  destBase= scn.nextInt();
	     int d = getValue(n, sourceBase, destBase);
	     
	     System.out.println(d);
	}
	
	public static int getValue(int n, int b1, int b2) {
		int dec = getValueIndecimal(n, b1);
		int decToAny = getValueInBase(dec, b2);
		
		return decToAny;
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
	
	public static int getValueInBase(int n, int b){
	       // write code here
		 int temp = n;
		 int rem = 0;
		 int quo = 0;
		 int pow = 1;
		 int newNum = 0;
		 while(temp > 0) { 
			 rem = temp % b; 
			 quo = temp / b; 
			 temp = quo;  
			 newNum = newNum + (rem * pow); 
			 pow = pow * 10; 
		 }
		 
		 return newNum;
		 
	   }

}
