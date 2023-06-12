package day9.classex;

public class CarMain2 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2("아반떼", "현대", 2023);
		myCar.turn();
		myCar.setGear('D');
		myCar.printInfo();
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.printInfo();
		myCar.speedChange(false);
	}
	
}


