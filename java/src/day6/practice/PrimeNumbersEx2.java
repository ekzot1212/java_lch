package day6.practice;

import java.util.Scanner;

public class PrimeNumbersEx2 {

	public static void main(String[] args) {

		int count = 0;

		for (int num = 2; num <= 100; num++) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(num + " ");
			}
			count = 0;
		}
	}

}
