package day5.switchex;

public class EvenEx {

	public static void main(String[] args) {
		//switch문으로 홀짝 예제
		int num = 5;
		
		switch(num % 2) {
		case 0 :
			System.out.println("짝수");
			break;
		case 1 :
			System.out.println("홀수");
		}
		
	}

}
