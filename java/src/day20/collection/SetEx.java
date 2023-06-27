package day20.collection;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		//해시셋도 제너릭 클래스
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);	//순서 랜덤임ㅋ
		//제거
		set.remove(10);
		System.out.println(set);
		//있는지
		System.out.println(set.contains(20));
		//set.indexOf() 순서를 보장해 주지 않아서 indexOf XXX
		
		//사이즈
		System.out.println(set.size());
		
		
	}

}
