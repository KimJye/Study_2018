package task;
/*
 * 작성일 : 2018년 04월 29일
 * 내 용 : codility lesson1 Iterations 참고 
 * 		예) 1001 이면 바이너리 갭의 길이가 2
 * 		529는 이진수로 1000010001 이므로 바이너리 갭의 길이가 4
 * 		20은 이진수로  10100이므로 바이너리 갭의 길이가 1
 * 		15는 이진수로  1111이므로 바이너리 갭의 길이가 0이다
 *		solution메소드의 매개변수로 양의 정수를 입력하면 바이너리 갭의 길이를 리턴하는 메소드 작성.
 */

public class BinaryGap {

	static public int solution(int n) {
		String a = Integer.toBinaryString(n); //이진수로 변환
		int count = 0;
		int max = 0 ;
		System.out.print(n+"를 이진수로 : "+a);

		
		for(int i=0; i<a.length(); ++i) {
			if(a.charAt(i)=='1') {
				max = (max>count)? max : count;
				count = 0;
			}
			if(a.charAt(i)=='0') {
				count++;
			}
		}
		return max;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("task_BinaryGap : 이예지");
		System.out.println(" >> 4의 BinaryGap 길이 : "+ solution(4));
		System.out.println(" >> 9의 BinaryGap 길이  : "+ solution(9));
		System.out.println(" >> 1041의 BinaryGap 길이  : "+ solution(1041));
		System.out.println(" >> 8488의 BinaryGap 길이  "+ solution(8489));
		System.out.println(" >> 1181825의 BinaryGap 길이 "+ solution(1181825));
		
	}

}
