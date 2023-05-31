package day2.scanner;

import java.util.Scanner;		//import 단축키 ctrl + shift + O

public class ScannerEx {

	public static void main(String[] args) {
		//System.in : 표준 입력
		//표준 입력을 이용해서 스캐너를 생성.
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("정수를 입력해 주세요.");
		
		int num1 = sc.nextInt();	//정수를 입력받음.
		System.out.println(num1);
		
		System.out.println("실수를 입력해 주세요.");
		double num2 = sc.nextDouble();			// 실수 입력값을 얻고 '엔터" 라는 정보가 남음.
		System.out.println(num2);
		
		System.out.println("문자열1을 입력해 주세요.");
		sc.nextLine();							//nextLine 쓰기 전에 한번 넣어야 함. (남아있는 엔터를 처리하기 위해서)
		String str1 = sc.nextLine();		//스페이스를 포함한 문자열 한줄을 읽어옴.
		System.out.println(str1);
		
		System.out.println("문자열2를 입력해 주세요.");
		String str2 = sc.next();			//공백이 들어가면 그 전까지만 출력이 됨.
		System.out.println(str2);
		
		System.out.println("문자를 입력해 주세요.");
		char ch = sc.next().charAt(1);		//next()를 이용하여 한 단어를 읽어오고 읽어온 단어의 첫 글자를 가져옴. 
																		// charAt(인덱스)
		System.out.println(ch);
		
		
		sc.close();			// close 하지 않아도 상관 없지만, 주의 표시가 생긴다.
	}

}
