package day12.practice;



public class VocabularyNoteEx2 {

	public static void main(String[] args) {
		Word wordList[] = {
				new Word("ABC"),
				new Word("def", "def is define")
		};
		VocabularyNote note = new VocabularyNote(wordList);
		//note.print();
		
		Word word = new Word("a", "a");
		note.insert(word);
		//note.print();
		note.insert("b", "b is b");
		//note.print();
		
	//	note.delete("c");		//단어가 없습니다.
		note.delete("a");
		//note.print();
		
		//note.search("a");
		//note.search("b");
		
		note.insert("b","b");
	//	note.print();
		note.updateMeaning("b", 2, "B");
		//note.updateMeaning("b", 3, "B");		//잘못된 숫자입니다.
		//note.print();
		
		note.updateTitle("b","B");
		note.updateTitle("b","B");			//단어가 없읍니다.
		note.print();
		}
}
