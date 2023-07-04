package practice.university.vo;

import java.util.Objects;

import lombok.Data;

@Data
public class Student {
	
	private static int countNum = 1000;
	private int studentNum;
	private String name;
	private String department ;
	
	public Student( String name, String department) {
		this.name = name;
		this.department = department;
		this.studentNum = ++countNum;
	}
	public Student(int studentNum) {
		this.studentNum = studentNum;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentNum == other.studentNum;
	}

	@Override
	public String toString() {
		return "Student [이름=" + name + ", 학과=" + department + ", 학번="+ studentNum + "]";
	}

	
	
}
