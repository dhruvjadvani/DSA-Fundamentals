import java.util.*;
import java.io.*;

public class DiameterOfGenericTree {
	private static class Node {
	    int data;
	    ArrayList<Node> children = new ArrayList<>();
	  }

	  public static void display(Node node) {
	    String str = node.data + " -> ";
	    for (Node child : node.children) {
	      str += child.data + ", ";
	    }
	    str += ".";
	    System.out.println(str);

	    for (Node child : node.children) {
	      display(child);
	    }
	  }

	  public static Node construct(int[] arr) {
	    Node root = null;

	    Stack<Node> st = new Stack<>();
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] == -1) {
	        st.pop();
	      } else {
	        Node t = new Node();
	        t.data = arr[i];

	        if (st.size() > 0) {
	          st.peek().children.add(t);
	        } else {
	          root = t;
	        }

	        st.push(t);
	      }
	    }

	    return root;
	  }
	  
	 
	  static int diameter = 0;
	  
	  
	  static int calculateDiaReturnHeight(Node node) {
		  int deepestChildHeight = -1;
		  int secondDeepestChildHeight = -1;
		  
		  for(Node child: node.children) {
			  int childHeight = calculateDiaReturnHeight(child);
			  if(childHeight > deepestChildHeight) { 
				  secondDeepestChildHeight = deepestChildHeight;
				  deepestChildHeight  = childHeight;
			  } else if(childHeight > secondDeepestChildHeight) { 
				  secondDeepestChildHeight = childHeight;
			  }
		  }
		  
		  if(deepestChildHeight + secondDeepestChildHeight + 2 > diameter) { 
			  diameter = deepestChildHeight + secondDeepestChildHeight + 2;
		  }
		  
		  deepestChildHeight = deepestChildHeight + 1; 
		  return deepestChildHeight; 
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int[] arr = new int[n];
	    String[] values = br.readLine().split(" ");
	    for (int i = 0; i < n; i++) {
	      arr[i] = Integer.parseInt(values[i]);
	    }

	    Node root = construct(arr);
	    calculateDiaReturnHeight(root);
	    System.out.println(diameter);
	    // write your code here
	  }
}

