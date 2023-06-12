package day9.classex;

import java.util.Scanner;

public class StudentScoreManager {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//korScore를 인스턴스(객체)를 생성한다.		//생성자는 멤버변수를 쉽게 초기화 함.
		//Score1 korScore = new Score1(1,2,"korean Language");
		Score1 korScore = new Score1();
		korScore.title = "Korean Language";		//변수에 static키워드가 안붙으면 객체.멤버변수 로 호출
		korScore.grade = 1;
		korScore.semester = 2;
		Score1 engScore = new Score1(1,2,"English");
	}

}
//성적 클래스
class Score1{
	String title;//과목명
	int grade;//학년
	int semester;//학기
	


	double total;//총점수
	double midExam;//중간고사
	double finalExam;//기말고사
	double performance;//수행평가
	//Score1 클래스의 기본 생성자
	public Score1() {}
		/*
		 * title의 기본값은? == null
		 * grade의 기본값은? == 0
		 * total의 기본값은? == 0.0
		 */
	
	public Score1(int _grade, int _semester, String _title) {
		grade = _grade;
		semester = _semester;
		title = _title;
		
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getMidExam() {
		return midExam;
	}

	public void setMidExam(double midExam) {
		this.midExam = midExam;
	}

	public double getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}

	public double getPerformance() {
		return performance;
	}

	public void setPerformance(double performance) {
		this.performance = performance;
	}
	
	public Score1(String title, int grade, int semester, double total, double midExam, double finalExam,
			double performance) {
		this.title = title;
		this.grade = grade;
		this.semester = semester;
		this.total = total;
		this.midExam = midExam;
		this.finalExam = finalExam;
		this.performance = performance;
	}
	
}

//학생 클래스
class Student1{
	String name;//이름
	String residentNumber;//주민번호
	int grade;//학년
	int classNum;//반번호
	int numbr;//번호
	int admissionYear;//입학년도
	Score1 koreScore, engScore, mathScore;
	
	public Student1(String name,String residentNumber) {
		this.name = name;
		this.residentNumber = residentNumber;
	}
}

/*
클래스는 멤버변수, 메서드, 생성자로 구성
멤버변수 : 속성
메서드 : 기능

자동차 
속력을 올림
자동차 색상을 검은색

자동차 			  : 클래스
속력을 올림 		  : 메서드
자동차 색상 		  : 멤버변수
공장에서 막 나온 자동차 : 생성자
*/