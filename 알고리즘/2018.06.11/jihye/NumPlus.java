/*
 * �ڿ��� N�� �־����� N�� �� �ڸ��� ���� ���϶�.
 * ���� ��� N=123�̸� 1+2+3 = 6�� return �϶�.
 * N�� ���� : 100000000������ �ڿ���
 */

/*	�˰Ե� ��
 * Integer.toString()�� String.ValueOf()�� ����
 * ������: String���� �������ش�.
 * ������: nullPointException �߻� �����̴�.
 * 		���� ��� 
 * 		int i=0;
 * 		String a =Integer.toString(i);//null point Exception
 * 		String b = String.valueOf(i);// no exception
 * 		���⼭ toString�� CharSequence �������̽��� ������ �ְ� Object Ŭ������ ��ӹ����� string ��ü�� �����Ѵ�.
 * 		�ݸ鿡 valueOf�� Integer.toString�� �ѹ� ���ϵȰ��̳� �ٸ�����. ���� Integer.toString(int,int)�� ������ �ִ�.
 */
package programmers;

import java.util.*;

public class NumPlus {
	
	public int solution(int n) {
		int answer=0;
		
		String str=Integer.toString(n);//���ڸ� ���ڿ��� ��ȯ
		
		/*valueOf�޼ҵ�
		for(int i=0;i<str.length();++i) {
			array[i]=String.valueOf(str.charAt(i));
		}
		*/
		
		/*toString���ҵ�
		for(int i=0;i<str.length();++i) {
			array[i]=Character.toString(str.charAt(i));//�迭�� ����
		}
		*/
		//��ġ��
		for(int i=0;i<str.length();++i) {
			answer+=Integer.parseInt(String.valueOf(str.charAt(i)));//�� ���� ���ϱ�
		}

		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		NumPlus np = new NumPlus();
		
		System.out.print("�ڿ��� N: ");
		number=input.nextInt();
		
		if(number<0||number>100000000) {
			System.out.println("N���� Ʋ���ϴ�.");
		}else {
			System.out.printf("�ڸ����� ��: %d",np.solution(number));	
		}
	}

}
