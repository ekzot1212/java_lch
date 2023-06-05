package day5.practice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		//10 이하의 짝수를 출력하는 코드를 작성하세요.
		
		/*
		 * 방법1.
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : 2*i를 출력
		 */
		
		/*
		 * 방법2.
		 * 반복횟수 : i는 2부터 10까지 2씩 증가
		 * 규칙성 : i를 출력
		 */

		/*
		 * 방법1.
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : i가 짝수이면 i를 출력
		 */
		int count = 5;
		int i= 1;
		while(i <= count) {
			System.out.println(i*2);
			i++;
		}
		System.out.println("===========");

		i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}
		
		System.out.println("===========");
		i = 1;
		int max = 10;
		while (i <= max) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
