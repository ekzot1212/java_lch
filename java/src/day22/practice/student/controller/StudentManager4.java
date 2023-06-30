package day22.practice.student.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day22.practice.student.vo.Student;

/*
 * 학생 정보를 출력하는 기능을 구현하세요. 
 * 1. 학생 전체 출력 
 * 2. 학생 학년 출력 
 * 3. 학생 검색 출력 
 * 4. 종료
 */

public class StudentManager4 implements Program {
	
	List<Student> list = Arrays.asList( // 이게 뭐임?
			new Student(1, 1, 1, "Hong"), // -> 객체를 만들면 리스트로 넣어줌
			new Student(1, 1, 2, "Lim"), 
			new Student(2, 1, 1, "Park"), 
			new Student(3, 1, 1, "Lee"),
			new Student(3, 3, 2, "Kim"));
	
	Scanner sc = new Scanner(System.in);

	

	

	@Override
	public void printMenu() {
		System.out.println("==============");
		System.out.println("1. 학생 전체 출력");
		System.out.println("2. 학생 학년 출력 ");
		System.out.println("3. 학생 검색 출력");
		System.out.println("4. 종료");
	}

	@Override
	public void run() {
		int menu=0;
		while(menu != 4) {
			printMenu();
			System.out.print("메뉴 선택 : ");
			menu=sc.nextInt();
			runMenu(menu);
		}
	}

	@Override
	public void runMenu(int menu) {
		Stream<Student> stream = list.stream();
			switch (menu) {
			case 1:
				stream.forEach(std -> System.out.println(std));
				break;
			case 2:
				//검색할 학년 입력
				System.out.print("검색할 학년을 입력 : ");
				final int grade1 = sc.nextInt();
				stream
					.filter(s -> s.getGrade() == grade1)
					//filter에 있는 매개변수는 위와 아래가 같은 동작
					.filter(new Predicate<Student>() {

						@Override
						public boolean test(Student t) {
							
							return t.getGrade() == grade1;
						}
						
					})
					.forEach(s -> System.out.println(s));
				break;
			case 3:
				//검색할 학년, 반, 번호 입력
				System.out.println("학생의 학년, 반, 번호 입력");
				System.out.print("학년 : ");
				final int grade2 = sc.nextInt();
				System.out.print("반 : ");
				final int classNum2 = sc.nextInt();
				System.out.print("번호 : ");
				final int num2 = sc.nextInt();
				stream
				.filter(s -> s.equals(new Student(grade2, classNum2, num2, "")))		//걸러주는거
				.forEach(s -> System.out.println(s));
				break;
			case 4:
				System.out.println("종료");
				break;
			
		}
	}
	
	public void printAll() {
		for (Student tmp : list) {
			System.out.println(tmp);
		}
	}

	public void printGrade(int grade) {
		for (Student tmp : list) {
			if(tmp.getGrade() == grade)
			System.out.println(tmp);
		}
	}
	
	public void searchStudent(int grade,int classNum,int num) {
		
		for (Student tmp : list) {
			if(tmp.equals(new Student(grade, classNum, num, " "))) {
				System.out.println(tmp);
			}
		}
		
		/*
		for (Student tmp : list) {
			if(grade == tmp.getGrade()
					&& classNum == tmp.getClassNum()
					&& num == tmp.getNum()) {
			System.out.println(tmp);
			}
		}
		*/
	}
	
	private void print(Predicate<Student> p ) {
		for(Student tmp : list) {
			if(p.test(tmp)) {		//test 조건 만족하면 출력 (true반환됨)
				System.out.println(tmp);
			}
		}
	}
}
