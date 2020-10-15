package strings;

import java.util.Arrays;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String str ="Hello he is my insperstion";
		
		str=str.replaceAll(" ", "");
		System.out.println(str);
		
		String[] string = new String[str.length()];
		
		int len= str.length();
		
		for (int i = 0; i < len; i++) {
			
				
				string[i] = str.substring(i, i+1);
				System.out.print(string[i]);
		}
		
		System.out.println();
		
		String str1 ="Hello he is my insperstion";
		for (char c : str1.toCharArray()) {
	        if (c != ' ')
	            System.out.print(c);
	    }
		
	}
}
