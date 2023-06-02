package day4.ifex;

import java.util.Scanner;

public class EvenNumberEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 :");
		int num = sc.nextInt();
		if(num%2 == 0 ) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}

}
