package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {
/**
 * 성적을 입력받아 학점을 출력하는 코드를 작성하세요.
 * 
 * @param args
 */
	
	public static String score(int score) {
		if(score >= 90)
			return "A";
		else if(score > 80)
			return "B";
		else if(score > 70)
			return "C";
		else if(score > 60)
			return "D";
		else if(score > 50)
			return "E";
		else
			return "F";
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		System.out.println("학점은 " + score(score) + " 입니다.");
	}

}
