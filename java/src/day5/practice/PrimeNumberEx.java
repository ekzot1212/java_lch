package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 1;
		int count = 0;
		
		while (i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}

		if (count == 2) {
			System.out.println(num + " 는 소수입니다.");
		} 
		else {
			System.out.println(num + " 는 소수가 아닙니다.");
		}
	}
}
