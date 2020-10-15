package strings;

public class CountVowelConsonant {
public static void main(String[] args) {
	
	String str ="This is a really simple sentence";
	str = str.toLowerCase();
	char[] ch = str.toCharArray();
	int v=0,c=0;
	
	for (int i = 0; i < str.length(); i++) {
		
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			System.out.print(ch[i]);
			v++;
		}
		
	}System.out.println();
	for(int i=0;i<str.length();i++) {
		if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i' && ch[i]!='o' && ch[i]!='u'&&ch[i]!=' '){
			System.out.print(ch[i]);
			c++;
		}
	}
	System.out.println();
	System.out.println("vowels "+v);
	System.out.println("Consonant "+c);
}
}
