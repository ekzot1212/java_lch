package day22.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		
		Integer arr[] = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> arrStream = (Stream)Arrays.stream(arr);
		Stream<Integer> listStream = list.stream();
		
		//전체 출력
		arrStream.forEach(num -> System.out.println(num)); 		//배열의 값을 하나씩 꺼낸 것 = num
		System.out.println("===============");
		listStream.forEach(num -> System.out.println(num));
		System.out.println("===============");
		
		// 3보다 큰 수 출력
		arrStream = (Stream)Arrays.stream(arr);
		arrStream
			.filter(num -> num > 3)
			.forEach(num -> System.out.println(num));
		System.out.println("===============");
		listStream = list.stream();
		listStream
			.filter(num -> num > 3)
			.forEach(num -> System.out.println(num));		//동일한 방법을 이용해서 처리할 수 있음 (Stream 쓰는 이유)
	}

}
