/*
 * ������
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
 * �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 */
package programmers;

import java.util.Scanner;
import java.util.*;

public class CenterWord {
	 public String solution(String s) {
	     
		  if((s.length()<1)&&(s.length()>100)) {
	    	  System.out.println("s�� ���̰� 1�̻� 100���Ͽ��� �մϴ�.");
	    	  return"";
	      }
	 
	      String answer = "";
	      if(s.length()%2==0) {
	    	  answer=s.substring(s.length()/2-1,s.length()/2+1);
	      }else {
	    	  answer=s.substring(s.length()/2,s.length()/2+1);
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		CenterWord cw = new CenterWord();
		
		String str="";
		
		System.out.print("�ܾ� �Է�: ");
		str=input.nextLine();
		
		System.out.print("�ܾ� str�� ��� ���ڸ� ��ȯ:");
		System.out.printf("%s",cw.solution(str));
	}

}
