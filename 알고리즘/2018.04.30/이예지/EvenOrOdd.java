package task;
/*
 * 작성일 : 2018년 4월 29일
 * 내 용 : int형 정수를 받아서 매개변수가 짝수일 경우 Even을 홀수일 경우 Odd를 반환하는 메소드 작성. 프로그래머스 참고 
 */
public class EvenOrOdd {

	String evenOrOdd(int num) {
		String result = (num%2==0)? "Even" : "Odd";
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EvenOrOdd : 이예지");
		EvenOrOdd eoo = new EvenOrOdd();
		
		System.out.println("3은? "+ eoo.evenOrOdd(3));
		System.out.println("4는? "+ eoo.evenOrOdd(4));
	}

}
