package programmers;

import java.util.*;
public class ChangeStringtoInt {
	public int solution(String s) {
		String st=s;
		int answer=0;

		answer=Integer.parseInt(st);

		return answer;
	}
	public static void main(String[] args){
		ChangeStringtoInt ch = new ChangeStringtoInt();
		Scanner input = new Scanner(System.in);
		String str="";
		String regex="^[-?1-9]*$";
		System.out.print("���� �Է�: ");
		str=input.nextLine();
		
		if(str.length()<1||str.length()>10000) {
			System.out.println("������ ���̴� 1 �̻� 10,000�����Դϴ�");
		}
		else if(str.charAt(0)=='0') {
			System.out.println("���ڴ� 0���� �������� �ʽ��ϴ�. 0������ �ٽ� �Է��ϼ���.");
		}else if(!str.matches(regex)){
			System.out.println("���Ǻ���ġ! ���ڸ� �Է��ϼ���!");
		}else {
			System.out.printf("���ڷ� ��ȯ: %d",ch.solution(str));
		}

	}
}
