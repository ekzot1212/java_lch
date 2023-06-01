package day3.homework;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		/**
		 * 성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용 (package :day3.homework, 
		 * file : Ex2_if) 
		 * input gender : M 
		 * Are you a women? man
		 * input gender : W 
		 * Are you a women? woman
		 */
		
		System.out.println("input gender : ");
		Scanner sc = new Scanner(System.in);
		
		
		char ch = sc.next().charAt(0);
		
		if(ch == 'M') {
			System.out.println("Are you a woman?");
			System.out.println("Man");
		}
		
		if(ch == 'W') {
			System.out.println("Are you a woman?");
			System.out.println("Woman");
		}
		
		if((ch != 'M') && (ch != 'W')) {
			System.out.println("성별을 'M' 또는 'W'으로 입력해 주세요");
		}
		
		//		문자열로 받아서 str.equals() 함수 이용하여 출력하기
		
		/*
		String str = sc.next();
		
		if(str.equals("M")) {
			System.out.println("Are you a woman? \nman");
		}
		
		if(str.equals("W")) {
			System.out.println("Are you a woman? \nwoman");
		}
		*/
	}

}
