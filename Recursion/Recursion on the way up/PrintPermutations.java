import java.io.*;
import java.util.*;

public class PrintPermutations{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String asf) {
       if(ques.length() == 0){
           System.out.println(asf);
           return;
       }
       
        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i);
            String qLpart = ques.substring(0, i);
            String qRpart = ques.substring(i + 1);
            String roq = qLpart + qRpart;
            printPermutations(roq,  asf + ch);
        }
    }

}
