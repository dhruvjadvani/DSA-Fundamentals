import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		//c2 = a2 + b2
		int aSquare = a * a;
		int bSquare = b * b;
		int cSquare = c * c;
		
		if(a > b && a > c) {
			if(aSquare == (bSquare + cSquare)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}			
		} else if (b > a && b > c) {
			if(bSquare == (aSquare + cSquare)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if(cSquare == (aSquare + bSquare)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

   }
  }
