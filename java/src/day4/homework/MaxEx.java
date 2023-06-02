package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("더 큰수는 " + num1 + " 입니다.");
		}
		else if(num1 == num2) {
			System.out.println("두 수가 같습니다.");
		}
		else {
			System.out.println("더 큰수는 " + num2 + " 입니다.");
		}
	}

}
