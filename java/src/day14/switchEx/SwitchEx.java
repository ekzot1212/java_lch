package day14.switchEx;

public class SwitchEx {

	public static void main(String[] args) {
		
		/* switch문에서 case에 변수를 선언하면
		 * 다른 case에서 선언할 수 없다는걸 보여주는 예제
		 * case문에 break가 필수가 아님
		 * ==> break가 없는 경우 다음 case의 실행문으로 이동
		 * */
		int menu = 1;
		
		switch(menu) {
		case 1:
			String title = "제목1";
			System.out.println(title);
			break;
		case 2:
			String title2 = "제목2";		// title이 case 1에 있어서 선언 불가.
			//case 2에서 title을 쓰면 에러 발생
			// => title을 쓰기 위해서는 case 1을 반드시 지나야 하는데,
			// 	  menu가 2일 경우 case2가 바로 실행되기 때문.
			// system.out.println(title);
			System.out.println(title2);	// break는 필수가 아니기 때문에 반복으로 선언될 수 있기 때문임.
			break;
		case 3:
			break;
			
		}
	}

}
