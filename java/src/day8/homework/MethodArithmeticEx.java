package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {
/**
 * 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
 * 단, 연산자를 잘못 입력한 경우는 없다고 가정.
 * 0으로 나누는 일은 없다고 가정.
 * @param args
 */
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static int sum2(int num1, int num2) {
		return num1-num2;
	}
	public static int sum3(int num1, int num2) {
		return num1*num2;
	}
	public static double sum4(double num1, int num2) {
		return num1/num2;
	}
	public static int sum5(int num1, int num2) {
		return num1%num2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		if(op == '+')
			System.out.println(sum(num1, num2));
		else if(op == '-')
			System.out.println(sum2(num1, num2));
		else if(op == '*')
			System.out.println(sum3(num1, num2));
		else if(op == '/')
			System.out.println(sum4(num1, num2));
		else if(op == '%')
			System.out.println(sum5(num1, num2));
		else
			System.out.println("잘못 입력하셨습니다.");
	}

}
