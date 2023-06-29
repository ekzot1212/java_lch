package day22.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StreamEx2 {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student(1, 1, 1, "Hong",100,90,80), // -> 객체를 만들면 리스트로 넣어줌
				new Student(1, 1, 2, "Lim",10,30,50), 
				new Student(2, 1, 1, "Park",60,30,100), 
				new Student(3, 1, 1, "Lee",100,90,100),
				new Student(3, 3, 2, "Kim",30,100,23));
		//국어 성적이 60점 이상인 학생들의 이름을 출력 (Stream + 람다)
		Stream<Student> stream = list.stream();
		stream
		/* filter는 매개변수로 Predicate 인터페이스의 객체가 필요
		 * 익명클래스를 람다식으로 만든 후에 객체를 생성해서 전달
		 * */
			.filter(s -> s.getKor() >= 60)		//걸러주는거
			.map(s -> s.getName())				//타입을 바꿔줌
			.forEach(name -> System.out.println(name)); //하나씩 꺼내서
		
		stream = list.stream();
		stream
		.filter(s -> s.getKor() >= 60)
		.forEach(std -> System.out.println(std.getName()));
		
		//국어 성적의 총합
		stream = list.stream();
		int sum = stream.mapToInt(std -> std.getKor()).sum();
		System.out.println(sum);
		//국어 성적의 평균
		stream = list.stream();
		double avg = stream
				.mapToInt(std -> std.getKor())
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		//국어 성적의 총합
		stream = list.stream();
		sum = stream.map(std -> std.getKor()).reduce(0,(a,b)-> a+b);	//reduce로 총합
		System.out.println(sum);
	}

}

@Data
@AllArgsConstructor
class Student{
	int grade, classNum, num;
	String name;
	int kor, math, eng;
}