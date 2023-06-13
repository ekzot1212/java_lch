package day10.copy;

public class CopyEx2 {

	public static void main(String[] args) {
		/* 기본 자료형으로 된 변수는 값을 복사하더라도 값만 복사되기 때문에
		 * 나중에 값을 변경해도 원본(num1)은 변하지 않음.
		 */
		
		/*
		 * 참조 변수를 복사하려면 복사 생성자를 이용하여 객체를 생성한 후 (깊은복사)
		 * 멤버 변수들을 복사하려는 객체의 멤버변수로 초기화.
		 */
		
		
		A2 a = new A2();
		a.num1 = 10;
		
		A2 a2 = a;
		
		System.out.println(a.num1);
		a2.num1 += 10;
		System.out.println(a.num1);
		System.out.println(a2.num1);
		
		A2 a3 = new A2(a);
		System.out.println(a3.num1 + ", " + a.num1);
		a.num1 = 100;
		System.out.println(a3.num1 + ", " + a.num1);
		
	}

}

class A2{
	int num1;
	A2 () {}
	A2 (A2 x){
		num1 = x.num1;
	}
}


