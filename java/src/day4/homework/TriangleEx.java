package day4.homework;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		/*
		 * 세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성하세요. 
		 * (package :day4.homework, file : TriangleEx) 
		 * 세 변 중 작은 두 변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		 * input 3 integer num :
		 * 1 2 3 
		 * Unable to create triangle.
		 * input 3 integer num :
		 * 2 2 3 
		 * Able to create triangle.
		 * 
		 */
		
		System.out.println("input 3 integer num :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int max = 0;
		
		if(x >= y && x >= z) {
			max = x;
		}
		
		else if(y >= x && y >= z) {
			max = y;
		}
		
		else {
			max = z;
		}
		
		if((x+y+z) - max > max) {			//두 변의 합 > 가장 큰 변 = 삼각형 만들 수 있음.
			System.out.println("Able to create triangle. ");
		}
		else {
			System.out.println("Unable to create triangle.");
		}
	}

}
