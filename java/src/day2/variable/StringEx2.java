package day2.variable;

public class StringEx2 {

	public static void main(String[] args) {
		
		String str = "";
		char op = '+';		//char = 2byte
		int num1 = 1, 		//int = 4byte
			num2 = 2;
		str = num1 + op + num2 + "=" + (num1+num2);
			//num1 + op가 먼저 계산이 돼서 + 에 해당하는 43과 1,2 가 더해져서 46이 됨.
		str = "" + num1 + op + num2 + "=" + (num1+num2);
			//"" 추가해서 문자열로 형 변환
		System.out.println(str);
		
		
		
		
	}

}
