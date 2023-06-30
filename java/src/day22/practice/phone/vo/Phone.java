package day22.practice.phone.vo;

import java.util.Objects;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
	String name;
	String phoneNumber;
	
	
	//전화번호가 010-xxxx-xxxx 패턴이 맞는지 확인해주는 메서드
	private boolean checkNumber(String num) {
		String regex = "^010(-\\d{4}){2}$";
		return Pattern.matches(regex, num);
		
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	}
	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber);
	}




	
	
	
	
}
