import java.util.*;
public class AnyBaseSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt(); // 8
	      int n1 = scn.nextInt(); // 256  
	      int n2 = scn.nextInt(); // 1212 n2 > n1 in input
	  
	      int d = getDifference(b, n1, n2);
	      System.out.println(d);
	}
	
	
	public static int getDifference(int b, int n1, int n2){
	       
			int sub = 0;
			int carry = 0; 
			int power = 1;
			while(n2 > 0) { 
				int digOne = n1 % 10;
				int digTwo = n2 %  10;
				
				n1 = n1 / 10;
				n2 = n2 / 10;
				
				int dig = 0;
				digTwo = digTwo + carry;
				
				if(digTwo >= digOne) { 
					carry = 0;
					dig = digTwo - digOne;
				} else { 
					carry = -1;
					dig = digTwo + b - digOne;
				}
				
				sub = sub + dig * power;
				power = power * 10;
			}
			
			return sub;
		
	   }
	

}
