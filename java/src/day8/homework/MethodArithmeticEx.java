package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {
/**
 * 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
 * 단, 연산자를 잘못 입력한 경우는 없다고 가정.
 * 0으로 나누는 일은 없다고 가정.
 * 
 * 매개변수 : 두 정수와 산술 연산자 -> int num1, char operator, int num2
 * 리턴타입 : 산술 연산 결과 =>
 * 메서드명 : 
 * @param args
 */
	
	
	public static double sum(int num1, int num2, char op) {
		double res = 0;
		if(op == '+') res = num1 + num2;
		else if(op == '-') res = num1 - num2 ;
		else if(op == '*') res = num1 * num2;
		else if(op == '/') res = (double)num1 / num2 ;
		else if(op == '%') res = num1 % num2 ;
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		
		if(op == '+' || op == '-' || op == '*'|| op == '/'|| op == '%')
		System.out.println(num1 + " " + op + " " +num2+ " = " + sum(num1,num2,op));
		else
		System.out.println("잘못 입력하셨습니다.");
	}

}
