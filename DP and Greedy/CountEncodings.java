import java.io.*;
import java.util.*;

public class CountEncodings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println(printEncodings(scn.nextLine(), ""));
    }
    
    public static int printEncodings(String s, String ans) {
        if (s.length() == 0) {
            // System.out.println(ans);
            return 1;
        }
        int count = 0;
        int n1 = Integer.parseInt(s.substring(0, 1));
        if (n1 == 0) return 0;
        count += printEncodings(s.substring(1), ans + (char)('a' + n1 - 1));
        
        if (s.length() > 1) {
            int n2 = Integer.parseInt(s.substring(0, 2));
            if (n2 < 26) 
                count += printEncodings(s.substring(2), ans + (char)('a' + n2 - 1));
        }
        return count;
    }
}
 
