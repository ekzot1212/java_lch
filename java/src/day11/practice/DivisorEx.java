package day11.practice;

import java.util.Scanner;

/*
 * 정수 num의 약수들을 배열에 저장하는 코드를 작성하세요.
 * 약수는 최대 10개까지 저장
 * 12 : 1 2 3 4 6 12
 * 0번지 : 1
 * 1번지 : 2
 * ...
 * 5번지 : 12
 */
public class DivisorEx {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= num ; i++) {
			if(num % i == 0) {
				arr[count] = i;
				count++;
			}
			if(count == arr.length) 
				break;
		}
		
		for(int i = 0 ; i < count ; i ++) {
			System.out.println(i + "번지 : " + arr[i]);
		}
	}

}
