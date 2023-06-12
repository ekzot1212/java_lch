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
	
	public static void printMonth(int month) {
		switch(month) {
		case 1: System.out.println("January");	break;
		case 2: System.out.println("February");	break;
		case 3: System.out.println("March");	break;
		case 4: System.out.println("April");	break;
		case 5: System.out.println("May");	break;
		case 6: System.out.println("June");	break;
		case 7: System.out.println("July");	break;
		case 8: System.out.println("August");	break;
		case 9: System.out.println("September");	break;
		case 10: System.out.println("October");	break;
		case 11: System.out.println("November");	break;
		case 12: System.out.println("December");	break;
		default : System.out.println("Wrong month !");
		}
	}
	
	
	
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
		printMonth(month);
	}

}
