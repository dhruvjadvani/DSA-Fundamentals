import java.util.*;
import java.io.*;
public class PostfixEvaluationsandConversions  {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    // code
	    Stack<Integer> value = new Stack<>();
	    Stack<String> infix = new Stack<>();
	    Stack<String> prefix = new Stack<>();
	    
	    for(int i = 0; i < exp.length(); i++) {
	    	char ch = exp.charAt(i);
	    	
	    	//if ch is operator then do this
	    	if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	    		int v2 = value.pop();
	    		int v1 = value.pop();
	    		int val = operation(v1, v2, ch);
	    		value.push(val);
	    		
	    		String inV2 = infix.pop();
	    		String inV1 = infix.pop();
	    		String iVal = "(" + inV1 + ch + inV2 + ")";
	    		infix.push(iVal);
	    		
	    		String preV2 = prefix.pop();
	    		String preV1 = prefix.pop();
	    		String preVal = ch + preV1 + preV2;
	    		prefix.push(preVal);
	    	} else { 
	    		value.push(ch - '0'); 
	    		infix.push(ch + ""); 
	    		prefix.push(ch + ""); 
	    	}
	    	
	    	
	    }
	    
	    
	    
	    System.out.println(value.pop());
	    System.out.println(infix.pop());
	    System.out.println(prefix.pop());
	    
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
