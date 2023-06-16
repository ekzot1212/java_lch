package day13.practice;

//성적을 관리하기 위한 Subject 클래스를 작성하세요.

public class SubjectEx {

	public static void main(String[] args) {
		Subject sub1 = new Subject("국어");
		sub1.print();
		
		System.out.println("=========================");
		Subject sub2 = new Subject("영어",1,1);
		sub2.updateScore(30, 40, 10);
		sub2.print();
	}

}
