package day13.homework;

import java.util.Scanner;

/*
 * 영어 단어장 프로그램을 구현하세요.
 * Word, VocabularyNote 클래스 이용
 * 메뉴
 * 1. 단어 추가
 * 2. 단어 삭제
 * 3. 단어 수정
 *    a. 단어 수정
 *    b. 뜻 수정
 *    c. 뜻 삭제
 * 4. 단어 출력
 *    a. 전체 출력
 *    b. 검색
 * 5. 프로그램 종료
 * 
 * ---- 예
 *  메뉴
 * 1. 단어 추가
 * 2. 단어 삭제
 * 3. 단어 수정
 *    a. 단어 수정
 *    b. 뜻 수정
 *    c. 뜻 삭제
 * 4. 단어 출력
 *    a. 전체 출력
 *    b. 검색
 *  
 * 메뉴 선택 : 3
 * 
 * 서브 메뉴
 * 1. 단어 수정
 * 2. 뜻 수정
 * 3. 뜻 삭제
 * 
 * 서브 메뉴 선택 : 1
 * 수정 할 단어 :a
 * 수정될 단어 : A
 * 수정에 성공했습니다.
 * 
 */
public class VocabularyNoteEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch=0;
		Word [] wordList = {
			new Word("a", "a"),
			new Word("b", "b")
		};
		VocabularyNote note = new VocabularyNote(wordList);
		
		do {
			System.out.println();
			System.out.println("메뉴");
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 삭제");
			System.out.println("3. 단어 수정");
			System.out.println("    a. 단어 수정");
			System.out.println("    b. 뜻 수정");
			System.out.println("    c. 뜻 삭제");
			System.out.println("4. 단어 출력");
			System.out.println("    a. 전체 출력");
			System.out.println("    b. 검색");
			System.out.println("5. 프로그램 종료");
			System.out.println();
			
			ch = sc.next().charAt(0);
			if(ch == '1') {
				System.out.println("추가할 단어와 뜻을 입력하시오.");
				note.insert(sc.next(),sc.next());
				System.out.println("추가 성공.");
			}
			else if(ch == '2') {
				System.out.println("삭제할 단어를 입력하시오.");
				note.delete(sc.next());
				System.out.println("삭제 성공.");
			}
			else if(ch == '3') {
				System.out.println("    a. 단어 수정");
				System.out.println("    b. 뜻 수정");
				System.out.println("    c. 뜻 삭제");
				char ch2 = sc.next().charAt(0);
				if(ch2 == 'a') {
					System.out.println("수정할 단어를 입력하시오.");
					note.updateTitle(sc.next(), sc.next());
					System.out.println("수정 성공.");
				}
				
				else if(ch2 == 'b') {
					System.out.println("수정 할 단어, 번호, 수정할 뜻을 입력하시오.");
					note.updateMeaning(sc.next(), sc.nextInt(), sc.next());
					System.out.println("수정 성공.");
				}
				else if(ch2 == 'c') {
					System.out.println("삭제 할 단어를 입력하시오.");
					note.delete(sc.next());
					System.out.println("삭제 성공.");
				}
				else {
					System.out.println("메뉴 선택을 잘못하였습니다.");
				}
			}
			else if(ch == '4') {
				System.out.println("    a. 전체 출력");
				System.out.println("    b. 검색");
				char ch2 = sc.next().charAt(0);
				if(ch2 == 'a') {
					note.print();
				}
				
				else if(ch2 == 'b') {
					System.out.println("검색 할 단어를 입력하시오.");
					note.search(sc.next());
				}
				
				else {
					System.out.println("메뉴 선택을 잘못하였습니다.");
				}
			}
		}while(ch != '5');
	}

}
