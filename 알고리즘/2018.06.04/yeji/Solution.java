package p20180604;
/*
 * 작성일 : 2018년 05월 31일
 * 내 용 : String형 변수 s의 가운데 글자를 반환하는 함수 solution 작성
 * 		단어의 길이가 짝수인 경우 가운데 두 글자 반환.
 */
class Solution {
	  public String solution(String s) {
		  String answer="";
		  if(s.length()!=0) {
			  answer = (s.length()%2==0)? s.substring(s.length()/2-1,s.length()/2+1) : String.valueOf(s.charAt(s.length()/2));
		  }
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		  Solution s = new Solution();
		 System.out.println(s.solution("qwer"));
		 System.out.println(s.solution("abcde"));
		 System.out.println(s.solution(""));
	  }
	}