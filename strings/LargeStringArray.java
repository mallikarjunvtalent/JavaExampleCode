package strings;

import java.util.Arrays;
import java.util.Collections;

public class LargeStringArray {

	public static void main(String[] args) {
		
		String[] string = {"g", "e", "h", "k","s", "f", "o", "r","a", "t", "d", "z", "m"};
		
		System.out.println("Largest in asc: "+getLargest(string,string.length));
		System.out.println("Largest in dse: "+getLargestdse(string,string.length));
		
	}

	private static String getLargestdse(String[] string, int length) {
		
		Arrays.sort(string, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(string));
		
		return string[0];
	}

	private static String getLargest(String[] string, int length) {
		
		Arrays.sort(string);
		
		System.out.println(Arrays.toString(string));
		
		return string[length-1];
	}
	
}
