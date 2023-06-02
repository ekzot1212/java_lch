package day4.practice;

import java.util.Scanner;

public class IfMultipleEx2 {

	public static void main(String[] args) {
		/*
		 * 정수 num을 입력받아 num이 2의 배수이면 2의 배수라고 출력하고, 
		 * 3의 배수이면 3의 배수라고 출력하고,
		 * 6의 배수이면 6의 배수라고 출력하고, 2,3,6의 배수가 
		 * 아니면 2,3,6의 배수가 아니라고 출력하는 코드를 작성하세요.
		 * 
		 * 예 : 
		 * 6은 6의 배수
		 */
		
		System.out.println("정수를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 6 == 0) {
			System.out.println(num + " 은 6의 배수입니다.");
		}
		else if(num % 3 == 0) {
			System.out.println(num + " 은 3의 배수입니다.");
		}
		else if(num % 2 == 0) {
			System.out.println(num + " 은 2의 배수입니다.");
		}
		else {
			System.out.println(num + " 은 2, 3, 6 의 배수가 아닙니다.");
		}
		sc.close();
	}
	
	
}
