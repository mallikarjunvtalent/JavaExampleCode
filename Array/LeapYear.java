package Array;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter year");
		int year = scanner.nextInt();
		
		boolean leap=false;
		
		if(year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					leap=true;
				}else {
					leap=false;
				}
			} else {
				leap=true;
			}
		}else {
			leap= false;
		}
		
		if (leap=true) {
			System.out.println(year+" it is leap year");
		}else {
			System.out.println(year+" it is not leap year");
		}
		
	}
	
}
