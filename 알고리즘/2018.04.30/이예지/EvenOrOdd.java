package task;
/*
 * �ۼ��� : 2018�� 4�� 29��
 * �� �� : int�� ������ �޾Ƽ� �Ű������� ¦���� ��� Even�� Ȧ���� ��� Odd�� ��ȯ�ϴ� �޼ҵ� �ۼ�. ���α׷��ӽ� ���� 
 */
public class EvenOrOdd {

	String evenOrOdd(int num) {
		String result = (num%2==0)? "Even" : "Odd";
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EvenOrOdd : �̿���");
		EvenOrOdd eoo = new EvenOrOdd();
		
		System.out.println("3��? "+ eoo.evenOrOdd(3));
		System.out.println("4��? "+ eoo.evenOrOdd(4));
	}

}
