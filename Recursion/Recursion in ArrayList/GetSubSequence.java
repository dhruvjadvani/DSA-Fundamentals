import java.util.*;
public class GetSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next(); 
		
		
		ArrayList<String> result = gss(str);
		System.out.println(result);
	}
	
	
	
	public static ArrayList<String> gss(String str) {
		
		if(str.length() == 0) { 
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		
		
		char ch = str.charAt(0); 
		
		
		String ros = str.substring(1); 
		
		
		ArrayList<String> rres = gss(ros); 
		
		
		ArrayList<String> mres = new ArrayList<>();
		
		for(String rstr : rres) {
			mres.add("" + rstr);	
		}
		
		for(String rstr : rres) {
			mres.add(ch + rstr);
		}
		
		return mres;
	
	}

}
