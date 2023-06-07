package day6.practice;

import java.util.Scanner;

public class PrimeNumbersEx {

	public static void main(String[] args) {

		int num;
		int i = 1;
		int count = 0;

		for (num = 2; num <= 100; num++) {
			while (i <= num) {
				if (num % i == 0) {
					count++;
				}
				i++;
			}
			i = 1;

			if (count == 2) {
				System.out.print(num + " ");
			}
			count = 0;
		}
	}

}
