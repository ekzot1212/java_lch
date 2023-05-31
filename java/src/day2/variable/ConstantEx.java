package day2.variable;

public class ConstantEx {

	public static void main(String[] args) {
		
		final int MAX_AGE;
		MAX_AGE = 100;
		// MAX_AGE = 100; 에러발생함 -> 상수이므로
		System.out.println(MAX_AGE);
		
		
		//지역변수 = 초기화 하고 써야함 (자동으로 초기화 안됨)
		
		
		//문자열 + 기본형 = 문자열 형 변환
		String str1 = "ABCC";
		boolean bool = true;
		
		System.out.println(str1 + bool);
		
	}

}
