package Patterns;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i+"");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k+"");
			}
			System.out.println();
		}


	}
}
