package strings;

import java.util.Arrays;

public class CountNameRepeat {
public static void main(String[] args) {
	String str="We joined in Vtalent Company as a Traniee, Vtalent is Very Good company Vtalent provides many services.";
	String[] s=str.split(" ");
	String s1="Vtalent";
	int count=0;
	System.out.println(Arrays.toString(s));
	for(int i=0;i<s.length;i++) {
		if(s[i].contentEquals(s1)) {
			count++;
		}
	}
	System.out.println("Vtalent:-"+count);
}
}
