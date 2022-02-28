import java.util.*;

public class InverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt(); //21453
		
		int originalPlace = 1;  //
		int inverse = 0;
		
		
		while (num > 0) {
			int rem = num % 10;
			int originalDigit = rem; //  originalDigit equals to reminder 
			int invertedDigit = originalPlace; 
			int invertedPlace = originalDigit; 
			
			//make change to inverse using invertedPlace and invertedDigit
			
			
			inverse = inverse + invertedDigit * (int)Math.pow(10, invertedPlace - 1);
			int quo = num / 10; 
			num = quo; // update the num as quotient
			originalPlace++;
		}	
		System.out.println(inverse);
	}

}
