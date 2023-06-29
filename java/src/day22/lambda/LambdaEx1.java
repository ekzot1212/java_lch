package day22.lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		//람다식 x
		InterfaceA a = new InterfaceA() {
			@Override
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
			}
		};
		System.out.println(a.getMax(10, 20));
		
		
		//람다식 o
		InterfaceA b = (num1,num2)->{
			return num1 >= num2 ? num1 : num2 ;
		};
		System.out.println(b.getMax(10, 20));

		// 람다식 o 생략 o
		InterfaceA c = (num1, num2) -> 
			 num1 >= num2 ? num1 : num2; 
		System.out.println(c.getMax(10, 20));
	}

}


interface InterfaceA{
	int getMax(int num1, int num2);
}