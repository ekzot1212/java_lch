package day18.homework;

import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		
		Run run = new Run();
		run.run();
		
		
	}

}

class Run implements ProgramInterface{
	
	Scanner sc= new Scanner(System.in);
	int num1,num2;
	char ch;
	@Override
	public void run() {
		int menu =0;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != 3);
		
	}

	@Override
	public void printMenu() {
		System.out.println("==================");
		System.out.println("1. Input Integer");
		System.out.println("2. Input Operator");
		System.out.println("3. Exit");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			System.out.print("Input Integer : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			break;
		case 2:
			System.out.print("Input Operator : ");
			ch = sc.next().charAt(0);
			
			double result = 0;
			
			if(ch == '+') {result = sum(num1,num2);}
			else if(ch == '-') {result = sub(num1,num2);}
			else if(ch == '*') {result = mul(num1,num2);}
			else if(ch == '%') {result = div(num1,num2);}
			else if(ch == '/') {result = mod(num1,num2);}
			else { System.out.println("Wrong operator !"); }
			System.out.println("Result : " + result);
			break;
		case 3:
			System.out.println("Exit !");
			break;
		default:
				System.out.println("Wrong number !");
		}
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static double div(int num1, int num2) {
		return num1/(double)num2 ;
	}
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	
}