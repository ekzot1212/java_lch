package day11.homework;

import java.util.Scanner;

import array.Array;

/*
 * 숫자 야구 게임을 구현하세요.
 * 1~9 사이의 중복되지 않은 세 수를 맞추는 게임.
 * 규칙 :
 * B : 같은 숫자가 있지만 위치가 다름
 * S : 같은 숫자가 있고 위치가 같음
 * 30 : 일치하는 숫자가 하나도 없음.
 * 
 * 예:
 * 랜덤 숫자 : 1 9 5
 * 사용자 : 1 2 3
 * 1S
 * 사용자 : 4 5 6
 * 1B
 * 사용자 : 1 2 9
 * 1S1B
 * 사용자 : 2 3 4
 * 30
 * 사용자 : 1 9 5
 * 3S
 * Good!
 */


public class BaseballGameEx2 {

	public static void main(String[] args) {
		// 숫자 야구 게임
		int com[] = new int[3];		//computer
		int user[] = new int[3];	//user
		int min = 1, max = 9;
		int s =0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		// 맞춰야 할 숫자 3개를 랜덤으로 생성(중복 x)
		Array.createRandomArray(min, max, com);
		Array.printArray(com); 
		
		do {
			// 사용자가 숫자 3개를 입력
			System.out.print("user : ");
			for(int i = 0 ; i < user.length ; i++) {
				user[i] = sc.nextInt();
			}
			// 사용자 입력 체크
			if(Array.arrayCheck(user)) {
				System.out.println("값을 중복되지 않게 입력하시오.");
				continue;
			}
			// 판별
			s = 0;
			b = 0;
			// 스트라이크 개수 판별
			s = strike(com, user);
			// 볼의 개수 판별
			b = ball(com,user);
			// 스트라이크와 볼의 개수에 맞게 출력
			printResult(s,b);
			
		}while(s < 3);
		
		System.out.println("Good !");
		
	}
	
	/**
	 * 스트라이크 개수를 판별하는 메서드
	 * => 두 배열에서 같은 번지에 있는 값들이 몇개 같은지 알려주는 메서드
	 * 매개변수 : 두 배열
	 * 반환타입 : int 개수
	 * 메서드명 : strike
	 */
	
	public static int strike(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 1라도 있으면 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int size = (arr1.length < arr2.length) ? arr1.length : arr2.length;
		int count = 0; // 스트라이크 개수
		for(int i = 0 ; i < size ; i++) {
			//같은 번지에 있는 값들이 서로 같으면 (스트라이크)
			if(arr1[i] == arr2[i]) {
				count++;
			}
		} 
		return count;
	}
	
	/**
	 * 볼 개수를 판별하는 메서드
	 * => 두 배열에서 다른 번지에 있는 값들이 몇개 같은지 알려주는 메서드
	 * 매개변수 : 두 배열
	 * 반환타입 : int 개수
	 * 메서드명 : ball
	 */
	
	public static int ball(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 1라도 있으면 비교할 수 없어서 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		//다른 번지를 비교해서 찾아도 되지만
		//두 배열에서 같은 숫자의 개수 - 스트라이크 개수 = 볼의 개수
		
		for(int tmp : arr1) {
			// 배열1에서 꺼낸 값이 arr2에 있으면 개수를 증가
			if(Array.contains(tmp, arr1.length, arr2)){
				count++;
			}
		}
		return count - strike(arr1, arr2);
	
	}
	
	
	public static int ball2(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 1라도 있으면 비교할 수 없어서 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		//다른 번지를 비교해서 찾아도 되지만
		//두 배열에서 같은 숫자의 개수 - 스트라이크 개수 = 볼의 개수
		
		int size = (arr1.length < arr2.length) ? arr1.length : arr2.length;
		
		// 정석 코드
		for (int i = 0; i < size; i++) {
			for (int index = 0; index < size; index++) {
				if (index != i) {
					continue;
				}
				if (arr1[index] == arr2[i]) {
					count++;
				}

			}
		}
		return count;

	}
	/**
	 * 출력하는 메서드
	 * @param s
	 * @param b
	 */
	public static void printResult(int s, int b) {
		if(s != 0) {
			System.out.print(s + "S");
		}
		if(b != 0) {
			System.out.print(b + "B");
		}
		if(s == 0 && b == 0) {
			System.out.print("3O");
		}
		System.out.println();
	}
	

}
