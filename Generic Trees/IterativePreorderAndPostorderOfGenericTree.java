import java.util.*;
import java.io.*;

public class IterativePreorderAndPostorderOfGenericTree {
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
	  
	  static class Pair {
		  Node node;
		  int state;
		  
		  Pair(Node node, int state) {
			  this.node = node;
			  this.state = state;
		  }
	  }

	  public static void IterativePreandPostOrder(Node node) {
	    // write your code here
		  Stack<Pair> st = new Stack<>();
		  st.push(new Pair(node, -1));
		  
		  String pre = "";
		  String post = "";
		  
		  while(st.size() > 0) {
			  Pair top = st.peek();
			  if(top.state == -1) { // pre order -> add in pre order and increase the state
				  pre = pre + top.node.data + " ";
				  top.state++;
			  } else if(top.state == top.node.children.size()) { // post order -> add in post order and pop from the stack
				  post = post + top.node.data + " ";
				  st.pop();
			  } else { //0 to children.size()-1 between ->  then push the child and increase the state
				  Pair childPair = new Pair(top.node.children.get(top.state), -1);
				  st.push(childPair);
				  
				  top.state++;
			  }
		  }
		  
		  System.out.println(pre);
		  System.out.println(post);
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
	    IterativePreandPostOrder(root);
	  }
}
