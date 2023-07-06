package day27.attendancebook.vo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

//출석부
//-출석부 클래스 (출석이 여러개 모여있는 클래스)
// 날짜별로
// Attendance(학생, 출석여부)를 가짐
@Data
public class AttendanceBook implements Serializable  {
	private static final long serialVersionUID = 3439681532760663381L;

	transient Scanner sc = new Scanner(System.in);		//Scanner 클래스는 직렬화가 안되어 있기 때문에 예외처리
														//transient = 예외함
	private List<Attendance> list = new ArrayList<>();
	private List<Student> stdList = new ArrayList<>();

	public void saveStudent(String fileName) {
		// 학생 정보를 저장 -> 리스트 -> 하나씩 꺼내서 저장
		// 저장 -> OutputStream
		// 읽어오기 편하려고 객체 단위로 저장 -> ObjectOutputStream
		// FileOutputStream = 기반 스트림, ObjectOutputStream의 상위

		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			for (Student tmp : stdList) {
				oos.writeObject(tmp); // 이거 쓸려면 Student클래스 Serializable 인터페이스 구현해야 함.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadStudent(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			while (true) {
				Student tmp = (Student)ois.readObject();
				stdList.add(tmp);

			}
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다.");
		} catch (EOFException e) {
			System.out.println("불러오기 완료 !");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
//ObjectInputStream을 이용하여 객체단위로 읽어올 때 클래스가 Serializable 인터페이스를 구현하지 않으면 발생
			System.out.println("Student 클래스를 찾을 수 없습니다.");
		}
		System.out.println(stdList);
	}
	
	
	public void saveAttendance(String fileName) {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			for (Attendance tmp : list) {
				oos.writeObject(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadAttendance(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			while (true) {
				Attendance tmp = (Attendance)ois.readObject();
				list.add(tmp);

			}
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다.");
		} catch (EOFException e) {
			System.out.println("불러오기 완료 !");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Attendance 클래스를 찾을 수 없습니다.");
		}
	}
	

	public boolean insertStudent(Student std) {
		// 이미 등록된 학번이면 등록 실패 : 학생 클래스가 학번을 통해서 같은지 확인할 수 있어야 함.
		if(stdList.contains(std)) {
			return false;
		}
		//새 학생을 추가
		stdList.add(std);
		//학번 순으로 정렬
		Collections.sort(stdList,(o1,o2)->{
			return o1.getNum().compareTo(o2.getNum());
		});
		System.out.println(stdList);
		return true;
	}
	


	public boolean insertAttendance(Attendance attendance) {
		//이미 등록된 출석기록이면 등록 실패
		if(list.contains(attendance)) {
			return false;
		}
		list.add(attendance);
		// 날짜순, 학번순으로 정렬
		Collections.sort(list, (o1,o2)->{
			//날짜가 같으면 학번순으로 정렬
			if(o1.getDate().equals(o2.getDate())) {
				return o1.getStudent().getNum().compareTo(o2.getStudent().getNum());
			}
			//날짜가 다르면 날짜순으로 정렬
			return o1.getDate().compareTo(o2.getDate());
		});
		return true;
	}


	public void printAttendance() {
		// 출석 기록이 없으면
		if(list.size() == 0) {
			System.out.println("등록된 출석체크가 없습니다. ");
			return;
		}
		//첫 출석 체크 정보의 날짜를 문자열로 가져옴, (정렬이 되어있어서 인덱스0으로 가져와도 됨)
		String dateStr = "";
		for(Attendance tmp : list) {
			if(!dateStr.equals(tmp.getDateStr())) {
				System.out.println(tmp.getDateStr());
				dateStr = tmp.getDateStr();
			}
			System.out.println(tmp);
		}
	}
	
	
	
}
