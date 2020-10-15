package strings;

public class Strings {
	
	/*
	 *     Why string objects are immutable in java? 
	 * 
	 * Because java uses the concept of
	 * string literal.Suppose there are 5 reference variables,all referes to one
	 * object "sachin".If one reference variable changes the value of the object, it
	 * will be affected to all the reference variables. That is why string objects
	 * are immutable in java.
	 */
	
	public static void main(String[] args) {
		String s="abc";
		s=s.concat("defg");
		s.concat("ghi");
		String s1=s,s2=s,s3=s,s4=s,s5=s;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		
		StringBuffer sb= new StringBuffer("abc");
		sb.append("ABC");
		StringBuffer sb1=sb,sb2=sb;
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		
	}
}
