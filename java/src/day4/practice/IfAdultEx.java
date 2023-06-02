package day4.practice;

import java.util.Scanner;

public class IfAdultEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what's your age ? :");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("adult");
		}
		else {
			System.out.println("minor");
		}
		
		sc.close();
	}

}

