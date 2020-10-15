package java8;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5,6,7,8);
		for (Integer integer : list) {
			System.out.print(integer);
		}
		
		list.forEach(i-> System.out.println(i));
	}
	
}
