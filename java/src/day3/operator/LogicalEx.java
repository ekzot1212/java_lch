package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 75;
		//성적이 80점 이상이고, 성적이 90점 미만인가?
		//성적이 80보다 크거나 같고 score가 90보다 작다
		//성적이 80보다 크거나 같다 && 성적이 90보다 작다
		//성적 >= 80 && 성적 < 90
		System.out.println(score + "점은 B학점인가? " + (score >= 80 && score < 90));
		
		int age = 15;
		//20세 이상이면 성인
		boolean isAdult = age >= 20;
		//'age'살은 미성년자인가? => 성인이 아님
		System.out.println(age + "살은 미성년자 인가? : " + !isAdult);
		
		//주민등록증은 있고, 운전면허증이 없음
		boolean hasIdCard = true;
		boolean hasDriverCard = false;
		//토익을 볼 수 있을까?								(주민등록증 or 면허증)
		System.out.println("토익 시험을 치룰 수 있나요? " + (hasIdCard || hasDriverCard));
	}

}
