package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요. 
		 * (package : day4.homework, file :ScoreAverageEx) 성적은 정수.
		 * 
		 */
		
		System.out.println("국어, 영어, 수학 성적을 순서대로 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int korea = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		double avg = ((double)korea + eng + math)/3 ;
		System.out.println("성적 평균은 " + avg + " 입니다.");
		
	}

}
