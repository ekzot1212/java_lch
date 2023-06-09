package day8.method;

public class MethodCallStackEx2 {
	
	public static void HelloWorld(int n)
	{
		// n이 0인 경우 return
		if(n == 0)
			return;
		
		System.out.println("HelloWorld"); // HelloWorld 출력
		HelloWorld(n-1); // 재귀함수 시작
	}
	
	
	

	public static void main(String[] args) {
		HelloWorld(5);
	}
}
