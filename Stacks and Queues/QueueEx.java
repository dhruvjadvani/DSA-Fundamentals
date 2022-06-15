import java.util.*;
public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> que = new ArrayDeque<>();
		
		que.add(10);
		System.out.println(que);
		
		que.add(20);
		System.out.println(que);
		
		que.add(30);
		System.out.println(que);
		
		que.add(40);
		System.out.println(que);
		
		que.add(50);
		System.out.println(que);
		
		System.out.println(que.remove());
		System.out.println(que);
		
		System.out.println(que.remove());
		System.out.println(que);
		
	}

}

