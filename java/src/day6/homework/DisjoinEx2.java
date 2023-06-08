package day6.homework;

import java.util.Scanner;

public class DisjoinEx2 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요.
		// input 2 numbers : 3 4
		//Disjoint!
		//Not disjoint!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 numbers : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = 1;
		
		for(int i = 1 ; i <= num1 ; i++) {
			if(num1 % i == 0) {
				if(num2 % i == 0) {
					gcd = i;
				}
			}
		}
		if(gcd == 1) {
			System.out.println("Disjoint !");
		}
		else{
			System.out.println("NOT Disjoint !");
		}
	}

}
