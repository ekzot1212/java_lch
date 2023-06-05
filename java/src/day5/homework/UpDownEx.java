package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/*
		 * 1~100사이의 랜덤한 정수를 생성하고,
		 * 이 정수를 맞추는 게임을 구현하세요.
		 * 
		 * 랜덤한 수 : 45
		 * input : 50
		 * Down!
		 * input : 40
		 * Up!
		 * input : 45
		 * Good!
		 */
		
		int min = 1, max = 10;
		double random = (int)Math.random() * (max - min +1) + min;
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int i = 0;
		while(i < 1000) {
			x = sc.nextInt();
			if(x < random) {
				System.out.println("Up !");
			}
			else if(x > random) {
				System.out.println("Down !");
			}
			else {
				System.out.println("Good !");
				i += 1000;
			}
		}
	}

}
