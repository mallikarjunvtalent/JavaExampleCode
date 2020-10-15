package java8;

public class TestDefaultMethod {

	public static void main(String[] args) {
		
		
		Sim s ;
//				s=new Idea() {
//			public void calling() {
//				System.out.println("calling from inner class");
//			}
//		};
		
		s= ( i) ->
				{
				System.out.println(i+" calling from lamda expression "+i);
				System.out.println(i+i+" calling from lamda expression "+i+i);
			
		};
		s.calling(5);
	
	}
	
}
