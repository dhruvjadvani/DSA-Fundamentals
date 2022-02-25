import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here
      Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    //1. count number of digits
    
    int nod=0;
    int num=n;
    while(num!=0){
        num=num/10;
        nod++;
    }
    
    //2. set values of divisor --> 10^(NumOfDigits-1)
    
    int div=(int)Math.pow(10, nod-1);
    
    //3. 
    
    while(div>0){
        int q=n/div;
         n=n%div;
        System.out.println(q);
        div=div/10;
    }

    
    
  }
}
