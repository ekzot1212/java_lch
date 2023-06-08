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
		
		int line = 5;
		
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
		
		for (int i = line; i >0 ; i--) {
			for (int j = line ; j>=i ; j--) {
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
