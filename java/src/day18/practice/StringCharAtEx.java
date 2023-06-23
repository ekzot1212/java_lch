package day18.practice;

import java.util.Scanner;

/* 영문 소문자로 된 문자열을 입력받아 알파벳이 각각 몇개 있는지 확인하는 코드를 작성하세요. */
// a-z까지 모두 출력 0개는 출력안함
/*
 * d : 1
 * e : 1
 * h : 1
 * 
 */

public class StringCharAtEx {

	public static void main(String[] args) {
		
		/* str.charAt(int) 사용해서 출력 */
		String str = "asflasjfklajsflkasfjlk";
		char ch ;
		int count =0;

		for (char j = 'a'; j <= 'z'; j++) {
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == j)
					count++;
			}
			if (count != 0) {
				System.out.println(j + " : " + count);
			}
			count = 0;
		}
		
		printAlphabet();
		
	}
	
	public static void printAlphabet() {
		Scanner sc = new Scanner(System.in);
		int alphabet[] = new int[26];
		
		System.out.println("input : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			//ch가 알파벳 소문자인 경우 0~25 의 값이 나옴
			int distance = ch - 'a';
			if(distance < 0 || distance > 25) {
				continue;
			}
			//맞는 경우
			alphabet[distance]++;
		}
		//알파벳 갯수 추가
		for(int i = 0; i < alphabet.length; i++) {
		
			if(alphabet[i] == 0) {
				continue;
			}
			System.out.println((char)('a'+i) + " : " + alphabet[i]);
		
		}
		
	}

}














