package day19.exception;

public class TryCatchEx {

	public static void main(String[] args) {
		
		try {
			//예외가 발생할 수 있는 코드
			System.out.println(1 / 0);	//ArithmeticException이 발생
		}catch(ArithmeticException e) {
			System.out.println("예외처리를 합니다.");
		}
		catch(Exception e) {			
			//첫 번째 catch로 가서 ArtithmeticException 클래스의 객체를 Exception으로 변환 가능한지 확인하고
			//가능하면 처리
			System.out.println("예외처리를 합니다.");
			//위의 Exception에서 모든 예외가 걸리기 떄문에 아래 있는 catch를 실행할 일이 없음.
		}
		System.out.println("프로그램 종료");
	}

}
