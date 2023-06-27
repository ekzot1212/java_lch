package day20.generic;
					//제네릭
public class Student <T extends Number> {	//extends로 클래스 타입을 제한할 수 있음 (Number와 Number의 자식클래스만)
	int grade, classNum, num;
	String name;
	public T kor, math, eng;	//인티저또는 더블을 받기위해 제네릭

}
