package day18.practice;


public class StringIndexOfEx {

	public static void main(String[] args) {

		// indexOf		// Hello world에서 l이 몇개 있는지 확인하는 코드를 작성
		String str = "Hello world";
		int count = 0;
		String search = "l";
		int index = -1;
		// 반복
			//Hello world에 1의 위치를 찾음 -> lo world에서 1의 위치를 찾음 -> o world에서 l의 위치 찾음
			// =>d에서 l의 위치를 찾음
		
		do {
			index = str.indexOf(search, ++index);
			
			if(index != -1) {
				count++;
			}
			
		}while(index != -1);
		System.out.println(str + " : " + search + " : " + count);
		
	}
	
	

}
