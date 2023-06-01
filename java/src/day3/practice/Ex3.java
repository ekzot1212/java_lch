package day3.practice;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		//음수, 양수를 판별하는 코드
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num==0) {
			System.out.println("0 입니다.");
		}
		
		if(num > 0) {
			System.out.println(num + "은 양수입니다.");
		}
		
		if(num < 0) {
			System.out.println(num + "은 음수입니다.");
		}
		
		sc.close();
	}

}
