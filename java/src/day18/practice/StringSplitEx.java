package day18.practice;

import java.util.Scanner;

public class StringSplitEx {

	
	/* 문장을 입력받아 단어의 개수를 출력하는 코드를 작성하세요.
	 * input : Hi. my name is hong.
	 * word : 3
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input : ");
		String str = sc.nextLine();
		String word[] = str.split(" ");
		
		System.out.println("word : " + word.length);
		
	}

}
