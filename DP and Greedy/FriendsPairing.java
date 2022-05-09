import java.io.*;
import java.util.*;

public class FriendsPairing {

   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      if (n <= 2) {
         System.out.println(n);
         return;
      }

      long[] arr = new long[n + 1];
      arr[0] = 0;
      arr[1] = 1;
      arr[2] = 2;

      for (int i = 3; i <= n; i++) {
         arr[i] = arr[i - 1] + (i - 1) * arr[i - 2];
      }

      System.out.println(arr[n]);
   }

}


                        


                        
