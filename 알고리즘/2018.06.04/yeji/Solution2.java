package p20180604;
/*
 * 작성일 : 2018년 05월 31일
 * 내 용 : String형 변수 s를 int형으로 바꿔 리턴하는  함수 solution작성.
 */
public class Solution2 {
	 public int solution(String s) {
		 
		 int a = Integer.parseInt(s);
		 return a;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Solution2 s = new Solution2();
		 System.out.println(s.solution("1234"));
	}

}
