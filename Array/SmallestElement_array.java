package Array;

public class SmallestElement_array {
	public static void main(String[] args) {
		
		int a[]= {22,101,44,2,33,55,33,21,99};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
	}
}
