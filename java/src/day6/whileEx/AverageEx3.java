package day6.whileEx;

import java.util.Scanner;

public class AverageEx3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char conti = 'y';
		while (conti != 'n') {

			System.out.println("국어, 영어, 수학 성적을 순서대로 입력하시오.");
			int korea = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();

			double avg = ((double) korea + eng + math) / 3;
			System.out.println("성적 평균은 " + avg + " 입니다.");
			conti = 'n';
			System.out.println("continue? (y/n)");
			conti = sc.next().charAt(0);
		}
	}

}
