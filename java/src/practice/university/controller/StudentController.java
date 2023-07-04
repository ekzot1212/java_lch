package practice.university.controller;

import java.util.ArrayList;
import java.util.Scanner;

import practice.university.run.Program;
import practice.university.vo.Student;

public class StudentController implements Program{
	Scanner sc = new Scanner(System.in);
	public final static int EXIT = 3;
	ArrayList<Student> list = new ArrayList<>();
	
	
	
	@Override
	public void printMenu() {
		System.out.println("=========");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 확인");
		System.out.println("3. 학번 검색");
		System.out.println("4. EXIT");
		System.out.print("Select Menu : ");
		
	}

	@Override
	public void run() {
		System.out.println("Program Start!!");
		
		int menu;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		}while(menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:
			addStudent();
			break;
		case 2:
			searchStudent();
			break;
		case 3:
			searchStudentNum();
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong menu!");
		}
		
	}

	private void searchStudent() {
		System.out.print("검색할 학생의 학번 : ");
		int num = sc.nextInt();
		Student tmp = new Student(num);
		int index = list.indexOf(tmp);
		
		if(index == -1) {
			System.out.println("검색 실패 !");
			return;
		}
		System.out.println(list.get(index));
		
		
	}

	private void addStudent() {
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.println(name);
		System.out.print("학과 이름 : ");
		String department = sc.next();
		System.out.println(department);
		
		list.add(new Student(name, department));
	}
	
	private void searchStudentNum() {
		System.out.print("학번을 검색할 학생의 이름 : ");
		String name = sc.next();
		Student tmp = new Student(name, "");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {		//equals 오버라이딩 안하고 같은거 비교하기
				System.out.println(list.get(i));
				return;
			}
		}

		System.out.println("검색 실패 !");
	}

}
