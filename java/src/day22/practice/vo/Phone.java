package day22.practice.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
	String name;
	String phoneNumber;
	
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
