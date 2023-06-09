package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {
	
	/**
	 * num가 주어지면 num가 짝수인지 홀수인지 출력하는 메서드
	 * @param num : 판별할 정수
	 * @return : 없음 (void)
	 * 메서드명 : evenNumber
	 */
	
	
	public static void evenNumber(int num) {
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
	
	/**
	 * num1과 num2가 주어지면 num1 % num2 를 알려주는 메소드
	 * 매개변수  :   (int num1, int num2)
	 * 리턴 타입 : 정수
	 * 메서드명  : mod
	 * @param args
	 */
	
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	/**
	 * num가 주어지면 num가 짝수인지 홀수인지 알려주는 메서드
	 * 매개변수 : num
	 * 리턴타입 : 짝수인지 홀수인지 (true,false)
	 * 메서드명 : isEvenNumber
	 * @param args
	 */
	
	public static boolean isEvenNumber(int num1) {
		return num1 % 2 ==0;
	}
	/**
	 * num1과 num2가 주어지면 num1이 num2의 배수인지 아닌지 알려주는 메서드
	 * 매개변수 : num1, num2
	 * 리턴타입 : boolean
	 * 메서드명 : isMultiple
	 * @param args
	 */
	
	public static boolean isMultiple(int num1, int num2) {
		return (num1 % num2 == 0);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		evenNumber(i);
		
		if(mod(i,2) == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
		if(isEvenNumber(i)) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		if(isMultiple(i, 2)) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}

}
