package Array;

public class DuplicateElement {
	public static void main(String[] args) {
		
		int[] a= {1,5,2,2,10,11,13,10,3,4,1,3,5};
		System.out.println("original");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("duplicate");
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
		
	}
}
