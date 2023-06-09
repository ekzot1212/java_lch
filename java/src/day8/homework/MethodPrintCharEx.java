package day8.homework;

import java.util.Scanner;

public class MethodPrintCharEx {
	/**
	 * 다음과 같이 출력하기 위한 코드를 작성하세요. 하나의 메서드로. ***** *** ????? ^^^^^
	 * 
	 * @param args
	 */
	public static void printChar(char ch, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자와 반복할 횟수 입력 :");
		char ch = sc.next().charAt(0);
		int num = sc.nextInt();
		
		printChar(ch, num);
		
	}

}
