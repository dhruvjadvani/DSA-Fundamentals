import java.util.*;
public class SumOfArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n1= scn.nextInt();
		int[] a1 = new int[n1];
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}
		
		int n2 = scn.nextInt();
		int[] a2 = new int[n2];
		
		for(int j = 0; j < a2.length; j++) {
			a2[j] = scn.nextInt();
		}
		
		int MaxOfSizeArray = (n1 > n2 ? n1 : n2);
		int[] sum = new int[MaxOfSizeArray];
		int carry = 0;
		
		int i = a1.length - 1; 
		int j = a2.length - 1; 
		int k = sum.length - 1; 
		
		
		while(k >= 0) { 
			int digit = carry;
			
			if(i >= 0) { 
				digit = digit + a1[i];
			}
			
			if(j >= 0 ) {
				digit = digit + a2[j];
			}
			
			carry = digit / 10;  
			digit = digit % 10;  
			
			sum[k] = digit;
			
			i--; 
			j--;
			k--;
			
		}
		
		
		if(carry != 0) { 
			System.out.println(carry);
		}
		
		for(int val : sum) {   
			System.out.println(val);
		}
		
	}

}
