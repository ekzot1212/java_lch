package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {
/**
 * 월을 입력받아 월에 맞는 영어를 출력하세요.
 * 예:
 * input month :
 * 3
 * March
 * 
 * @param args
 */
	public static String getMonth(int month) {
		if(month == 1)
			return "January" ;
		if(month == 2)
			return "February" ;
		if(month == 3)
			return "March" ;
		if(month == 4)
			return "April" ;
		if(month == 5)
			return "May" ;
		if(month == 6)
			return "June" ;
		if(month == 7)
			return "July" ;
		if(month == 8)
			return "August" ;
		if(month == 9)
			return "September" ;
		if(month == 10)
			return "October" ;
		if(month == 11)
			return "November" ;
		if(month == 12)
			return "December" ;
		else {
			return "Wrong month";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month :");
		int month = sc.nextInt();
		System.out.println(getMonth(month));
	}

}
