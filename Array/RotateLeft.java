package Array;

public class RotateLeft {
	
	public static void main(String[] args) {
		
		int[] a=new int[] {1,2,3,4,5,6,7,8,9,0};
		int n=5;
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		} 
		
		for(int i=0;i<n;i++) {
			int j,x=a[0];
			for (j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[j]=x;
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		} 
		
	}
	
}
