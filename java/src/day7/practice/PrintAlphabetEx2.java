package day7.practice;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {
		
		char ch = 'a';
		for (int i = 1; i < 26; i++) {
			
			for (int j = 0; i > j; j++) {
				System.out.print((char) (ch + j) + " ");
			}
			
			System.out.print("\n");
		}
	}

}
