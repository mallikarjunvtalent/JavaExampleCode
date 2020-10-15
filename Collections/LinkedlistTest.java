package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistTest {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,5,7,1,4);
		
		System.out.println(list);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>(list);
		
		System.out.println(linkedList);
		
		Collections.sort(linkedList);
		System.out.println(linkedList);
		
		Collections.reverse(linkedList);
		System.out.println(linkedList);
		
		
	}
}
