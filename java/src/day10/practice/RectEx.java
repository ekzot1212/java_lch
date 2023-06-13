package day10.practice;

import java.util.Scanner;

public class RectEx {

	public static void main(String[] args) {
		System.out.println("만드려고 하는 직사각형의 가로 세로를 입력하시오 :");
		Scanner sc = new Scanner(System.in);
		
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		Rect rect = new Rect(width,height);
		rect.drawRect();
		
	}
}

class Rect {			//public class 붙이려면 파일명과 클래스 명이 같아야함.!!
	private int width;		//같은 패키지에 같은 이름의 클래스는 못만듬!
	private int height;

	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	public void drawRect() {
		System.out.println("첫번째 좌표 : 0, 0");
		System.out.println("두번째 좌표 : " + width + ", 0");
		System.out.println("세번째 좌표 : " + width + ", " + height );
		System.out.println("네번째 좌표 : " + "0" + ", " + height );
	}
}

