		/**
		 * 성적을 입력받아 입력받은 성적이 60점 이상인지 확인하는 코드를 작성하세요.
		 * 예:
		 * input score :
		 * 65
		 * Do you pass 65 points? true
		 * input score :
		 * 45
		 * Do you pass 45 points? false
		 */

package day3.practice;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input score :");
		
		int score = sc.nextInt();
		//		삼항연산자 사용하기
		System.out.println("Do you pass " + score + " points? " + ((score >= 60) ? "pass" : "fail"));
		
		sc.close();
		
	}

}
