package day26.library.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Book implements Serializable {

	private static final long serialVersionUID = -1240677805955422231L;
	//도서번호 : 도서관에서 지정
	//도서명, 저자, isbn
	private String num, title, author, isbn;
	private boolean loan; //대출 여부 (true이면 대출중임)
	
	@Override
	public String toString() {
		return "도서번호 : " + num + "\n" + "도서제목 : " + title + "\n" + 
	"도서저자 : " + author + "\n" + "ISBN  :" + isbn + "\n";
	}
	
	public Book(String num, String title, String author, String isbn) {
		super();	//부모클래스의 생성자 호출,  부모는 Object
		this.num = num;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public void loanBook() {  //setLoan(true);
		this.loan = true;	
	}
	
	public void returnBook() {	//setLoan(false);
		this.loan = false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(num, other.num);
	}

	
}

