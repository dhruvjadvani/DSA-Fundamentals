import java.io.*;
import java.util.*;

public class InfixConversionsModular{
  

public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();
	    
	    Stack<String> postfix = new Stack<>();
	    Stack<String> prefix = new Stack<>();
	    Stack<Character> operators = new Stack<>();
	    
	    for(int i = 0; i < exp.length(); i++) {
	    	char ch = exp.charAt(i);
	    	
	    	if(ch == '(') {
	    		operators.push(ch);
	    	} else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	    		postfix.push(ch + ""); // converting char to String
	    		prefix.push(ch + ""); // converting char to String
	    	} else if(ch == ')') {
	    		while(operators.peek() != '(') {
	    			process(operators, postfix, prefix);
	    		}
	    		
	    		operators.pop();
	    		
	    		
	    	} else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	    		while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
	    			process(operators, postfix, prefix);
	    		}
	    		
	    		operators.push(ch);
	    	}
	    		
	    }
	    
	    while(operators.size() > 0) {
	    	process(operators, postfix, prefix);
		}
	    
	    
	    System.out.println(postfix.pop());
	    System.out.println(prefix.pop());
	}
	
	public static void process(Stack<Character> operators, Stack<String> postfix, Stack<String> prefix) {
		char op = operators.pop();
		String postv2 = postfix.pop();
		String postv1 = postfix.pop();
		String postv = postv1 + postv2 + op;
		postfix.push(postv);
		
		String prev2 = prefix.pop();
		String prev1 = prefix.pop();
		String prev =  op + prev1 + prev2;
		prefix.push(prev);
	}
	
	public static int precedence(char operator) {
		if(operator == '+' || operator == '-') {
			return 1;
		} else if(operator == '*' || operator == '/') {
			return 2;
		} else {
			return 0; 
		}
	}
}
