package day6.whileEx;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		/*
		 * 두 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 */
		
		System.out.println("두 수를 입력하시오.");
		int i = 1;
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = 0;
		while(i <= num2) {
			if(num1 % i == 0) {
				if(num2 % i == 0) {
					gcd = i;
				}
			}
			i++;
		}
		
		System.out.println("두 수의 GCE는 : " + gcd);
		
	}

}
