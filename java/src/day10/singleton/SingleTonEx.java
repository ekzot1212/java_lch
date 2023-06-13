package day10.singleton;

public class SingleTonEx {

	public static void main(String[] args) {
		//SamsungCompany company = new SamsungCompany();
		
	}

}

class SamsungCompany{
	private static SamsungCompany company = new SamsungCompany();
	
	private String name;
	private String address;
	
	private SamsungCompany() {
	name = "Samsung";
	address = "korea";
	}
	public static SamsungCompany getInstance() {
		return company;
	}
}