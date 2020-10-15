package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(char i='A';i<='E';i++) {
			for (char j = 'A'; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
}
