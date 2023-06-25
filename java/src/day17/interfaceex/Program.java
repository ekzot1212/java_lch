package day17.interfaceex;

public interface Program {
	/* public final static */	int NUM = 10;	//클래스 상수 => 클래스를 이용하여 호출	
	//인터페이스는 상수라서 값 넣어줘야 에러안남.
	
	/*public abstract*/ void run();		// 추상메서드 이기 때문에 구현부가 없다.
	
	//void stop();	이렇게 추가되면 메서드 오버라이딩을 해야 에러가 안남.
					//이런 점을 편하게 하려고 디폴트메서드를 씀
	default void stop() {
		System.out.println("Program STOP");
	}
}
