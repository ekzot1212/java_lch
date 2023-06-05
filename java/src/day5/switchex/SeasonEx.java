package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		/*
		 * 3,4,5 봄
		 * 6,7,8 여름
		 * 9,10,11 가을
		 * 12,1,2 겨울
		 */

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch (month) {
		case 3, 4, 5:
			System.out.println(month + "월은 봄 입니다.");
			break;

		case 6, 7, 8:
			System.out.println(month + "월은 여름 입니다.");
			break;

		case 9, 10, 11:
			System.out.println(month + "월은 가을 입니다.");
			break;

		case 12, 1, 2:
			System.out.println(month + "월은 겨울 입니다.");
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
