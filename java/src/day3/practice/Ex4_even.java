package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num != 0) System.out.println(num + "은 짝수 입니다. (even number)");
		if(num % 2 == 1) System.out.println(num + "은 홀수 입니다. (odd number)");
		if(num == 0) System.out.println("0입니다. ");
		
		sc.close();
	}

}
