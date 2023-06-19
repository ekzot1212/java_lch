package day14.member.variable;

public class Ex {

	public static void main(String[] args) {
		/*멤버 변수 초기화 예제
		 * 클래스 멤버변수 num 초기화 순서
		 * 1. 기본값      : 0  (int의 기본값)
		 * 2. 명시적 초기화 : 1  (멤버 변수 선언과 동시에 초기화 되는 값)
		 * 3. 초기화 블록  : 2  ({}으로 된 초기화 블록에서 초기화)
		 * 4. 생성자      : 3  (생성자에서 초기화)
		 */
		System.out.println(TestA.num2);
		TestA a = new TestA();
		System.out.println(a.num);
		
		System.out.println(TestA.num2);
	}

}

class TestA{
	// 1. 기본값
	
	// 2. 명시적 초기화
	int num = 1;
	
	
	// 3. 초기화 블럭
	{
		num = 2;
	}
	
	// 4. 생성자
	public TestA() {
		num = 3;
	}
	
	
	// 1. 기본값
	
	// 2. 명시적 초기화
	static int num2 = 1;
	// 3. static 초기화 블럭		static = 클래스 변수, 클래스 메서드,
	static {
		num2 = 2;
	}
}










