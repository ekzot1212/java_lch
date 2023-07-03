package day24.thread;

//동기화 = 한번에 한개의 스레드만 프로세스 공유자원(객체)에 접근 할 수 있도록
// 		락을 걸어 다른 스레드가 진행 중인 작업에 접근하지 못하도록 하는 것
public class SynchronizedEx1 {

	public static void main(String[] args) throws InterruptedException {
		Passbook pb = new Passbook();	// pb라는 한 객체를 두곳의 쓰레드에서 동시에 접근해서 오류가 남
		User user1 = new User("Hong gil dong", pb);
		User user2 = new User("Hong ga", pb);
		user1.start();
		user2.start();
		
	}

}

/*
Hong gil dong : 10000
balance : 20000
Hong ga : 10000
balance : 20000
*/