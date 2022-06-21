import java.util.*;
public class LearnLinkedListArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.add(4);
		System.out.println(list);
		
		list.add(1, 50);
		System.out.println(list);
		
	}

}

