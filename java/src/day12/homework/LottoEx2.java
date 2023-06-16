package day12.homework;

import java.util.Scanner;

import array.Array;

/*
 * 로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를
 * 작성하세요. (1~45)
 * 1등 : 번호 6개
 * 2등 : 번호 5개 + 보너스
 * 3등 : 번호 5개
 * 4등 : 번호 4개
 * 5등 : 번호 3개
 * 꽝
 * number : [1, 3, 40, 23, 24, 45]		//컴퓨터는 숫자 7개
 * bonus : 2
 * user  : 1 3 40 23 24 2				//사용자는 6개
 * 2등 입니다.
 * 
 * number : [1, 3, 40, 23, 24, 45]
 * user : 1 2 3 4 5 6
 * 꽝
 */

/**
 * 주어진 배열에 중복된 값이 있는지 없는지 체크
 * 매개변수 : 배열 = int arr[]
 * 리턴타입 : 중복여부 boolean
 * 메서드명 : arrayCheck
 */

public class LottoEx2 {

	public static void main(String[] args) {
		//랜덤으로 로또번호 6개와 보너스 번호 1개를 생성
		//7개짜리 배열에 로또 번호를 생성하고, 앞에 6개는 로또번호, 마지막 1개는 보너스 번호
		int lotto[] = new int[7];		//랜덤숫자를 받을 배열
		Array.createRandomArray(1, 45, lotto);
		//마지막 1개는 보너스로
		int bonus = lotto[6];
		int lotto2[] = new int[6];		
		//앞에 6개는 로또번호
		System.arraycopy(lotto, 0, lotto2, 0, 6);
		
		//로또 번호 정렬
		Array.sort(lotto2);
		System.out.println("number : ");
		Array.printArray(lotto2);
		System.out.println("bonus : " + bonus);
		
		//사용자가 번호를 6개 입력
		Scanner sc = new Scanner(System.in);
		int user[] = new int[6];
		
		System.out.println("user : ");
		user= Array.scanArray(6);
		
		//중복 입력하면 판별을 XX
		if(Array.arrayCheck(user)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		//등수 판별
		int count = count(lotto2,user);
		printResult(count, Array.contains(bonus, user.length, user));
		sc.close();
		
		
		
		
	}
	/**
	 * 로또 번호와 사용자 번호가 주어지면 몇개가 같은지 알려주는 메서드
	 * 매개변수 : int lotto[], int user[]
	 * 리턴타입 : 몇개 같은지 = int
	 * 메서드명 : count
	 */
	public static int count(int lotto[], int user[]) {
		int count=0;
		if(user == null || lotto == null) {
			return 0;
		}
		for (int i = 0; i < 6; i++) {
			if (Array.contains(lotto[i], 6, user)) {
				count++;
			}
		}
		return count;
		
	}
	
	/**
	 * 일치하는 개수와 보너스번호와 사용자 번호가 일치하는 여부를 알려주면
	 * 등수를 출력하는 메서드
	 * 매개변수 : 일치하는 개수, 보너스 번호와 일치 여부
	 * 			-> int count, boolean checkBonus
	 * 리턴타입 : void
	 * 메서드명 : printResult
	 */
	
	public static void printResult(int count, boolean checkBonus) {
		switch(count) {
		case 6:
			System.out.println("1등");
			break;
		case 5:{
			if(checkBonus)
				System.out.println("2등");
			else
				System.out.println("3등");
		}
			break;
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		default:
			System.out.println("낙첨되었습니다.");
		}
	}
}









