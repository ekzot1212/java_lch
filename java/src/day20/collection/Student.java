package day20.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data	//equals가 오버라이딩됨.
@AllArgsConstructor
public class Student {
	private int grade, classNum, num;
	private String name;
}
