package day7.homework;

public class StarEx6 {

	public static void main(String[] args) {
		/*    *		i=1 공=3
		 *   ***	1=2 공=2
		 *  *****
		 * *******
		 * 
		 *  *****
		 *   ***
		 *    *
		 */   
		
		int num = 7;

		for (int i = 1; i <= num; i++) {
			int half = (num + 1) / 2;
			// 4줄 => (num + 1) / 2
			if (i <= half) {
				// half-i개 공백 출력
				for (int j = 1; j <= half - i; j++) {
					System.out.print(' ');
				}
				// 2*i-1개 * 출력
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print('*');
				}
				// 줄바꿈
				System.out.println();
			} else {
				// i-half개 공백 출력
				for (int j = 1; j <= i - half; j++) {
					System.out.print(' ');
				}
				// 2*(num-i)+1개 * 출력
				for (int j = 1; j <= 2 * (num - i) + 1; j++) {
					System.out.print('*');
				}
				// 줄바꿈
				System.out.println();
			}

		}
		// 3줄
	}

}

