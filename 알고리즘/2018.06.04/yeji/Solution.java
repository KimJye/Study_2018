package p20180604;
/*
 * �ۼ��� : 2018�� 05�� 31��
 * �� �� : String�� ���� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ� solution �ۼ�
 * 		�ܾ��� ���̰� ¦���� ��� ��� �� ���� ��ȯ.
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