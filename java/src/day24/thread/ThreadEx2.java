package day24.thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new ChildThread2());
		thread.start();
		
		for(int i = 0 ; i<10; i++) {
			System.out.println("+");
		}
	}

}
// ex1에서는 클래스를 상속받은 거라 그냥 바로 만들어도 되는데
// 러너블 인터페이스를 구현한 것이라 생성자를 매개변수로 넣어줘야 함.
class ChildThread2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 10; i ++) {
			System.out.println("-");
		}
	}
	
}
