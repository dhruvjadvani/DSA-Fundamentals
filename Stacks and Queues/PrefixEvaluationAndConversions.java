import java.util.*;
import java.io.*;
public class PrefixEvaluationAndConversions {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    Stack<Integer> value = new Stack<>();
	    Stack<String> postfix = new Stack<>();
	    Stack<String> infix = new Stack<>();
	    
	    for(int i = exp.length() - 1; i >= 0; i--) {
	    	char ch = exp.charAt(i);
	    	
	    	if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	    		int v1 = value.pop();
	    		int v2 = value.pop();
	    		int val = operation(v1, v2, ch);
	    		value.push(val);
	    		
	    		String postV1 = postfix.pop();
	    		String postV2 = postfix.pop();
	    		String postVal = postV1 + postV2 + ch;
	    		postfix.push(postVal);
	    		
	    		String inV1 = infix.pop();
	    		String inV2 = infix.pop();
	    		String inVal = "(" + inV1 + ch + inV2 + ")";
	    		infix.push(inVal);
	    		
	    	} else {
	    		value.push(ch - '0');
	    		postfix.push(ch + "");
	    		infix.push(ch + "");
	    	} 
	    }
	    
	    System.out.println(value.pop());
	    System.out.println(infix.pop());
	    System.out.println(postfix.pop());
	 }
	
	public static int operation(int v1, int v2, char op) {
		if(op == '+') {
			return v1 + v2;
		} else if(op == '-') {
			return v1 - v2;
		} else if(op == '*') {
			return v1 * v2;
		} else {
			return v1 / v2;
		}
	}
}
