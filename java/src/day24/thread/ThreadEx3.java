package day24.thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{	//한번만 써도 된다면 주로 runnable인터페이스를 구현해줌 (람다식으로)
			for(int i = 0; i<10; i++) {
				System.out.println("-");
			}
		});	
		// thread.run(); // 멀티 쓰레드가 아닌 싱글 쓰레드. main쓰레드 위에서 run()을 실행
		thread.start();	// 새로운 쓰레드를 만들고, 만들어진 쓰레드에 run()을 실행
		for(int i = 0; i < 10; i ++) {
			System.out.println("+");
		}
	}

}
