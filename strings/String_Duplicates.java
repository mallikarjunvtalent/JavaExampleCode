package strings;

import java.util.Scanner;

public class String_Duplicates {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter first string");
	String s1= scanner.next();
	System.out.println("enter second string");
	String s2= scanner.next();
	String s="";
	System.out.println(s1.length()+"   "+s2.length());
	
	for (int i = 0; i < s1.length(); i++) {
		for (int j = 0; j < s2.length(); j++) {
			if(s1.charAt(i)==s1.charAt(j)) {
				s=s+s1.charAt(i);
			}
		}
	}
	System.out.println(s+" strings");
	for (int i = 0; i < s.length(); i++) {
		String str=s.charAt(i)+"";
		s1=s1.replace(str, "");
		s2=s2.replace(str, "");
	}
	System.out.println(s1+"  "+s2);
}
}
