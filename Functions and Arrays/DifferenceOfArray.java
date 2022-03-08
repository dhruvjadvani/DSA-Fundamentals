import java.util.*;

public class DifferenceOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}
		
		int n2 = scn.nextInt();  
		int[] a2 = new int[n2];
		
		for(int j = 0; j < a2.length; j++) {
			a2[j] = scn.nextInt();
		}
		
		int[] diff = new int[n2];
		int carry = 0;
		
		int i = a1.length - 1; 
		int j = a2.length - 1;
		int k = diff.length - 1;
		
		while (k >= 0) {
			int digit = 0;
			int a1Value = (i >= 0 ? a1[i] : 0); 
			
			if(a2[j] + carry >= a1Value) {  
				digit = a2[j] + carry - a1Value;
				carry = 0;
			} else { 
				digit = a2[j] + carry + 10 - a1Value;
				carry = -1;
			}
			
			diff[k] = digit;
			
			i--;
			j--;
			k--;
		}
		
		int idx = 0;
		while(idx < diff.length) { 
			if(diff[idx] == 0) {
				idx++;
			} else {
				break;
			}
		}
		
		while(idx < diff.length) {
			System.out.println(diff[idx]);
			idx++;
		}
		
	}

}
