package array;

import java.util.Scanner;

public class Array {

	public static void printArray(int arr[]) {
		System.out.print("[");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + (i==arr.length-1?"" : ", "));
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void printArray(int arr[], int start, int end) {
		System.out.print("[");
		for(int i = start; i<end; i++) {
			if(i >= arr.length) { break; }
			System.out.print(arr[i] + (i==end-1 ? "" : ", "));		// 확인하기@@@@@@@@@@@@@@
		}
		System.out.print("]");
		System.out.println();
	}
	
	/**
	 * 정수 num가 배열의 0번지부터 count개 만큼 확인했을 때 중복된 값이 있는지 없는지 
	 * 알려주는 메서드 있으면 true 
	 * 매개변수 :
	 * 리턴타입 : 
	 * 메서드명 : contains
	 */
	public static boolean contains(int num, int count, int arr[]) {
		int i;
		for (i = 0; i < count; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static int [] createRandomArray(int min, int max, int arr[]) {
		//max가 min보다 작으면 두 수를 교환
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		
		//배열이 생성되어 있지 않아도 임의로 (?)
		if(arr == null) {
			arr = new int[max - min + 1];
		}
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면
		// 1~3 : 3개가 4개짜리 배열에 들어갈 수 없음 (중복없이)
		if(max - min + 1 < arr.length){
			return null;
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
		return arr;

	}
	
	/**
	 * 주어진 배열에 중복된 값이 있는지 없는지 체크
	 * 매개변수 : 배열 = int arr[]
	 * 리턴타입 : 중복여부 boolean
	 * 메서드명 : arrayCheck
	 */
	
	public static boolean arrayCheck(int arr[]) {
		if(arr == null) {
			return false;
		}
		//arr 배열의 다른 번지들끼리 비교해서 같은 값이 있는지 확인하는 반복문
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0 ; j<arr.length ; j++) {
				//같은 번지면 건너 뜀
				if(i==j) {
					continue;
				}
				//다른 번지이고 값이 같으면 중복됨 => true 리턴
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		//반복문이 끝날때까지 중복이 없으면 중복 없음 => false
		return false;
	}
	
	
	/**
	 * 배열에 입력값 받아서 넣기
	 * 매개변수 : 배열의 크기 int
	 * 반환타입 : int[] 배열
	 * 메서드명 : scanArray
	 */
	public static int[] scanArray(int num) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	/**
	 * 정수형 배열이 주어지면 오름차순으로 버블 정렬하는 메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : 없음 -> void
	 * 메서드명 : sort
	 */
	public static void sort(int arr[]) {
		if(arr == null) {
			return;
		}
		for(int i = 0; i<arr.length-1 ; i++) {		// i = 행
			for(int j = 0; j<arr.length-1-i ; j++) {		// j = 열
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr [j] = arr[j+1];
					arr [j+1] = tmp;
				}
			}
		}
		
		
	}

}








