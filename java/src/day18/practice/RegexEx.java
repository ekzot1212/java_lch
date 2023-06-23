package day18.practice;

import java.util.regex.Pattern;

public class RegexEx {
/* 입력받은 문자열이 http://또는 https:// 로 시작하는지 확인하는
 * 정규표현식을 작성해 보세요.
 * - > ^https?://[a-zA-Z\.]+$
 */

	public static void main(String[] args) {
		String str = "https://www.naver.com";
		String regex = "^https?://[a-zA-Z\\.]+$";		//Z뒤에 \에 하나더 \붙여야함(?)
		boolean result = Pattern.matches(regex, str);
		System.out.println(str + " : " + result);
	}

}
