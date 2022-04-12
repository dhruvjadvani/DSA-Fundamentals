import java.io.*;
import java.util.*;

public class ArrangeBuildings{

	public static void main(String[] args) throws Exception {
	    // write your code here
		Scanner scn = new Scanner(System.in);
		long n = scn.nextInt();
		
		long oldBuildings = 1;
		long oldSpaces = 1;
		
		for(long i = 2; i <= n; i++) {
			long newBuilding = oldSpaces;
			long newSpace = oldSpaces + oldBuildings;
			
			oldSpaces = newSpace;
			oldBuildings = newBuilding;
		}
		
		long total = oldSpaces + oldBuildings;
		total = total * total;
		
		System.out.println(total);
	 }

}
