package day10.thisex;

public class StudentMain {

	public static void main(String[] args) {
		Student1.printCount();
		Student1 std1 = new Student1(1,1,1,"홍길동");
		Student1.printCount();
		Student1 std2 = new Student1(1,1,2,"임꺽정");
		Student1.printCount();
		
//		std2.studentCount = 1;
//		System.out.println(Student1.studentCount);
		std1.print();
//		Student1.print();		//에러 발생. static이 print에는 안붙어서 클래스명으로 호출 XX
	}

}

class Student1{
	
	private static int studentCount;
	
	private int grade, classNum, number ;
	private String name;
	//아래 생성자는 매개변수가 있고, 매개변수의 이름이 멤버변수와 같기 때문에
	// 멤버 변수를 호출할 때 this를 반드시 붙여야함.
	public Student1(int grade, int classNum, int number, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
	}
	//기본 생성자는 매개변수가 없기 때문에 this를 안써도 됨.
	public Student1() {

		
		this(1,1,1,"");
		
		/*
		this.grade = 1;
		classNum = 1;
		number = 1;
		name ="";
		*/
		
	}

	//객체 메서드
	public void print() {
		System.out.println("===============");
		System.out.println("grade    : " + grade);		//객체 변수 사용가능.
		System.out.println("classNum : " + classNum);
		System.out.println("number   : " + number);
		System.out.println("name     : " + name);
		//클래스 변수 사용 가능
		System.out.println("count    : " + studentCount);
		//클래스 메서드 사용 가능
		printCount();
	}
	//클래스 메서드		(이미 만들어져 있음 메모리에)
	//(그래서 객체변수, 객체메서드 생성되기 전에 호출하는 방식이라 불가능)
	public static void printCount() {
		//클래스 변수 사용 가능
		System.out.println("Registered student count : " + studentCount);
		//객체 변수 사용 불가능
		//grade = 1;
		//객체 메서드 사용 불가능
		//print();
		//객체를 생성 후 호출해서 사용 가능
		Student1 std1 = new Student1();
		std1.name = "hong";
		std1.print();
	}

}