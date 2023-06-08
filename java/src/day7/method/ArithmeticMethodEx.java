package day7.method;

public class ArithmeticMethodEx {

	public static void main(String[] args) {
		int i = 10;
		int j = 11;
		
		System.out.println(sum(i,j));
		System.out.println(sub(i,j));
		System.out.println(mul(i,j));
		System.out.println(div(i,j));
		System.out.println(mod(i,j));
		sumPrint(i,j);
		
		
	}
	/**
	 * 주어진 num1, num2의 합을 출력하는 메소드
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	public static void sumPrint(int num1, int num2) {
	System.out.println(num1 + num2);
	}
	
	/**
	 * 주어진 num1, num2의 합을 알려주는 메소드.
	 * @param num1
	 * @param num2
	 * @return	num1과 num2의 합
	 */
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static double div(int num1, int num2) {
		return num1/(double)num2 ;
	}
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	
}
