package Array;

public class LargestElement_array {
	public static void main(String[] args) {
		
		int a[]= {22,10,44,2,33,55,33,21,99};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}
