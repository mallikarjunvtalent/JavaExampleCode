package Basics;

import java.util.Arrays;

public class StringToAscii {
	public static void main(String[] args) {
		
		String text = "ABCDEFGHIJKLMNOP";
		byte[] bytes = text.getBytes();
		 System.out.println(Arrays.toString(bytes));
		
		 int convert;
		 for (int i = 0; i < text.length(); i++) {
			convert=text.charAt(i);
			System.out.print(convert+",");
		}
		 
		 
	}
}
