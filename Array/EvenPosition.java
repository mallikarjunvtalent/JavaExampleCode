package Array;

public class EvenPosition {
	public static void main(String[] args) {

		int a[] = { 1, 1,2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("even position");
		
		for (int i = 1; i < a.length; i=i+2) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("even numbers");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]);
			}
		}
	}
}
