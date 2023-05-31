package day1.variable;

public class CharExample1 {

	public static void main(String[] args) {
		// 변수타입 변수명;
		char ch1;
		// 변수타입 변수명 = 초기값;
		char ch2 = ' ';
		// 변수타입 변수명1,변수명2;
		char ch3, ch4;
		// 변수타입 변수명1 = 초기값1, 변수명2 = 초기값2;
		// \u0000 16진수 = 16진수에 맞는 문자를 가져옴
		char ch5 = '\u0041' , ch6 = 65 , ch7 = '\n' ;		//유니코드 65는 A 이다.		\n = 한줄띄우기 \t = 탭키 공백삽입		
															//  \\ = \문자, \' = '문자 , \" = "문자
		
		System.out.println(ch5);
		System.out.println(ch6);

		
		
	}

}
