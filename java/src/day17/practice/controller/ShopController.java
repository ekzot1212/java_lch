package day17.practice.controller;

import java.util.Scanner;

import day17.interfaceex.RunInterface;
import day17.practice.service.ShopService;
import day17.practice.service.ShopServiceImp;
import day17.practice.vo.Customer;
import day17.practice.vo.Product;
import day17.practice.vo.Sales;
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

public class ShopController implements RunInterface {
	
	private Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];
	private int count =0;
	private Customer customerList[] = new Customer[10];
	private int customerCount = 0;
	private Sales salesHistory [] = new Sales[100];	//판매기록
	private int salesCount = 0;	//기록된 판매 수
	
	private ShopService  shopService = new ShopServiceImp();	//인터페이스 객체?
	
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
			//제품명 입력
			//제품 수량 입력
			//고객 전화번호 입력
			System.out.print("제품명 : ");
			sc.nextLine();
			String name = sc.nextLine();
			//제품 개수 입력
			System.out.println("수량 : ");
			int amount = sc.nextInt();
			//고객 정보 입력
			System.out.println("번호 : ");
			String phoneNumber = sc.next();
			
			int salesCount =
			shopService.sell(
					list, count, //제품 리스트 정보
					customerList, customerCount, //고객 리스트 정보
					salesHistory, this.salesCount, // 판매 내역 정보
					name, amount, phoneNumber
					);
			if(salesCount == -1) {
				System.out.println("제품 판매 실패 !");
			}else {
				System.out.println("제품 판매 성공 !");
				this.salesCount = salesCount ;
			}
			break;
		case 2:
			//입고할 제품 정보를 입력받아 제품 객체를 생성
			Product product = inputStoreProduct();
			//제품 리스트와 제품 수를 주고,입고된 제품을 주고, 제품 입고를 관리하라고 시킴
			//새 제품이 입고된 경우 제품 리스트에 추가 되고 제품수가 1 증가해야 하기 때문에.
			count = shopService.store(list, count, product);		//멤버변수를 인터페이스에 넘겨줘야 함.
			break;
		case 3:
			//제품명을 입력
			System.out.print("제품명 :");
			String search = sc.nextLine();
			
			//제품을 검색해서 출력
			shopService.printProduct(list, count, search);
			break;
		case 4:
			shopService.printSales(salesHistory, this.salesCount);
			break;
		case 5:
			Customer customer = inputRegisterCustomer();
			
			int count = shopService.registerCustomer(customerList, customerCount, customer);
			if(count == -1) {
				System.out.println("고객 등록 실패 !");
			}else {
				System.out.println("고객 등록 성공 !");
				customerCount = count;
			}
			break;
		case 6:
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	private Customer inputRegisterCustomer() {
		//고객 정보
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("번호 : ");
		String phoneNumber = sc.next();
		
		return new Customer(name, phoneNumber);
		/* Customer customer = new Customer(name,phoneNumber);
		 * return customer;   	위의 한줄은 이 두줄을 줄여쓴 것임		 */
		 
	}
	
	
	/**
	 * 제품을 입고 하는 메서드
	 */
	private Product inputStoreProduct() {
	
	System.out.print("제품명 : ");
	sc.nextLine();									
	String name = sc.nextLine();
	
	System.out.print("수량 : ");
	int amount = sc.nextInt();
	
	if(amount <0) {
		System.out.println("입고 수량 오류 !");
		return null ;
	}
	

	int index = indexOf(name);
	
	if(index != -1) {
		Product product = new Product(list[index]);
		product.setAmount(amount);
		return product ;
	}
	
	
	if(count == list.length) {
		System.out.println("제품 리스트 다참 !");
		return null;
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
	
	Product product = new Product(name, modelname, price, 
			amount, category);
	
	return product;
		
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
	
	
	
	
}





















