package Patterns;

public class Pattern5 {
	public static void main(String[] args) {
		int n=4,z=1;
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<z;k++) {
				System.out.print(z-k+" ");
			}
			z++;
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
}
