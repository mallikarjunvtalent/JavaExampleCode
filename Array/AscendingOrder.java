package Array;

public class AscendingOrder {

	public static void main(String[] args) {

		int a[] = { 22, 101, 44, 2, 33, 55, 33, 21, 99 };
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
