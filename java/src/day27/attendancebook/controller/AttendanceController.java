package day27.attendancebook.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import day27.attendancebook.vo.Attendance;
import day27.attendancebook.vo.AttendanceBook;
import day27.attendancebook.vo.Student;

public class AttendanceController implements Program {

	
	private Scanner sc = new Scanner(System.in);
	private AttendanceBook book = new AttendanceBook();
	private final static int EXIT = 4;
	
	
	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생 등록");
		System.out.println("2. 출석 체크");
		System.out.println("3. 출석 확인");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
	}
	@Override
	public void run() {
		
		
		//load();
		
		int menu;
		do {
			System.out.println("================");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);
		
		//save();
	}

	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			attedndanceCheck();
			break;
		case 3:
			printAttendance();
			break;
		case 4:
			System.out.println("EXIT !");
			break;
		default:
			System.out.println("Wrong Menu !");

		}
	}
	
	private void insertStudent() {
		//정보(학번, 이름) 입력
		System.out.println("학번 : ");
		String num = sc.next();
		
		sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		//출석부에 새 학생을 추가
		//입력받은 정보를 이용하여 학생 객체를 생성
		Student std = new Student(num,name);
		//생성된 학생 객체를 추가
		boolean insertSuccess = book.insertStudent(std);
		//추가에 성공하면 성공했다고, 실패하면 실패했다고 출력
		System.out.println("=================");
		if(insertSuccess) {
			System.out.println("학생 정보 추가 성공 !");
		}else {
			System.out.println("학생 정보 추가 실패 !");
		}
		
	}
	
	private void attedndanceCheck() {
		//날짜 입력
		//SimpleDateFormat을 이용해서
		Date date = null;
		System.out.println("날짜(yyyy-MM-dd) : ");
		String dateStr = sc.next();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = format.parse(dateStr); 
			
		} catch (ParseException e) {
			System.out.println("날짜 형식이 아닙니다.");
			return;
		}
		//날짜가 제대로 입력됐는지 체크
		
		//출석부에서 학생 정보들을 가져와서 저장
		//-> 출석부에 학생정보들을 가져오도록 추가 작업
		List<Student> stdList = book.getStdList();  //getter 이용해서 리스트 들고오기

		//반복문 
		for(Student tmp : stdList) {
			//학성정보를 출력
			System.out.print(tmp + " : ");
			
			//학생의 출결을 입력(O or X)
			char state;
			do {
				state = sc.next().charAt(0);
			}while(state != 'O' && state != 'X');
			// 출석부에 체크
			// 학생정보, 출결을 이용하여 출석 객체를 생성
			// 나중에 학생 삭제 기능이 추가돼도 기존 출석 기록은 삭제되면 안되기 때문에,
			// 복사 생성자를 이용
			Attendance attendance = new Attendance(date, new Student(tmp), state);
			
			// 출석부에 출석 객체를 추가
			// 출석부에 출석 객체가 주어지면 출석명단에 추가하는 작업
			if(!book.insertAttendance(attendance)) {
				System.out.println("이미 등록된 출석입니다.");
			} else {
				System.out.println("출석체크를 했습니다.");
			}
			
		}
		
	}
	private void printAttendance() {
		/*
		List<Attendance> list = book.getList();
		for(Attendance tmp : list) {
		}
		System.out.println(book.getList().get(0).getDate());
		*/
		book.printAttendance();
	}
	

	
	
	/*
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
		
	}*/

}
