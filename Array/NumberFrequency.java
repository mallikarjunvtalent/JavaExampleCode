package Array;

public class NumberFrequency {
	
	public static void main(String[] args) {
		
		int[] a= {1, 2, 8, 3, 5,0,3,2,7,8,8,8,2, 2, 2, 5, 1};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		 int count[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			count[i]=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count[i]++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1) {
				System.out.print(a[i]+"---"+count[i]+",");
			}
		}
		
		
	}
	
}
