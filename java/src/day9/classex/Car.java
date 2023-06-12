package day9.classex;

public class Car {
	
	//멤버 변수(필드)		//멤버변수는 주로 private
	private String name;
	private String company;
	private int year;
	private int speed;
	private char gear;
	private boolean power;		//boolean은 기본값이 false로 초기화 됨.
	
	
	
	//생성자
	public Car(String _name, String _company, int _year) {
//		super(); 먼지 모름
		name = _name;
		company = _company;
		year = _year;
		gear = 'P';
		
	}
	
	//메서드
	/**
	 * 자동차 정보를 출력하는 메서드
	 * 매개변수 : 
	 * 리턴타입 :
	 * 메서드명 : printInfo
	 */
	
	public void printInfo() {
		System.out.println("자동차 조회");
		System.out.println("제조사 : " + company);
		System.out.println("모델  : " + name);
		System.out.println("연식  : " + year);
		System.out.println("전원  : " + (power ? "ON" : "OFF"));
		System.out.println("기어  : " + gear);
		System.out.println("속력  : " + speed);
		System.out.println();
	}
	
	/**
	 * 속력이 1씩 증감하는 메서드
	 * 매개변수 : 증가 할 건지. => boolean positive
	 * 반환타입 : 없음 => void
	 * 메서드명 : speed
	 * 
	 */
	
	public void speedChange(boolean positive) {
		//전원이 꺼져있으면 메서드 종료.
		if(!power)	
			return;
		
		//기어가 중립 또는 주차중이면 종료
		if(gear == 'N' || gear == 'P')
			return;
		
		//속력이 증가하는 경우이면
		if(positive) 
			speed ++;
		
		//속력이 감소하는 경우이고, 음수가 아니라면
		else if(speed > 0)
			speed --;
	}
	/**
	 * 자동차 시동을 켜거나 끄는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메서드 명 : turn
	 * 
	 */
	
	public void turn() {
		if(!power)
			power = true;
		else if(gear == 'P')
			power = false;
	}


	public void setGear(char gear) {
		this.gear = gear;
	}
	
}







