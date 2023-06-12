package day9.classex;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 현대 뉴 아반떼 2023년식 자동차 객체를 생성하는 코드를 작성.
		 */
		
		//객체를 생성
		Car myCar = new Car("New Avante", "Hyundai", 2023);
		//객체.메소드명 (자동차 정보 조회 메서드 = Car.printInfo();)
		myCar.turn();
		myCar.printInfo();
		myCar.setGear('D');
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.printInfo();
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.printInfo();
		
	}
	
}


