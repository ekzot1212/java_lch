package day18.homework;

import java.util.Scanner;

public class ArithmeticEx1 implements Program1 {
	int num1, num2;
	double res;
	char op;
	Scanner sc = new Scanner(System.in);

	public void run() {
		
		System.out.println("Input 2 Integer : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(" Input Operator : ");
		op = sc.next().charAt(0);
		
		switch (op) {
		case '+':
			res = num1 + num2;
			break;

		case '-':
			res = num1 - num2;
			break;

		case '*':
			res = num1 * num2;
			break;

		case '/':
			if (num2 == 0) {
				throw new ArithmeticException("It should not be divided by zero."); // 예외를 발생시키기
			}
			res = num1 / (double) num2;
			break;

		case '%':
			if (num2 == 0) {
				throw new ArithmeticException("It should not be divided by zero."); // 예외를 발생시키기 -> 만나면 바로 메서드 리턴
			}
			res = num1 % num2;
			break;

		default:
			System.out.println("Wrong Operater");
			return;
		}
		
		System.out.println("" + num1 + op + num2 + "=" + res);
	}
}