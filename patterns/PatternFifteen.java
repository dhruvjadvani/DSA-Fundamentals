import java.util.Scanner;

public class PatternFifteen {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n / 2;
        int star = 1;
        int val = 1;
        
        for(int i = 1; i <= n; i++){ 
            for(int j = 1; j <= space; j++){ 
                System.out.print("\t");
            }
            
            int cVal = val;
            for(int j = 1; j <= star; j++){  
            	System.out.print(cVal + "\t");  
                if(j <= star/2) {
                	cVal++;  
                }else {
                	cVal--;
                }
            }

            if(i <= n/2){
                space--;
                star = star + 2;
                val++;
            } else{
                space++;
                star = star - 2;
                val--;
            }
 
            System.out.println();
            
        }

	}

}
