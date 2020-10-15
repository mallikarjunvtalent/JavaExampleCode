package DataStructure;

import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
	
		int[] a = {5,2,4,3};
		int min,temp=0;
		
		for (int i = 0; i < a.length; i++) {
			
			min=i;
			
			for (int j =i+1; j < a.length; j++) {
				
				if (a[j] < a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
