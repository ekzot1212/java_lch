package day4.practice;

import java.util.Scanner;

public class IfScoreEx2 {

	public static void main(String[] args) {
		/*
		 * 홀짝 판별 예제를 조건 연산자를 이용하여 작성.
		 */
		
		System.out.println("숫자를 입력하세요. :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수 입니다." : "홀수 입니다.");
		
		sc.close();
	}
	
	
}
