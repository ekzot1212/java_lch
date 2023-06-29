package day22.practice.controller;

import java.util.ArrayList;
import java.util.Scanner;

import day22.practice.vo.Phone;

public class PhoneManager implements Program {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Phone> list = new ArrayList<>();
	
	
	
	@Override
	public void printMenu() {
		System.out.println("==============");
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 검색");
		System.out.println("4. 종료");
	}
	
	public void printSubMenu() {
		System.out.println("==============");
		System.out.println("  (1) 전체 조회");
		System.out.println("  (2) 검색 조회");
	}
	int menu = 0;

	@Override
	public void run() {
		while (menu != 4) {
			printMenu();
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			runMenu(menu);
		}
	}

	@Override
	public void runMenu(int menu) {
		String name;
		String phoneNumber;
		switch (menu) {
		case 1:
			//전화번호 등록
			System.out.print("전화번호 : ");
			phoneNumber = sc.next();
			System.out.print("이름 : ");
			name = sc.next();
			registerNum(name, phoneNumber);
			break;
		case 2:
			//전화번호 수정
			System.out.print("수정 할 전화번호 :");
			phoneNumber = sc.next();
			modifyNum(phoneNumber);
			break;
		case 3:
			printSubMenu();
			menu = sc.nextInt();
			if(menu == 1) {
				printAll();
				return;
			}
			//전화번호 검색
			System.out.print("검색할 전화번호 : ");
			phoneNumber = sc.next();
			search(phoneNumber);
			
			
			break;
		case 4:
			System.out.println("종료");
			break;

		}
	}

	private void modifyNum(String phoneNumber) {
		int index = list.indexOf(new Phone("" , phoneNumber));
		if(index == -1) {
			System.out.println("없는 전화번호입니다.");
			return;
		}
		System.out.println("새로운 이름 : ");
		String name = sc.next();
		System.out.println("새로운 번호 : ");
		phoneNumber = sc.next();
		
		//name = list.get(index).getName();		// 기존 이름
		//수정하는 클래스메서드 찾아서 바꾸기
		list.set(index, new Phone(name,phoneNumber));
	}

	private void search(String phoneNumber) {
		Phone tmp = new Phone("", phoneNumber);
		int index = list.indexOf(new Phone("", phoneNumber));
		if(index == -1) {
			System.out.println("검색 실패 !");
			return;
		}
		System.out.println(list.get(index));
	}

	private void printAll() {
		for(Phone tmp : list) {
			System.out.println(tmp);
		}
	}

	private void registerNum(String name, String phoneNumber) {
		//이미 있으면 등록 안함.
		if(list.contains(new Phone("", phoneNumber ))){
			System.out.println("이미 등록되어 있는 번호입니다.");
			return;
		}
		list.add(new Phone(name, phoneNumber));
		System.out.println("등록 성공.");
	}

}
