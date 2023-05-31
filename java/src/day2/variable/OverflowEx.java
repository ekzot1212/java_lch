package day2.variable;

public class OverflowEx {

	public static void main(String[] args) {
		// 오버플로우
		byte num1 = 127;
		num1++;
		System.out.println(num1);

		
		// 언더플로우
		byte num2 = -128;
		num2--;
		System.out.println(num2);
		
	}

}
