package operator;

public class IncreaseOperatorEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		
		System.out.println("작업 전 : " + num1 + "(전위형), " + num2 + "(후위형)");
		System.out.println("작업 중 : " + ++num1 + "(전위형), " + num2++ + "(후위형)");
		System.out.println("작업 후 : " + num1 + "(전위형), " + num2 + "(후위형)");
		
		System.out.println("=================================================");
		
		num1 = num2 = 10;
		System.out.println("작업 전 : " + num1 + "(전위형), " + num2 + "(후위형)");
		num1++;
		System.out.println("작업 중 : " + num1 + "(전위형), " + num2 + "(후위형)");
		num2++;
		System.out.println("작업 후 : " + num1 + "(전위형), " + num2 + "(후위형)");
	
	}

}
