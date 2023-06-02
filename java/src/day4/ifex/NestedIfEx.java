package day4.ifex;

public class NestedIfEx {

	public static void main(String[] args) {
		/*
		 * 2, 3, 6의 배수 판별 예제
		 * (day4.practice패키지에 IfMultipleEx 문제)
		 *    
		 */
		
		int num = 12;
		
		if(num % 2 == 0) {
			if(num % 6 == 0) {
				System.out.println("6의 배수입니다.");
			}
			
			else {
				System.out.println("2의 배수입니다.");
			}
		
		}
		
		else if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		else {
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		}
		
	}
}
