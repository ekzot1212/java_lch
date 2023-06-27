package day20.homework.vocabulrarynote.vo;

import java.util.ArrayList;
import java.util.Objects;

import lombok.Data;

@Data		//getter, setter, toString, equals 를 자동 추가하는 어노테이션
public class Word {
	/*
	 * 한 단어를 관리하는 클래스
	 */
		// 멤버변수
		private String title;
		private ArrayList<String> meaning = new ArrayList<>();
		
		//생성자
		public Word(String title, String meaning) {
			this.title = title;
			this.meaning.add(meaning); 
		}
		public Word(String title) {
			this.title = title;
		}
		
		//복사 생성자 인듯?
		/*
		public Word(Word w) {		
			this.title = w.title;
			this.meaning = new String[5];
			for(int i = 0; i< w.meaningCount; i++) {
				meaning[i] = w.meaning[i];
			}
			meaningCount = w.meaningCount;
		}
		*/
		
		
		//메서드
		
		
		/**
		 * 단어와 뜻을 출력하는 메서드
		 * 매개변수 : 없음
		 * 리턴타입 : 없음 => void
		 * 메서드명 : print
		 * 
		 */
		public void print() {
			System.out.println("word : " + title);
			//System.out.println("meaning : ");
			System.out.println(meaning);
		}
		
		/**
		 * 뜻을 추가하는 메서드
		 * 매개변수 : 뜻 -> string
		 * 리턴타입 : void
		 * 메서드명 : addMeaning
		 */
		public void addMeaning(String meaning) {
			
			if(this.meaning.size() == 5) {
				System.out.println("뜻이 가득찼습니다.");
				return;
			}
				this.meaning.add(meaning);	//뜻 추가
		}
		
		
		
		/**
		 * 뜻을 제거하고, 제거 여부를 알려주는 메서드
		 * 매개변수 : 제거할 뜻의 번호 => int num
		 * 리턴타입 : 제거여부 -> boolean
		 * 메서드명 : removeMeaning
		 */
		public boolean removeMeaning(int num) {
			int index = num-1;
			
			// 인덱스 범위 벗어나면 예외처리 해야함.
			if(index < 0 || index >= this.meaning.size()) {
				System.out.println("뜻 번호 입력 오류입니다.");
				return false;
			}
			//뜻 삭제
			this.meaning.remove(index);
			return true;
				
				

		}
		/**
		 * 수정할 뜻의 번지와 수정할 뜻이 주어지면 뜻을 수정하고 수정 여부를 알려주는 메서드
		 * 매개변수 : 수정할 뜻의 번호, 수정할 뜻 = int meaingNum, String meaning
		 * 리턴타입 : 수정 여부 -> boolean
		 * 메서드명 : updateMeaing
		 * @param meaningIndex
		 * @param meaning2
		 * @return
		 */
		public boolean updateMeaning(int meaningNum, String meaning) {
			int index = meaningNum -1;
			
			this.meaning.set(index, meaning);
			return true;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Word other = (Word) obj;
			return Objects.equals(title, other.title);
		}
		@Override
		public int hashCode() {
			return Objects.hash(title);
		}

		/*
		//getter
		public String getTitle() {
			return title;
		}
		//setter
		public void setTitle(String title) {
			this.title = title;
		}
		*/
		
		
		

	}