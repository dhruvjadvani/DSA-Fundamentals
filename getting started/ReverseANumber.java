import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int x= scn.nextInt();
        while(x!=0){
            int r=x%10;
            System.out.println(r);
            x=x/10;
        }
        
    }
   }
