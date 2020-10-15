package Array;

import java.util.Arrays;

public class ThirdLargestInArrayExample {
	public static int getThirdLargest(int[] a, int total) {
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
			System.out.print(a[i]+" ");
		}
		return a[total -3];
		
	}

	public static void main(String args[]) {
		int a[] = { 1,1, 2, 5, 6, 3, 2,9 };
		
		System.out.println("Third Largest: " + getThirdLargest(a, 6));
int[] i={1,5,8,26,7};
		
		int large=i[0];
		int small=i[0];
		for(int j=1;j<i.length;j++){
			if(i[j]>large){
				large=i[j];
			}else if(i[j]<small){
				small=i[j];
			}
		}
		System.out.println("int values:-"+Arrays.toString(i));
		System.out.println("larger no.:-"+large);
		System.out.println("smaller no.:-"+small);
	}
}