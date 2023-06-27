package day20.practice.student.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day20.practice.student.vo.Student;
import lombok.Data;

@Data
public class StudentController implements Program {
	private final static int EXIT = 4;

	ArrayList<Student> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		int menu = 0;

		do {
			try {
				
			System.out.println(list);
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			} catch(InputMismatchException e) {
				menu = EXIT -1;		//종료 메뉴가 아닌 아무 메뉴를 추가
				sc.nextLine();		//앞에서 잘못 입력한 내용을 비워줌
				System.out.println("잘못된 입력입니다.");
				
			}
		} while (menu != EXIT);
	}

	@Override
	public void printMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 학생 수정");
		System.out.println("4. 프로그램 종료");
		System.out.println("====================");
	}

	@Override
	public void runMenu(int menu) {

		switch (menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			deleteStudent();
			break;
		case 3:
			updateStudent();
			break;
		case 4:
			System.out.println("프로그램 종료합니다.");
			break;
		default:
			System.out.println("메뉴 입력 실패 !");
			return;
				
		}

	}

	private void updateStudent() {
		//수정할 학생의 정보 입력(학년, 반, 번호)
		System.out.println("수정할 학생의 학년, 반, 번호");
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		System.out.println("반 : ");
		int classNum = sc.nextInt();
		System.out.println("번호 : ");
		int num = sc.nextInt();
		Student tmp = new Student(grade, classNum, num, null);
		
		//수정할 학생이 있는지 없는지 확인
		int index = list.indexOf(tmp);
		//없으면 종료
		if(index == -1) {
			System.out.println("학생 없음 !");
			return;
		}
		//수정 될 학생 정보를 입력(학년, 반, 번호, 이름)
		
		System.out.println("학생의 학년, 반, 번호, 이름");
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("반 : ");
		classNum = sc.nextInt();
		System.out.print("번호 : ");
		num = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		
		tmp = new Student(grade, classNum, num, name);
		if(list.contains(tmp)) {
			System.out.println("수정 실패 !");
			return;
		}
		// ?????????????????
		list.get(index).update(grade, classNum, num, name);
		
		
		
		
		
		
	}

	private void deleteStudent() {
		System.out.println("삭제 할 학생의 학년, 반, 번호 ");
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		Student std = new Student(grade,classNum, num, "");
		
		
		if(list.remove(std)) {
			//삭제 성공
			System.out.println("삭제 성공 !");
			return;
		}
		System.out.println("삭제 실패 !");
	}

	private void insertStudent() {
		System.out.println("학년, 반, 번호, 이름");
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		
		//학생 객체 생성
		Student tmp = new Student(grade, classNum, num, name);
		
		//학생리스트 추가
			//학생이 있는지 없는지 확인
		if(!list.contains(tmp)) {		//equals 오버라이딩 해서 학년,반,번호만으로
			list.add(tmp);
			System.out.println(list + " 추가 성공");
			return;	
		}
		System.out.println("추가 실패 !");
		
	}
	

}
