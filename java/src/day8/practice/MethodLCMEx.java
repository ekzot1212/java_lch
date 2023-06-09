package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {
	/**
	 * 정수 num1과 num2를 입력받아 두 정수의 최소 공배수를 구하는 코드
	 * 
	 * @param args
	 */

	// 배수인가?
	public static boolean mod(int num1, int num2) {
		return num1 % num2 == 0;
	}

	// 최대 공약수
	public static int GCD(int num1, int num2) {
		for (int i = num1; i >= 1; i--) {
			if (mod(num1, i) && mod(num2, i)) {
				return i;
			}
		}
		return 1;
	}

	// 최소 공배수
	public static int LCM(int num1, int num2) {
		return num1 * num2 / GCD(num1, num2);
	}
	
	public static int LCM2(int num1, int num2) {
		for (int i = num1; i<= num1 * num2; i += num1) {
			//공배수를 찾음. mod는 배수를 찾는 메서드이고,
			//i가 num1의 배수들이기 때문에 i가 num2의 배수이면 num1과
			//num2의 공배수가 됨
			if(mod(i, num2)) {
				return i;
			}
		}
		return num1*num2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("최소 공배수는 " + LCM(num1, num2) + "입니다.");
		System.out.println("최소 공배수는 " + LCM2(num1, num2) + "입니다.");
		
	}

}
