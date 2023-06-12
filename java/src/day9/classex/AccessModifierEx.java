package day9.classex;

import day9.classex2.B;

public class AccessModifierEx {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		//num3은 접근제어자가 public
		//AccessModifier 클래스와 A 클래스는 같은 패키지에 있는 클래스
		//AccessModifier 클래스와 B 클래스는 다른 패키지에 있는 클래스
		//num3은 접근제어자가 public. -> 같은 패키지이든 아니든 상관 없음.
		a.num3 = 10;
		b.num3 = 20;
		
		//num2는 접근제어자가 디폴트(생략됨).
		a.num2 = 10;
	//	b.num2 = 20;	// 디폴트는 같은 패키지만 접근가능
		
		//num1은 접근제어자가 private.
		//같은 패키지이든 아니든 다른 클래스에서 접근할 수 없음.
	//	a.num1 = 10;
	//	b.num2 = 20;
		
		//private는 setter를 통해 값 변경
		a.setNum1(10);
		//private는 getter를 통해 값 가져옴.
		System.out.println(a.getNum1());
	}

}

class A{

	private int num1;
	int num2;
	public int num3;
	
	/**
	 * 클래스 A의 객체 정보 num1을 출력하는 메서드
	 * 매개변수 :
	 * 리턴타입 : 없음 (void)
	 * 메서드명 : print
	 */
	public void print() {
		//num1은 private이기 때문에 A클래스의 메서드에서 호출 될 수 있디ㅏ.
		//이미 알고있는 내 정보를 활용하는 경우 매개변수로 전달받지 않아도 됨.
		System.out.println(num1);
	}
	
		//private으로 된 num1에 접근하기 위해서 getter를 추가
		public int getNum1() {
			return num1;
		}

		//private으로 된 num1에 접근하기 위해서 setter를 추가
		public void setNum1(int num1) {
			this.num1 = num1;
		}
}