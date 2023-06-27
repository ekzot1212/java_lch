package day20.generic;

import java.util.Scanner;

public class GenericEx {

	public static void main(String[] args) {
				//Integer == wrapper클래스			//제네릭은 객체 생성할때마다 다른 자료형 쓸 수 있음.
		Student<Integer> std = new Student<Integer>();	//제네릭 T = 인티저
		std.kor = 10;
		Student<Double> std2 = new Student<Double>();	//제네릭 T = Double
		std2.kor = 10.0;
		/*
		Student<Scanner> std3 = new Student<>();
		std3.kor = 10;
		*/
		print(std2);	//GenericEx.<Double> 이 생략된 것임.
		GenericEx.<Double>print(std2);	
		//std2가 Double로 되어 있어서 print의 T를 Double이라고 추정 할 수 있어서
		
	}
	
	//학생 정보를 출력하는 메서드
	public static <T extends Number> void print(Student<T> std) {
	System.out.println(std.grade);	
	System.out.println(std.classNum);	
	System.out.println(std.num);
	System.out.println(std.name);
	System.out.println(std.kor);
	System.out.println();
	}

}
