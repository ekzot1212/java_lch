package day7.method;

public class SumMethodEx {

	public static void main(String[] args) {
		/*
		 * 두 정수의 합을 구하는 함수(메서드)를 만드세요.
		 */
		int num1= 10;
		int num2 =15;
		int result = sum(num1,num2);
		System.out.println(result);
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	//void == return값이 없을때 쓰는것
	//static변수 = 상수변수
	
	
	/**
	 * 기능    : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드.
	 * 메서드명 : sum
	 * 리턴타입 : int
	 * 매개변수 : num1, num2
	 * @return
	 */
}
