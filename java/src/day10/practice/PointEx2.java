package day10.practice;

public class PointEx2 {

	public static void main(String[] args) {
		/*
		 * 좌표의 점을 관리하는 클래스를 만들고 테스트하는 코드를 작성하세요. 필요한 속성과 기능을 생각해서 추가해보세요. 
		 * (예 : 그림판 하단의 좌표)
		 */

	
	}

}

class Point2 {			//public class 붙이려면 파일명과 클래스 명이 같아야함.!!
	private int x;		//같은 패키지에 같은 이름의 클래스는 못만듬!
	private int y;
	
	public Point2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public void print() {
		System.out.println(x + " , " + y);
	}

	
	
	
	
}

