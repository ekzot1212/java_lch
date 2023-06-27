package day20.practice.student.run;

import java.util.ArrayList;
import java.util.Scanner;

import day20.practice.student.controller.StudentController;
import lombok.Data;
@Data
//Student 클래스를 이용하여 학생을 등록하고 삭제하는 기능을 가진 프로그램을 작성하세요.
/*
 * 1. 학생 추가
 * 2. 학생 삭제
 * 3. 학생 수정
 * 4. 프로그램 종료 
 */
public class StudentEx {
	

	public static void main(String [] args) {
		StudentController sc = new StudentController();
		sc.run();
	}
	
}
