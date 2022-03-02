import java.util.Scanner;

public class PatternEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();  
		
		
		for(int i = 1; i <= n; i++) { 
			for(int j = 1; j <= n; j++) { 
				if(i + j == 6) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
