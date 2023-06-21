package day16.homework.controller;

import java.util.Scanner;

/*
 * 음료수를 뽑는 자판기 프로그램을 작성하세요.
 * 단 음료수 자판기에 음료수는 사이다, 콜라, 환타가 고정이라고 가정.
 * 메뉴를 선택하면 음료수와 잔액이 나옴(출력).
 * 
 * 1. 금액 투입
 * 2. 메뉴 선택
 * 3. 제품 입고
 * 4. 프로그램 종료
 */

public class BeverageMachineEx {
	Scanner sc= new Scanner(System.in);

	public void run() {
		
		int menu=0;
		do {
			menu();
			menu = sc.nextInt();
			
		}while(menu != 4);
	}
	
	public void menu() {
		System.out.println("1. 금액 투입" );
		System.out.println("2. 메뉴 선택" );
		System.out.println("3. 제품 입고" );
		System.out.println("4. 프로그램 종료" );
		System.out.println("메뉴 : ");
	}
}
