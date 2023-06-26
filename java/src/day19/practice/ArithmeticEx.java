package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력했을 때 연산 결과를 출력하는 코드를 작성하세요. 예외처리도 추가 */
		
		Scanner sc= new Scanner(System.in);
		
		//두 정수와 산술연산자 입력
		System.out.println("Input (ex : 1 + 2) :");
		try {
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		//연산자에 따른 결과를 출력
		
		switch (op) {
		case '+':
			System.out.println("" + num1 + op + num2 + "=" +(num1 + num2));
			break;
		case '-':
			System.out.println("" + num1 + op + num2 + "=" +(num1 - num2));
			break;
		case '*':
			System.out.println("" + num1 + op + num2 + "=" +(num1 * num2));
			break;
		case '/':
			System.out.println("" + (double)num1 + op + num2 + "=" +(num1 / num2));
			break;
		case '%':
			System.out.println("" + num1 + op + num2 + "=" +(num1 % num2));
			break;
		default:
			System.out.println("Not operator!");
			}
		}catch(InputMismatchException e) {
			System.out.println("Wrong Input!");
		}catch(ArithmeticException e) {
			System.out.println("Not operator!");
		}
		catch(Exception e) {			//큰 범위의 에러를 마지막에 넣어야함.
			System.out.println("not operator!");
		}
		System.out.println("EXIT !");

		sc.close();
		
		test1();
		test2();

	}
	public static void test1() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception!!!!!");
			return;
		}finally {					//finally는 리턴을 하더라도 반드시 들려서 실행을 함.
			System.out.println("Method1 EXIT!!");
		}
	}
	public static void test2() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception!!!!!");
			return;
		}
		System.out.println("Method2 EXIT!!");
	}
	
	
	
	

}
