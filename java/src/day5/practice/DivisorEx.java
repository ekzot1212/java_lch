package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		//정수 num의 약수를 구하는 코드를 작성하세요
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int num = sc.nextInt();
		
		System.out.print(num + "의 약수 :");
		
		while(i <= num) {
			if(num % i == 0) {
				System.out.print(i + ", ");
			}
			
			i++;
		}
	}

}
