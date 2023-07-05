package day25.teacher.student.vo;

import java.io.Serializable;

public class Student implements Serializable {

	//마우스 올리고 add generate 시리얼 버전 ID
	//시리얼 버전ID가 같아야 불러올 수 있음
	private static final long serialVersionUID = -1786530247989838440L;
	private String num, name, major;

	public Student(String num, String name, String major) {
		this.num = num;
		this.name = name;
		this.major = major;
	}
	

	@Override
	public String toString() {
		return "학번 : " + num + "\n이름 : " + name + "\n전공 : " + major;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
