package strings;

public class AllSubsets {
public static void main(String[] args) {
	
	String str="abcde";
	int len=str.length();
	System.out.println(len);
	String s[] = new String[len*(len+1)/2];
	int temp=0;
	for (int i = 0; i < len; i++) {
		for (int j =i ; j < len; j++) {
			s[temp]=str.substring(i, j+1);
			temp++;
		}
	}
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]);
	}
}
}
