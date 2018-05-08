package study;
/*
 * 작성일 : 2018년 05월 08일
 * 내 용 : 연속된 숫자를 더해 주어진 수를 표현하는 방법의 개수 세기. 프로그래머스 - 숫자의 표현 참고. 
 */
public class Expressions {

	public int expressions(int num) {
		int sum = 0;
		int answer = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				sum += j;
				if (sum == num) {
					answer++;
					break;
				}	
			}
			sum = 0;
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}
}
