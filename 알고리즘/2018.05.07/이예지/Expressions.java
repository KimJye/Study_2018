package study;
/*
 * �ۼ��� : 2018�� 05�� 08��
 * �� �� : ���ӵ� ���ڸ� ���� �־��� ���� ǥ���ϴ� ����� ���� ����. ���α׷��ӽ� - ������ ǥ�� ����. 
 */
public class Expressions {

	public int expressions(int num) {
		int sum = 0;
		int answer = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				sum += j;
				if (sum == num) {
					answer++;
					break;
				}	
			}
			sum = 0;
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
	}
}
