/*
 * 2018.04.30 
 * ���α׷��ӽ� level1.
 * ������
 * evenOrOdd �޼ҵ�� int�� num�� �Ű������� �޽��ϴ�.
num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϵ��� evenOrOdd�� �ڵ带 �ۼ��� ������.
num�� 0�̻��� �����̸�, num�� ������ ���� �����ϴ�.
 */

package programmers;

public class EvenOrOdd {

	String evenOrOdd(int num) {
        String result = "";
        if(num<0) result="�ٽ��Է��ϼ���";
        else if(num%2==0) result="Even";
        else result="Odd";
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "1 2 3 4";
	        EvenOrOdd evenOrOdd = new EvenOrOdd();
	        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	        System.out.println("��� : " + evenOrOdd.evenOrOdd(3));
	        System.out.println("��� : " + evenOrOdd.evenOrOdd(2));

	}

}
