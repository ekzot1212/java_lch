package day11.practice;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int min = 1, max = 9;

		// 방법1 : 9번지까지 있는 배열을 이용
		// 작업은 단순하지만 저장공간이 필요함.
		boolean checkArr[] = new boolean[10];

		for (int i = 0; i < 3;) {
			int random = (int) (Math.random() * (max - min + 1) + min);
			// checkArr 배열에 random번지에 있는 값이 false이면

			if (checkArr[random] == false) {
				// random을 배열에 저장.
				arr[i] = random;
				// i를 증가.
				i++;
				// checkArr배열에 random번지에 있는 값을 true로 변경.
				checkArr[random] = true;
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========================");
		
		//방법2 : 저장된 값들을 비교.
		
		
		int count = 0; //현재 저장된 랜덤수 개수
		int i = 0; //반복문에서 사용할 변수
		
		while (count <3) {
			int random = (int) (Math.random() * (max - min + 1) + min);
			// 이미 저장된 랜덤수 들과 하나하나 비교해서 같은게 있는지 확인하여
			// 있으면 반복문 종료
			for(i=0; i<count; i++) {
				if(random == arr[i]) {
					break;
				}
			} 
			/* 위 반복문에서 break를 만나지 않으면 i는 count일 때 종료하기 때문에
			반복문 종료 후 i는 count와 같다.
			하지만 break를 만나서 중간에 빠져 나오면 i는 count보다 작다. */
			if(i == count) {
				arr[count] = random;
				count++;
			}
		}
		
		printArray(arr);
		System.out.println("========================");
		
		
		
		
		
		//방법3 : 방법2를 메서드로 변형
		createRandomArray(min, max, arr);
		printArray(arr);
		System.out.println("========================");
		
	}
	/**
	 * 정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력하는 메서드
	 * 매개변수 : 배열, 배열의 개수
	 * 반환타입 :
	 * 메서드명 :
	 */
	public static void printArray(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	/** 정수 num가 배열의 0번지부터 count개 만큼 확인했을 때 중복된 값이 있는지
	 *  없는지 알려주는 메서드
	 *  매개변수 :
	 *  리턴타입 :
	 *  메서드명 : contains
	 */
	public static boolean contains(int num, int count, int arr[]) {
		int i;
		for(i=0; i<count; i++) {
			if(num == arr[i]) {
				break;
			}
		} 
		if(i != count) {
			return true;
		}
		else
			return false;
	}
	
	//강사님이 하신거 (return으로 탈출)
	
	public static boolean contains2(int num, int count, int arr[]) {
		int i;
		for(i=0; i<count; i++) {
			if(num == arr[i]) {
				return true;
			}
		} 
		return false;
	}
	
	/**
	 * min에서 max사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드
	 * 매개변수 : 최소값, 최대값, 배열
	 * 반환타입 :
	 * 메서드명 :
	 */
	public static void createRandomArray(int min, int max, int arr[]) {
		//배열이 생성되어 있지 않으면(배열이 null이면)
		if(arr == null) {
			return;
		}
		
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면
		// 1~3 : 3개가 4개짜리 배열에 들어갈 수 없음 (중복없이)
		if(max - min + 1 < arr.length){
			return;
		}
		//랜덤한 수 중복없이 채워넣기
		int count = 0;
		while(count < 3) {
			int random = (int) (Math.random() * (max - min + 1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
			if(!contains(random, count, arr)) {
				arr[count] = random;
				count++;
			}
		}

	}
}









