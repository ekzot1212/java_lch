package day12.practice;

public class VocabularyNote {
	/*
	 * 영어 단어장 클래스를 만들고 테스트 하는 코드를 작성하세요.
	 */
	// 멤버변수
	private Word wordList[];
	private int wordCount;

	// 생성자
	public VocabularyNote() {
		wordList = new Word[10];
	}
	//생성자 2
	public VocabularyNote(Word wordList[]) {
		//기존 단어장의 크기와 10을 비교해서 큰 수로 단어장 크기로 선택
		int size = wordList.length > 10 ? wordList.length : 10;
		this.wordList = new Word[size];
		for(int i = 0; i < wordList.length; i++) {
			this.wordList[i] = new Word(wordList[i]);
		}
		wordCount = wordList.length;
	}

	// 메서드
	/**
	 * 단어들을 출력하는 메서드
	 * 매개변수 :
	 * 리턴타입 :
	 * 메서드명 : 
	 * @param word
	 */
	public void print() {
		System.out.println("=====================");
		for(int i = 0; i < wordCount ; i++) {
			wordList[i].print();
			System.out.println("=====================");
		}
	}
	/**
	 * 단어가 주어지면 단어장에 추가하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**
	 * 단어가 주어지면 단어장에 삭제하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**
	 * 단어가 주어지면 단어장에 해당 단어를 출력하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**
	 * 단어와 뜻이 주어지면 없는 단어이면 새로 단어를 추가하고,
	 * 있는 단어이면 뜻만 새로 추가하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**
	 * 단어와 수정할 뜻의 번호와 수정할 뜻이 주어지면 단어의 뜻을 수정하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**
	 * 단어와 수정할 단어가 주어지면 단어를 수정하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
}
