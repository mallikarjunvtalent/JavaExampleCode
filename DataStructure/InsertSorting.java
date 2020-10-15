package DataStructure;

import java.util.Arrays;

public class InsertSorting {

	public static void main(String[] args) {
		
		int[] a = {9,10,7,5,1,6,2,4,3};
		
		int temp,j;
		for (int i = 1; i < a.length; i++) {
			
			temp=a[i];
			j=i;
			while (j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
}
