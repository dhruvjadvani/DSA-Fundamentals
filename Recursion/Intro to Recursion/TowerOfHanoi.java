import java.util.*;
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();   // no of disk
		int t1d = scn.nextInt(); // tower 1
		int t2d = scn.nextInt(); // tower 2
		int t3d = scn.nextInt(); // tower 3
		toh(n, t1d, t2d, t3d);
	}

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n == 0) {  // base case
        	return;
        }
        
       
        toh(n - 1, t1id, t3id, t2id); // will print the instructions to move n - 1 disks from tower t1 to t3 using t2 (* following rules)
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");  
        toh(n - 1, t3id, t2id, t1id); //will print the instructions to move n - 1 disks from tower t3 to t2 using t1 (* following rules)


   }
}
