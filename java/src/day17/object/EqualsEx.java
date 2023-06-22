package day17.object;

import java.util.Objects;

import lombok.Data;

@Data
public class EqualsEx {

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer list[] = {
				new Customer("홍","010-1234-5678"),
				new Customer("임","010-1111-1111"),
				new Customer("유","010-5555-5555")
		};
		
		Customer customer = new Customer("홍", "010-1234-5678");
		Customer customer2 = (Customer)customer.clone();
		System.out.println(customer2.toString());
		//equals()가 오버라이딩 안됐을 때 고객이 명단에 있는지 조회
		/*
		for(Customer tmp : list) {
			if(tmp.getPhoneNumber().equals(customer.getPhoneNumber())){
				System.out.println("OK");
				return;
			}
		}
		System.out.println("FAIL");
		*/
		
		//equals()가 오버라이딩 됐을 때 고객이 명단에 있는지 조회
		for(Customer tmp : list) {
			if(tmp.equals(customer)){		//?????????????
				System.out.println("OK");
				return;
			}
		}
		System.out.println("FAIL");
		
	}

}

@Data
class Customer implements Cloneable{
	private String id;
	private String name;
	private String phoneNumber;
	
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	
/** 그냥 객체만 입력하면 알아서 phoneNumber로 같은지 비교해주는 메서드임 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	public Object clone() throws CloneNotSupportedException {		//예외 처리??
		return super.clone();
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}


	
	
}