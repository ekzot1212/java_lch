package day22.practice.phone2.vo;

import java.util.Objects;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class PhoneNumber {
	String name;
	String number;
	
	
	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number = "";
		if(checkNumber(number)) {
			this.number = number;
		}
	//	this.number = checkNumber(number) ? number : "";
		
	}
	
	//전화번호가 010-xxxx-xxxx 패턴이 맞는지 확인해주는 메서드
	//외부에서도 객체생성없이 쓸 수 있게 static과 public을 붙여줌
	public static boolean checkNumber(String num) {
		String regex = "^010(-\\d{4}){2}$";
		return Pattern.matches(regex, num);
		
	}
	
	public void setNumber(String number) {
		this.number = checkNumber(number) ? number : this.number;
									//true면 새로운 번호 , false면 기존 번호(공백)
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		return Objects.equals(name, other.name);
	}

	
	
	
	


	
	
	
	
}
