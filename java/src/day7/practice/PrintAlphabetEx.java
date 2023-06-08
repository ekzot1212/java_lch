package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		char ch = 'a';
		
		for(;;ch++) {
			System.out.print(ch + " ");
			if(ch == 'z') 
				break;
		}
		
		// ======================================
		// ======================================

		
		System.out.println();
		ch = 'a';
		for(int i = 0 ; i < 26 ; i ++) {
			System.out.print((char)(ch + i) + " ");
		}
	}

}
