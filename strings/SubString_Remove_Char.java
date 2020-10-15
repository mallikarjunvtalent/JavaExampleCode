package strings;

public class SubString_Remove_Char {
	
	public static void main(String[] args) {
		
		String str ="India is my country";
		System.out.println(remove(str,5));
	}

	private static String remove(String str, int i) {

		return str.substring(0,i)+str.substring(i+1);
	}
}
