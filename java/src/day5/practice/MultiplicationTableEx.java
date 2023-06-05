package day5.practice;

import java.util.Scanner;

public class MultiplicationTableEx {

	public static void main(String[] args) {

		System.out.println("출력할 단수의 시작과 끝을 입력하시오. :");
		Scanner sc = new Scanner(System.in);
		int su = 1;
		int dan = sc.nextInt();
		int danEnd = sc.nextInt();

		while (dan <= danEnd) {
			while (su <= 9) {
				System.out.println(dan + " x " + su + " = " + (dan * su));
				su++;
			}
			System.out.println("============");
			dan++;
			su = 1;
		}
		
	}

}
