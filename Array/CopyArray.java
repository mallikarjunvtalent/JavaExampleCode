package Array;

public class CopyArray {
	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5};
		int a2[] =new int[a1.length];
		
		//coping a1 to a2
		for (int i = 0; i < a1.length; i++) {
			a2[i]=a1[i];
		}
		
		System.out.println("a1 array");
		for (int i : a1) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("a2 array");
		for (int i : a2) {
			System.out.print(i);
		}

	}
}
