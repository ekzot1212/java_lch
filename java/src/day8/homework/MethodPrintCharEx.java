package day8.homework;

import java.util.Scanner;

public class MethodPrintCharEx {
	/**
	 * 다음과 같이 출력하기 위한 코드를 작성하세요. 하나의 메서드로. ***** *** ????? ^^^^^
	 */
	public static void printChar(char ch, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(ch);
		}
	}
	/**문자열이 주어지면 주어진 문자열을 출력하고 줄바꿈 하는 메서드
	 * 매개변수 :String str
	 * 리턴타입 :없음
	 * 메서드명 :
	 */
	 
	/**문자와 개수가 주어지면 주어진 문자를 개수만큼 출력하는 메서드
	 * 매개변수 :
	 * 리턴타입 :없음
	 * 메서드명 :
	 */
	
	/**문자와 개수, 마지막 문자가 주어지면 주어진 문자를 개수만큼 출력하고 마지막 문자를 출력하는 메서드.
	 * 매개변수 :
	 * 리턴타입 : 출력된 문자열 -> String
 	 * 메서드명 :
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자와 반복할 횟수 입력 :");
		char ch = sc.next().charAt(0);
		int num = sc.nextInt();
		
		printChar(ch, num);
		
		
		int num2 = 5;
		for(int i = 1; i<=num2 ; i++) {
			printChar(' ', num2-i);
			printChar('*', i);
			System.out.println();
			
		}
		
	}

}
