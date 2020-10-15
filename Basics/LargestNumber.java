package Basics;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		
		int[] a = {1,4,6,56,8,3,5,30};
		
		Arrays.sort(a);
		
	//	System.out.println(Arrays.toString(a));
		
		int b=getLargest(a,a.length);
		
		System.out.println("Largest in asc: "+b);
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<b) {
				sum=sum+a[i];
			}
		}
		
		System.out.println(sum);
		if(sum>=b) {
			
			if(sum==b) {
				System.out.println("sum of all no. except large  and largest no. in array  both are equal");
			}else {
				System.out.println("sum of all no. except large is greaterthan the largest no. in array ");
			}
			
		}else {
			System.out.println("condition fails");
		}
		
	}

	
	
	private static int getLargest(int[] a, int length) {
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		return a[length-1];
	}
	
}
