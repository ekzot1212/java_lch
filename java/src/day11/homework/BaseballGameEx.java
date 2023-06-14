package day11.homework;

import java.util.Scanner;

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


public class BaseballGameEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		int s = 0;
		int b = 0;
		
		createRandomArray(1, 9, arr1);
		printArray(arr1);
		System.out.println();
		
		//arr2 배열 입력받기
		for(int i =0; i < arr2.length ; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		
		
		for (int i = 0; i < 3; i++) {

			if(contains(arr2[i], 3, arr1)) {
				if(arr2[i] == arr1[i]) {
					s++;
				}
				else {
					b++;
				}
			}
			
		}
		if(s != 0 || b != 0) {
			System.out.println(s + "S " + b + "B");
			
		}
		else {
			System.out.println("30");
		}
	}

	
	/** 정수 num가 배열의 0번지부터 count개 만큼 확인했을 때 중복된 값이 있는지
	 *  없는지 알려주는 메서드 있으면 true
	 *  매개변수 :
	 *  리턴타입 :
	 *  메서드명 : contains
	 */
	public static boolean contains(int num, int count, int arr[]) {
		int i;
		for(i=0; i<count; i++) {
			if(num == arr[i]) {
				return true;
			}
		} 
		return false;
	}
	
	
	
	public static void createRandomArray(int min, int max, int arr[]) {
		//배열이 생성되어 있지 않으면(배열이 null이면)
		if(arr == null) {
			return;
		}
		
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면
		// 1~3 : 3개가 4개짜리 배열에 들어갈 수 없음 (중복없이)
		if(max - min + 1 < arr.length){
			return;
		}
		//랜덤한 수 중복없이 채워넣기
		int count = 0;
		while(count < arr.length) {
			int random = (int) (Math.random() * (max - min + 1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
			if(!contains(random, count, arr)) {
				arr[count] = random;
				count++;
			}
		}

	}
	
	public static void printArray(int arr[]) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
