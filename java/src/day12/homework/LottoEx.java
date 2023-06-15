package day12.homework;

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
		int arr[] = new int[7];
		Array.createRandomArray(1, 45, arr);
		Array.printArray(arr);
	}

}
