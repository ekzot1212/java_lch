package day7.homework;

public class StarEx5 {

	public static void main(String[] args) {
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */
		
		int line = 10;
		
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
		
		for (int i = line-1; i >0 ; i--) {
			for (int j = line-1 ; j>=i ; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i-2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
