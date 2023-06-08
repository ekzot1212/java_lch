package day7.practice;

public class ContinueEx {

	public static void main(String[] args) {
		//Continue문을 이용한 10이하 짝수 출력 예제
		
		int sum = 0 ;
		int i ;
		for (i = 1 ; i < 11 ; i ++) {
			if(i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
		i = 0;
		
		while(i++ <= 10) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	

}
