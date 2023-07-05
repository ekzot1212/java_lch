package day26.library.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

//도서 대출 기록
@Data
public class LoanBrowsing implements Serializable{
	public LoanBrowsing(Book book, Date date, int loanPeriod) {
		this.book = book;
		this.loanDate = date;
	}
	private static final long serialVersionUID = 2567865109997031730L;
	private Book book;	
	private Date loanDate;
	private Date returnDate;
	
	public String getLoanDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(loanDate);
	}
	public String getLoanDateStr2() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(returnDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanBrowsing other = (LoanBrowsing) obj;
		return Objects.equals(book, other.book);
	}

	
}
