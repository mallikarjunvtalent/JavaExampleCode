package strings;

public class CountCharacter {
	
	public static void main(String[] args) {
		String str="hello world";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("no. of letters "+count+" length of the string "+str.length());
	}
	
}
