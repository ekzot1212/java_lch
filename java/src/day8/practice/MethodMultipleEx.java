package day8.practice;

import java.util.Scanner;

/**
 * 정수 num을 입력받아 2,3,6의 배수인지 아닌지 판별하는 코드를 작성하세요
 * 매개변수 : num
 * 리턴타입 : void
 * 메서드명 : isMultiple
 * @author user1
 *
 */

public class MethodMultipleEx {
	
	public static void isMultiple(int num) {
		if(num % 6 == 0) {
			System.out.println("6의 배수");
		}
		else if(num % 3 == 0) {
			System.out.println("3의 배수");
		}
		else if(num % 2 == 0) {
			System.out.println("2의 배수");
		}
		else {
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		}
		
	}
	
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		int num = sc.nextInt();
		isMultiple(num);
		
		if(mod(num,6) == 0)
			System.out.println("6의 배수");
		else if(mod(num,6) == 3)
			System.out.println("3의 배수");
		else if(mod(num,2) == 0)
			System.out.println("2의 배수");
		else 
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		
		//MethodEvenNumberEx.isMultiple(1, 2)
		
	}

}
