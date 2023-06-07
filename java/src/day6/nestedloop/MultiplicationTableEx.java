package day6.nestedloop;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력하는 코드를 작성하세요.

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + j * i);
			}
			System.out.println("============");
		}

	}

}
