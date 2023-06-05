package day5.practice;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i <= 2) {
			if(i == 1) {
				System.out.println("Program Start!");
				System.out.println();
			}
			if(i == 2) {
				System.out.println("Program Save!");
				System.out.println();
			}
			if(i == 3) {
				System.out.println("Program Exit!");
				System.out.println();
			}
			System.out.println("Menu");
			System.out.println("");
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			System.out.println("");
			System.out.println("Select Menu :");
			i = sc.nextInt();
		}
	}

}
