import java.util.*;


public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
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
