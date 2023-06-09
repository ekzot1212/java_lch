package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {
	/**
	 * 매개변수
	 * 반환타입
	 * 메서드명
	 * @param num
	 */
	public static void whatSeason(int month) {
		
		
	}
	
	/**
	 * 월이 주어지면 주어진 월에 맞는 계절을 알려주는 메서드
	 * 매개변수 : 월 -> int
	 * 리턴타입 : 계절 -> String 
	 * 메서드명 : getSeasom
	 * @param args
	 */
	
	public static String getSeason(int month) {
		if(month >= 3 && month <= 5) {
			return "Spring";
		}
		else if(month >= 6 && month <= 8) {
			return "Summer";
		}
		else if(month >= 9 && month <= 11) {
			return "fall";
		}
		else if(month == 12 || month >= 1 && month <= 2) {
			return "Winter";
		}
		else {
			return "wrong number";
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		//whatSeason(month);
	System.out.println(getSeason(month));
	}

}
