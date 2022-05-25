import java.util.*;
import java.io.*;
public class InfixEvaluation {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();
	    
	    Stack<Integer> operands = new Stack<>();
	    Stack<Character> operators = new Stack<>();
	    for(int i = 0; i < exp.length(); i++) {
	    	char ch = exp.charAt(i);
	    	
	    	if(ch == '(') {
	    		operators.push(ch);
	    	} else if(Character.isDigit(ch)) {
	    		operands.push(ch - '0'); // converting char to int
	    	} else if(ch == ')') {
	    		while(operators.peek() != '(') {
	    			char operator = operators.pop();
	    			int v2 = operands.pop();
	    			int v1 = operands.pop();
	    			
	    			int operationValue = operation(v1, v2, operator);
	    			operands.push(operationValue);
	    		}
	    		
	    		operators.pop();
	    		
	    	} else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	    		while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
	    			char operator = operators.pop();
	    			int v2 = operands.pop();
	    			int v1 = operands.pop();
	    			
	    			int operationValue = operation(v1, v2, operator);
	    			operands.push(operationValue);
	    		}
	    		
	    		operators.push(ch);
	    	}
	    }
	    
	    while(operators.size() != 0) {
			char operator = operators.pop();
			int v2 = operands.pop();
			int v1 = operands.pop();
			
			int operationValue = operation(v1, v2, operator);
			operands.push(operationValue);
		}
	    
	    System.out.println(operands.peek());
	    
	 }
	
	public static int precedence(char operator) {
		if(operator == '+') {
			return 1;
		} else if(operator == '-') {
			return 1;
		} else if(operator == '*') {
			return 2;
		} else {
			return 2;
		}
	}
	
	
	public static int operation(int v1, int v2, char operator) {
		if(operator == '+') {
			return v1 + v2;
		} else if(operator == '-') {
			return v1 - v2;
		} else if(operator == '*') {
			return v1 * v2;
		} else {
			return v1 / v2;
		}
	}
}
