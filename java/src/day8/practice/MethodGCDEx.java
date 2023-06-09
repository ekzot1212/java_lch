package day8.practice;

import java.util.Scanner;

public class MethodGCDEx {

	/**
	 * 매개변수 : int num1, int num2
	 * 리턴타입 : 최대공약수 -> int
	 * 메서드명 : GCD
	 * @param num1
	 * @param num2
	 */
	
	
	public static boolean mod(int num1, int num2) {
		return num1 % num2 == 0;
	}
	
	public static int GCD2(int num1, int num2) {
		int gcd = 0;
		
		for (int i = num1; i >= 1; i--) {
			if(mod(num1, i) && mod(num2,i)) {
				return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하시오.");

		int i = sc.nextInt();
		int j = sc.nextInt();

		System.out.println(GCD2(i, j));
	}

}
