package day4.practice;

import java.util.Scanner;

public class IfScoreEx {

	public static void main(String[] args) {
		/*
		 * 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90~100 : A
		 * 80~89 : B
		 * 70~79 : C
		 * 60~69 : D
		 * 60 미만 : F
		 * 0 보다 작거나 100보다 큰 경우 : wrong score
		 */
		
		System.out.println("점수를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("wrong score");
		}
		else if(score >= 90) {
			System.out.println("A 입니다.");
		}
		else if(score >= 80) {
			System.out.println("B 입니다.");
		}
		else if(score >= 70) {
			System.out.println("C 입니다.");
		}
		else if(score >= 60) {
			System.out.println("D 입니다.");
		}
		else {
			System.out.println("F 입니다.");
		}
		
		sc.close();
	}
	
	
}
