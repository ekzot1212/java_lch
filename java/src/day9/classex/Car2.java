package day9.classex;

public class Car2 {
	
	private String name;
	private String company;
	private int year;
	private int speed;
	private char gear;
	private boolean power;
	
	
	public Car2(String name, String company, int year) {
		super();
		this.name = name;
		this.company = company;
		this.year = year;
		gear = 'P';
	}
	
	
	public void printInfo() {
		System.out.println("자동차 정보");
		System.out.println("차명 : " +  name);
		System.out.println("제조사 : " +  company);
		System.out.println("연식 : " +  year);
		System.out.println("속력 : " +  speed);
		System.out.println("기어 : " +  gear);
		System.out.println("전원 : " +  (power ? "On" : "Off"));
		System.out.println();
	}
	
	public void speedChange(boolean positive) {
		if(!power)
			return;
		else if(gear == 'P' || gear == 'N') {
			return;
		}
		else if(positive)
			speed++;
		else if(speed >0)
			speed--;
	}

	

	public void turn() {
		if(power ==false)
			power = true;
		else if(gear == 'P')
			power = false;
	}
	
	public void setGear(char gear) {
		this.gear = gear;
	}

	
}







