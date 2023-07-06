package day27.attendancebook.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

//-출석 클래스 (학생 한명이 특정날에 출석했는지 알 수 있는 클래스)
@Data
public class Attendance {
	
	private Date date;
	private Student student;
	private boolean attendance;
	
	
	public Attendance(Date date, Student student, char state) {
		super();
		this.date = date;
		this.student = student;
		this.attendance = state == 'O' ? true : false;
	}

	@Override
	public String toString() {
		return student.toString() + " : " + (attendance ? "O" : "X");
	}
	
	public void attend(Student student) {
		this.attendance = true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendance other = (Attendance) obj;
		return Objects.equals(date, other.date) && Objects.equals(student, other.student);
	}

	public String getDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}

	
}
