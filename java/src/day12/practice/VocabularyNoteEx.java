package day12.practice;
	 
	

public class VocabularyNoteEx {

	public static void main(String[] args) {
		Word word1 = new Word("coffee", "맛있다");
		word1.addMeaning("천재");
		word1.print();
		word1.addMeaning("바보뭉치");
		word1.addMeaning("바보뭉치");
		word1.addMeaning("바보뭉치");
		word1.addMeaning("바보뭉치");
		word1.addMeaning("바보뭉치");
		word1.print();
		word1.removeMeaning(1);
		word1.print();
	}
}
