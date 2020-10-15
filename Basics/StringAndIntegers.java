package Basics;

import java.util.Arrays;

public class StringAndIntegers {
	public static void main(String[] args) {
		
		String str = "db32c1a";
		
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		
		String s = new String(ch);
		
		System.out.println(s+" "+str);
		
		
		
		
	}
}
