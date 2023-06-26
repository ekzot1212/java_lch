package day19.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {
/*
 * 산술연산하는 메서드를 만들고 테스트하는 코드를 작성하세요 단, 예외처리 이용.
 */
	public static void main(String[] args) {
		ArithmeticEx ex = new ArithmeticEx();
		
		try {
		ex.runMenu();
		}catch(InputMismatchException e){
			System.out.println("Wrong input");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Error");
		}
		
	}
	
	
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	double res;
	char op;
	
	
	public void runMenu() {
		int menu;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				inputNumber();
				break;
			case 2:
				inputOprator();
				break;
			case 3:
				System.out.println("Exit !");
				break;
			default:
				System.out.println("Wrong menu");
				return;
			}
		}while(menu != 3);
	}
	
	private void inputOprator() {
		System.out.println("Input Operator : ");
		op = sc.next().charAt(0);
		calculator();
	}

	private void inputNumber() {
		System.out.println("Input 2 integer : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
	}

	private void printMenu() {
		System.out.println("1. input Integer");
		System.out.println("2. input Operator");
		System.out.println("3. Exit");
	}

	public void calculator() {
		
		switch (op) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1*num2;
			break;
		case '/':
			res = (double)num1/num2;
			break;
		case '%':
			res = num1%num2;
			break;
		default:
			System.out.println("Wrong Operater");
			return;
		}
		System.out.println("" + num1 + op + num2 + "=" +res );
	}

}

//예외 처리 해야 할 것
/*
 * 연산자 잘못 입력
 * 숫자랑 연산자 순서 잘못 입력		InputMismatchException
 * 1 / 0					ArithmeticException
 * 1 % 0
 * try{
 * 
 */
