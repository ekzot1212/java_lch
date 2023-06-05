package day5.whileex;

public class HelloWorldEx {

	public static void main(String[] args) {
		//Hellow world를 10번 출력하는 코드
		
		int i = 0;
		int max = 3;
		while(i<max) {
			i++;
			System.out.println("Hello World !");
		}
		System.out.println("================");
		
		/*
		 * 반복횟수 : i는 10부터 1까지 1씩 감소
		 */
		
		i = max;
		while(--i > 0) {		//이렇게도 증감 가능
			System.out.println("Hello world !");
		}
	}

}
