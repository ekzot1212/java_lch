package day15.polymorphism;


public class InstancePolymorphismEx {

	public static void main(String[] args) {
		/*
		 * TV 1대, 에어컨 2대, 라디오 3대를 객체로 생성한 후 
		 * 전원을 켜는 기능을 실행해보세요.
		 */
		RemoteControl remocon = new RemoteControl();
		/*
		
		
		TV tv1 = new TV();
		AirConditioner airConditioner1 = new AirConditioner();
		AirConditioner airConditioner2 = new AirConditioner();
		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		Radio radio3 = new Radio();
		
		remocon.turnOn(tv1);
		remocon.turnOn(airConditioner1);
		remocon.turnOn(airConditioner2);
		remocon.turnOn(radio1);
		remocon.turnOn(radio2);
		remocon.turnOn(radio3);
		*/
		
		/*
		TV tv = new TV();
		AirConditioner aircons[] = new AirConditioner[2];
		Radio radios[] = new Radio[3];
		
		for(int i = 0; i<aircons.length ; i++) {
			aircons[i] = new AirConditioner();
		}
		for(int i = 0 ; i< radios.length ; i++) {
			radios[i] = new Radio();
		}
		remocon.turnOn(tv);			//매개변수의 다형성
		for(AirConditioner aircon : aircons) {
			remocon.turnOn(aircon);		//매개변수의 다형성
		}
		for(Radio radio : radios) {
			remocon.turnOn(radio);		//매개변수의 다형성
		}
		*/
		
		//포함 다형성 예제, 객체 다형성 예제
		
		int tvCount = 1, airconCount = 2, radioCount = 3;
		int total = tvCount + airconCount + radioCount;
		HomeAppliance homeAppliances[] = new HomeAppliance[total];
		int count = 0;		//현재 만들어진 제품 대수
		//tv 1대 생성
		for(int i = 0; i < tvCount ; i++) {
			homeAppliances[count++] = new TV();		//업캐스팅
		}
		//aircon 2대 생성
		for(int i = 0; i < airconCount ; i++) {
			homeAppliances[count++] = new AirConditioner();		//업캐스팅
		}
		for(int i = 0; i < radioCount ; i++) {
			homeAppliances[count++] = new Radio();		//업캐스팅
		}
		//모든 제품의 전원을 켬
		for(HomeAppliance appliance : homeAppliances) {
			remocon.turnOn(appliance);
		}
		
		System.out.println("================");
		//모든 라디오의 전원을 끔
		for(HomeAppliance homeAppliance : homeAppliances) {
			//라디오로 다운캐스팅이 가능한 객체만 끔 => 라디오만 꺼짐
			if(homeAppliance instanceof Radio) {
			remocon.turnOff(homeAppliance); 		//다운 캐스팅이 아님.
			Radio radio = (Radio)homeAppliance;		//다운캐스팅	(라디오로 다시 형변환 해야함.)
			System.out.println(radio.frequency);
			}
		}
		
	}

}

class HomeAppliance {
	boolean power ;
	void turnOn() {
		power = true;
	}
	void turnOff() {
		power = false;
	}
}


class RemoteControl{
	public void turnOn(HomeAppliance appliance) {		//부모 클래스 HomeAppliance
		appliance.turnOn();
		System.out.println("전원이 켜졌습니다. ");
	}
	public void turnOff(HomeAppliance appliance) {
		appliance.turnOff();
		System.out.println("전원이 꺼졌습니다.");
	}
	
}

class TV extends HomeAppliance{
	boolean power;
	int channel;
}

class AirConditioner extends HomeAppliance{
	boolean power;
	double currentTemperature;
	double desiredTemperature; 
}

class Radio extends HomeAppliance{
	boolean power;
	double frequency;
}