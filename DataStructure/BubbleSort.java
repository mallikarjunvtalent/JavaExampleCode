package DataStructure;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {99,11,33,45,211,1,555,5,2,4,3};
		int temp;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
}
