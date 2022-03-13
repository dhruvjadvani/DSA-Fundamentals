import java.util.*;
public class ToggleCaseOfCharactersInAString {
	
	public static String toggleCase(String str){
		//write your code here
		StringBuilder sb = new StringBuilder(str); 
		
		for(int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') { 
				char upperCh = (char)('A' + ch - 'a'); 
				sb.setCharAt(i, upperCh); 
			} else if(ch >= 'A' && ch <= 'Z') { 
				char lowerCh = (char)('a' + ch - 'A'); 
				sb.setCharAt(i, lowerCh); 
			}
		}

		return sb.toString(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
