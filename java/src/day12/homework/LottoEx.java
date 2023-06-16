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

public class LottoEx {

	public static void main(String[] args) {
		int count=0;
		//랜덤으로 로또번호 6개와 보너스 번호 1개를 생성
		//7개짜리 배열에 로또 번호를 생성하고, 앞에 6개는 로또번호, 마지막 1개는 보너스 번호
		int arr1[] = new int[7];		//랜덤숫자를 받을 배열
		int arr2[] = new int[6];		//입력받을 배열 선언
		Array.createRandomArray(1, 45, arr1);
		Array.printArray(arr1);
		
		//사용자가 번호를 6개 입력
		arr2 = Array.scanArray(6);
		
		//중복 입력하면 판별을 XXX
		if(Array.arrayCheck(arr2)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		//등수 판별 (count = 맞춘 갯수)
		for (int i = 0; i < 6; i++) {
			if (Array.contains(arr1[i], 6, arr2)) {
				count++;
			}
		}
		if(count ==6) System.out.println("1등");
		else if(count ==5 && Array.contains(arr1[6], 6, arr2)) System.out.println("2등");
		else if(count ==5) System.out.println("3등");
		else if(count ==4) System.out.println("4등");
		else if(count ==3) System.out.println("5등");
		else System.out.println("꽝");
		
		
		
		
	}
}
