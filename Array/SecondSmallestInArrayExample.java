package Array;

public class SecondSmallestInArrayExample {
	public static int getSecondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return a[1];// 2nd element because index starts from 0
	}

	public static void main(String args[]) {
		int a[] = { 1,0, 2, 5, 6, 3, 2, -1, 10, 6, 5 };

		System.out.println("Second smallest: " + getSecondSmallest(a, 11));

	}
}