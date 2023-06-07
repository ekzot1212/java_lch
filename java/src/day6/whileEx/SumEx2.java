package day6.whileEx;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int sum = 0;
		while(n >= i) {
			if(i % 2 == 0) {
			sum += i;
			}
			i++;
		}
		
		System.out.println(sum);
		
	}

}
