import java.util.*
public class LearnLinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		queue.offer(48);
		queue.offer(60);
		queue.offer(72);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue.peek());
	}

}

