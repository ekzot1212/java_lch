package day7.practice;

import java.util.Scanner;

public class LCMEx2 {

	public static void main(String[] args) {

		// 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int LCM;

		for (int i = num1;; i += num1) {

			if (i % num2 == 0) {
				LCM = i;
				break;
			}
		}
		System.out.println("LCM : " + LCM);
	}

}
