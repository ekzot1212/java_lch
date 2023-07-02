package day23.homework.phone.controller;

public interface Program {
	void printMenu();
	void run();
	void load();
	void runMenu(int menu);
	void save();
	
	/*
	 * save() : 전화번호부에 있는 전화번호들을 파일에 저장하는 기능.
	 * 프로그램 종료 전에 호출
	 * 
	 * load() : 파일에 있는 전화번호들을 읽어와서 전화번호부에 저장하는 기능.
	 * run() 실행 후 반복문 전에 호출
	 */
}
