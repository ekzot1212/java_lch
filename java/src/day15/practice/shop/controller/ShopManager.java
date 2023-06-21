package day15.practice.shop.controller;

import java.util.Scanner;

import day15.practice.vo.Customer;
import day15.practice.vo.Product;
import day15.practice.vo.Sales;
import lombok.Data;

/*
 * 가전 제품(TV, 라디오, 에어컨)을  관리하는 프로그램을 작성하세요.
 * 메뉴
 * 1. 제품 판매 : 어떤 고객이 어떤 제품을 구매했는지 관리
 * 2. 제품 입고 : 새 제품이 추가됨	(어떤 제품이 몇개 추가됐는지 관리)
 * 3. 제품 조회 : 제품 정보 조회	(제품명으로 제품을 조회)
 * 4. 매출 조회 : 판매된 제품 매출 조회 (누적 매출)
 * 5. 고객 등록 : 고객을 추가하여 고객을 관리
 * 6. 프로그램 종료
 */


// 무슨 멤버변수를 가질 수 있을지.
// 무슨 메서드를 가져야 할 지.

@Data

public class ShopManager {
	
	private Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];
	private int count =0;
	private Customer customerList[] = new Customer[10];
	private int customerCount = 0;
	private Sales salesHistory [] = new Sales[100];	//판매기록
	private int salesCount = 0;	//기록된 판매 수
	private int totalPrice;	//매출 금액
	
	public void run() {
		System.out.println("프로그램을 시작 !");
		int menu =0;
		final int EXIT = 6;
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		}while(menu != EXIT);
		
		System.out.println("프로그램 종료 !");
	}
	
	private void printMenu(){
		System.out.println("=================");
		System.out.println("메뉴");
		System.out.println("1. 제품 판매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 조회");
		System.out.println("4. 매출 조회");
		System.out.println("5. 고객 등록");
		System.out.println("6. 프로그램 종료");
	}
	
	public void runMenu(int menu) {
		System.out.println("=================");
		switch(menu) {
		case 1:
			sell();
			break;
		case 2:
			store();
			break;
		case 3:
			printProduct();
			break;
		case 4:
			printSales();
			break;
		case 5:
			registerCustomer();
			break;
		case 6:
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	private void registerCustomer() {
		// 고객을 등록해야 함.
		// 고객리스트 꽉 차면 리턴

		if (customerCount == customerList.length) {
			System.out.println("고객 리스트 가득 참");
			return;
		}
		// 입력 받기
		System.out.print("고객이름 : ");
		String name = sc.next();
		System.out.print("번호 : ");
		String phoneNumber = sc.next();
		
		//이미 등록된 전화번호이면 등록을 x
		for(int i = 0; i < customerCount ; i++) {
			if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
				System.out.println("이미 등록된 번호! 고객 등록 실패!");
				return;
			}
		}
		
		//고객을 등록(고객 리스트에)
		// Customer 생성해서 배열에 넣기
		customerList[customerCount++] = new Customer(name, phoneNumber);
		customerList[(customerCount-1)].print(); // 임시 출력 (지워야함)
		System.out.println("등록 성공 !");
	}
	
	
	private void printSales() {
		//매출 내역 출력
		for(int i= 0; i <salesCount ; i ++ ) {
			salesHistory[i].print();	// salesHistory 배열은 Sales클래스의 객체를 배열로 가짐
										// Sales 객체는 => (Product객체, Customer객체) 가짐
			
		}
		
		//누적 매출액 출력
		System.out.println("누적 매출액 : " + totalPrice);
	}
	
	
	
	
	/** 제품을 검색해서 조회하는 메서드 */
	private void printProduct() {
		//검색할 제품을 입력
		System.out.print("제품명 : ");			
		sc.nextLine();		//엔터.	이전 입력에서 엔터를 쳤기 때문에 엔터 제거
		String name = sc.next();
		
		
		//입력한 검색어 맞는 제품을 출력
		//등록된 제품들 중에 검색어와 일치하는 제품이 어디있는지 확인
		int index = indexOf(name);
		
		//제품이 있으면 제품 정보를 출력
		if(index >= 0) {
			list[index].print();
			return;
			//없으면 없는 제품이라고 출력
		}
		System.out.println("없는 제품 !");
			
			
		
		
	}
	
	
	/**
	 * 제품을 입고 하는 메서드
	 */
	private void store() {
	
	//입고 할 제품명 입력
	System.out.print("제품명 : ");
	sc.nextLine();									// ????????????
	String name = sc.nextLine();
	
	//입고 할 제품 수량
	System.out.print("수량 : ");
	int amount = sc.nextInt();
	
	if(amount <0) {
		System.out.println("입고 수량 오류 !");
		return;
	}
	
	//제품 리스트에서 입고할 제품명이 있는지 찾음
	//제품 배열에 있는 제품명과 입고할 제품명이 같은지를
	//확인해서 같으면 위치를 기억, 
	int index = indexOf(name);
	
	//있으면 입고할 제품 수량 만큼 해당 제품에 입고
	//위치가 0이상이면
	if(index != -1) {
		list[index].store(amount);
		System.out.println("입고 완료 !");
		return;
	}
	
	//없으면 제품 리스트에 제품 정보를 추가(입고할 수량도 함께)
	//위치가 -1이면
	if(count == list.length) {
		System.out.println("제품 리스트 다참 !");
		return;
	}
	//모델명 입력
	System.out.println("새 제품 등록 ");
	System.out.print("모델명 : ");
	sc.nextLine();								// ????????????
	String modelname = sc.nextLine();
	
	//가격을 입력
	System.out.print("가격 : ");
	int price = sc.nextInt();
	
	//분류 입력
	System.out.println("분류 : ");
	String category = sc.next();
	
	//제품 리스트에 추가
	list[count++] = new Product(name, modelname, price, amount, category);
	
	System.out.println("제품 추가 후 입고 완료 !");
	
	
		
		
		
	}
	
	/**제품 리스트에 제품명과 일치하는 제품이 있으면 번지를, 
	 * 없으면 -1을 반환하는 메서드.
	 * 매개변수 : 제품명	-> String name
	 * 리턴타입 : 제품이 있는 번지 or -1	-> int
	 * 메서드명 : indexOf
	 */
	private int indexOf(String name) {
		for(int i = 0 ; i < count ; i++) {
			if(list[i].getName().equals(name)) {		//equals !!!!!!!!!
				return i;
			}
		}
		return -1;
	}
	
	private int indexOfModelname(String modelname) {
		for(int i = 0 ; i < count ; i++) {
			if(list[i].getModelname().equals(modelname)) {		//equals !!!!!!!!!
				return i;
			}
		}
		return -1;
	}
	
	private int indexOfCustomer(String phoneNumber) {
		for(int i = 0; i < customerCount ; i++) {
			if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
				return i;		//찾으면 인덱스 리턴
			}
		}
		return -1;		//없으면 -1 리턴
	}
	
	
	/** 제품 판매 메서드 */
	private void sell() {
		
		//제품명 입력
		System.out.print("제품명 : ");
		sc.nextLine();
		String name = sc.nextLine();
		//제품 개수 입력
		System.out.println("수량 : ");
		int amount = sc.nextInt();
		//고객 정보 입력
		System.out.println("번호 : ");
		String phoneNumber = sc.next();
		
		//있는 제품인지 확인
		int index = indexOf(name);
		if(index < 0) {
			System.out.println("제품명 오류 !");
			return;
		}
		if(amount <= 0) {
			System.out.println("수량 오류 !");
			return;
		}
		
		//있는 고객인지 확인
		int customerIndex = indexOfCustomer(phoneNumber);
		if(customerIndex < 0) {
			System.out.println("전화번호 오류 !");
			return;
		}
		
		//판매 내역에 추가
		//제품 정보
		//복사 생성자를 이용해서 제품 정보를 복사(깊은 복사)
		Product product = new Product(list[index]);		// 복사 생성자 써야함!!! 그냥넣으면 안됨!!
		product.setAmount(amount);	//판매 내역에 넣을 객체(product)에 수량 넣어줌
		//고객 정보
		Customer customer = customerList[customerIndex];	// 이러면 주소 복사되긴 하는데 안바꿀거라 상관없음
		
		Sales sales = new Sales(customer, product);		// 굳이 하는 이유?
													//product객체, customer객체로 sales 객체 생성!
		salesHistory[salesCount++] = sales;	//배열에 sales 객체 넣기		
		
		//판매된 개수만큼 재고량에서 뺴줘야함.
		list[index].release(amount);
		
		//매출금액을 추가
		totalPrice += sales.getTotalPrice();
		
	}
}





















