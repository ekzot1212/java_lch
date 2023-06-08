package day7.practice;

public class StarEx4 {

	public static void main(String[] args) {
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */
		int line = 6;
		
		for (int i = 1; i <= line ; i++) {
			for (int j = line ; j>i ; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
