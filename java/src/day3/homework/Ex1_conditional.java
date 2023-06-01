package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		/**
		 * 성별(M:남성,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건 연산자 이용 (package : day3.homework,
		 * file : Ex1_conditional) 
		 * input gender : M 
		 * Are you a women? false
		 * input gender : W 
		 * Are you a women? true
		 * 		 
		 **/
		System.out.println("input gender : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println("Are you a woman? : " + str.equals("W") );
		
		

	}

}
