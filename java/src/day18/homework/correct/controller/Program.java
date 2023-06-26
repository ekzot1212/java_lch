package day18.homework.correct.controller;

public interface Program {		//산술연산클래스, 이미지클래스 상속시킴
								// 인터페이스는 , ->  추상메서드와 상수만 올수있음
	void run();					// 		다른 클래스에서 추상메서드를 오버라이드 해서 씀.
	void printMenu();
	void runMenu(int menu);
}
