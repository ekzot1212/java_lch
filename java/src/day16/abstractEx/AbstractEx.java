package day16.abstractEx;

public class AbstractEx {

	public static void main(String[] args) {
	
		A a = new A() {
			public void test() {
				System.out.println("class A Test");
				
			}
		};
		a.test();
		A a2 = new A() {
			public void test() {
				System.out.println("class A Test");
			}
		};
		a2.test();
		//ChildA1도 추상 클래스이기 때문에 ChildA1으로 객체를 생성할 수 없다.
		//ChildA1 ca1 = new ChildA1();
		
		/* 추상 클래스를 상속받은 ChildA2는 일반 클래스이기 때문에 객체를 생성할 수 있다. */
		//모든 기능이 구현되어 있다 -> 객체 생성 가능
		//모든 기능이 구현되어 있지 않다 -> 추상메서드가 있다 -> 객체 생성이 불가능.
		ChildA2 ca2 = new ChildA2();
		ca2.test();
		
		//다형성 : 하나의 객체에 여러 타입이 오는 것.
		a = ca2; //업캐스팅 (부모클래스인 A에다가 ca2 넣음)
				// ca2객체를 a가 다룰 수 있다.
		a.test();
		
		String str;			//ctrl + 커서 갖다대기
	}

}

//class abstractExString extends String{}
/*
 * 추상 클래스는 추상 메서드를 가지고 있음.
 * 추상 메서드가 있는 클래스에 abstract를 붙이지 않으면 에러 발생
 * 
 */
abstract class A{

	public abstract void test();
	//메서드에 final이 붙으면 메서드 오버라이딩 불가능.
	public final void test2() {
		System.out.println("Test2");
	}

}

/* 추상 클래스 상속 받는 방법1.
 *  추상클래스 A를 상속받은 자식 클래스는 추상 클래스로 만들어야 함. */
abstract class ChildA1 extends A{
	
}

/* 추상 클래스 상속 받는 방법2.
 * 부모 클래스의 추상 메서드를 오버라이딩해서 재정의 해줌.
 */
class ChildA2 extends A{
	/*
	 * final 메서드를 오버라이딩 할 수 없음.
	 */
	@Override
	public void test() {			//부모에서 상속받은 test메서드를 오버라이딩 함.!
		System.out.println("테스트");
	}
	
}








