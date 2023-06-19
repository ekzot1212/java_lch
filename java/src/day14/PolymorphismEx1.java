package day14;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		AirCon aircon = new AirCon();
		Radio radio = new Radio();
		//Appliance appliance = new Appliance();
		RemoteCon remotecon = new RemoteCon();
		
		remotecon.turnOn(tv);
		remotecon.turnOn(aircon);
		remotecon.turnOn(radio);
		remotecon.turnOn(tv);
	}

}

class Appliance{
	boolean power ;
	
	public void turnOn() {
		power = true;
	}
	
	public void turnOff() {
		power = false;
	}
}

class TV extends Appliance{
}

class Radio extends Appliance{
}

class AirCon extends Appliance{
}

class RemoteCon{
	public void turnOn(Appliance appliance) {
		appliance.turnOn();
		System.out.println("전원 켜짐.");
	}
	public void turnOff(Appliance appliance) {
		appliance.turnOff();
		System.out.println("전원 꺼짐.");
	}
}
