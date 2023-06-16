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
	 * 단어가 주어지면 단어장에 추가하는 메서드(단어 객체를 넘겨주는 경우)
	 * 매개변수 : 단어(단어 객체) => Word word
	 * 리턴타입 : 없음 -> void
	 * 메서드명 : insert
	 */
	public void insert(Word word) {
		//단어장에 단어가 다 찼으면 추가를 하지 못함.
		if(wordCount == wordList.length) {
			System.out.println("단어장이 꽉 찼습니다 !");
			return;
		}
		// 깊은 복사를 위해 Word의 복사 생성자를 이용하여 
		// 새 단어를 생성한 후 추가
		wordList[wordCount++] = new Word(word);		//wordList[wordCount] = new Word(word)
													//wordCount++;
	}
	
	/**
	 * 단어와 뜻이 주어지면 없는 단어이면 새로 단어를 추가하고,
	 * 있는 단어이면 뜻만 새로 추가하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**
	 * 단어가 주어지면 단어장에 추가하는 메서드 (단어와 뜻을 넘겨주는 경우)
	 * 매개변수 : 단어와 뜻 -> String title, String meaning
	 * 리턴타입 : 없음 -> void
	 * 메서드명 : insert 
	 */
	public void insert(String title, String meaning) {
		//단어장에 단어가 다 찼으면 추가를 하지 못함.
		if(wordCount == wordList.length) {
			System.out.println("단어장이 꽉 찼습니다 !");
			return;
		}
		int index = indexOf(title);
		//없는 단어이면 새 단어를 추가
		if(index == -1) {
			// 단어와 뜻을 이용해 단어 객체를 생성한 후 단어장에 추가
			wordList[wordCount++] = new Word(title, meaning);
			return;
		}
		//있는 단어이면 뜻을 추가.
		wordList[index].addMeaning(meaning);
	}
	
	/**
	 * 단어가 주어지면 단어장에 삭제하는 메서드
	 * 매개변수 : 삭제할 단어 -> String title
	 * 리턴타입 : 없음 -> 
	 * 메서드명 : delete
	 */
	public void delete(String title) {
		//단어가 어디있는지 찾아야 함.
		int index = indexOf(title);
		//단어가 단어장에 없으면 알림 메세지 출력 후 종료
		if(index == -1) {
			System.out.println("단어가 없읍니다.");
			return;
		}
		//찾은 위치부터 한칸씩 당겨옴.
		for(int i = index; i<wordCount ; i++) {
			wordList[i] = wordList[i+1];	
		}
		
		//단어의 개수를 하나 줄여줌
		wordCount--;
		//마지막 단어를 비워줌(null)
		wordList[wordCount] = null;
	}
	/**
	 * 단어가 주어지면 단어가 있는 위치를 알려주는 메서드
	 * 단어가 없으면 ** -1을 리턴 **
	 * 매개변수 : 단어 - > String title
	 * 리턴타입 : 번지 -> int
	 * 메서드명 : indexOf
	 */
	public int indexOf(String title) {
		//단어장에 등록된 단어들을 조회
		for(int i = 0; i<wordCount; i++) {
			//단어가 같으면 i번지를 리턴
			if(wordList[i].getTitle().equals(title)) return i ;	
			//	wordList[i].getTitle() == title  **스트링은 '==' 으로 비교하면 안됨!
		}
		return -1;
	}
	
	/**
	 * 단어가 주어지면 단어장에 해당 단어를 출력하는 메서드
	 * 매개변수 : 단어 -> String title
	 * 리턴타입 : void
	 * 메서드명 : search
	 */
	public void search(String title) {
		int index = indexOf(title);
		
		if(index == -1) {
			System.out.println("단어가 없읍니다.");
			return;
		}
		
		wordList[index].print();
	}
	
	
	
	/**
	 * 단어와 수정할 뜻의 번호와 수정할 뜻이 주어지면 단어의 뜻을 수정하는 메서드
	 * 매개변수 : 단어, 수정할 뜻 번호, 수정할 뜻
	 * 			-> String title, int meaningIndex, String meaning
	 * 리턴타입 : 없음 -> void
	 * 메서드명 : updateMeaning
	 */
	public void updateMeaning(String title, int meaningIndex, String meaning) {
		
		int index = indexOf(title);
		if(index == -1) {
			System.out.println("단어가 없읍니다.");
			return;
		}
		
		if(!wordList[index].updateMeaning(meaningIndex, meaning)) {
			System.out.println("잘못된 숫자 입니다.");
		}
	}
	
	/**
	 * 단어와 수정할 단어가 주어지면 단어를 수정하는 메서드
	 * 매개변수 : 단어와 수정할 단어 -> String title, String updateTitle
	 * 리턴타입 : void
	 * 메서드명 : updateTitle
	 */
	public void updateTitle(String title, String updateTitle) {
		int index = indexOf(title);
		if(index == -1) {
			System.out.println("단어가 없읍니다.");
			return;
		}
		
		wordList[index].setTitle(updateTitle);
	}
}
