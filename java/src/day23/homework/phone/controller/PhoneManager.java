package day23.homework.phone.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import day23.homework.phone.vo.PhoneBook;



public class PhoneManager implements Program {

	
	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 4;
	PhoneBook pb = new PhoneBook();
	
	
	@Override
	public void printMenu() {
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Search");
		System.out.println("4. EXIT");
		System.out.print("Select Menu : ");
	}
/*
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */
	@Override
	public void run() {
		load();
		
		int menu;
		do {
			System.out.println("================");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);
		
		save();
	}

	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:
			insert();
			break;
		case 2:
			update();
			break;
		case 3:
			search();
			break;
		case 4:
			System.out.println("EXIT !");
			break;
		default:
			System.out.println("Wrong Menu !");

		}
	}
	private void search() {
		//검색할 이름을 입력
		System.out.print("name : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		//검색 결과를 출력
		pb.print(s->s.getName().contains(name));
		// 전체 출력
		//pb.print(s->true);		//람다식 Predicate
	}

	private void update() {
		// 이름, 수정할 이름과 수정할 전화번호를 입력
		System.out.print("name : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("update name : ");
		String updateName = sc.next();

		System.out.print("number : ");
		String number = sc.next();
		
		//전화번호부에 수정을 해서 성공하면 성공이라고
		if(pb.update(name,updateName, number)) {
			System.out.println("Update Success !");
		}
		// 실패하면 실패했다고 출력
		else {
			System.out.println("Update Fail !");
		}
		
	}

	private void insert() {
		// 이름과 전화번호를 입력
		System.out.print("name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("number : ");
		String number = sc.next();
		
		// 전화번호부에 추가를 해서 성공하면 성공이라고,
		if(pb.insertPhone(name, number)) {
			System.out.println("Insert Success !");
		}
		// 실패하면 실패했다고 출력
		else {
			System.out.println("Insert Fail !");
		}
	}
	@Override
	public void load() {
		try(FileInputStream fis = new FileInputStream("phone_book.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){

			pb = (PhoneBook)ois.readObject();		//이게 왜 pb에 들어가는 것임?
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void save() {
		try(FileOutputStream fos = new FileOutputStream("phone_book.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(pb);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
