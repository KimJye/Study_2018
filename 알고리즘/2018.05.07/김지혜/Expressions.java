/*
 * 2018.05.08
 * ������
 * ���ڸ� �Է¹޾� ���ӵ� ���� ǥ���ϴ� ����� ��ȯ
 */
package programmers;

public class Expressions {

	public int expressions(int num) {
		int answer = 0;
		
		for(int i=1;i<num;++i) {
			int sum=0;
			for(int j=i;j<num;++j) {
				sum+=j;
				if(sum==num) {
					answer++;
					break;
				}
			}
		}
		
		/*
		int n=1;
		while(n!=num) {
			int sum=0;
			for(int i=n;i<=num;++i) {
				sum+=i;
				if(sum==num)
					answer++;
			}
			n++;
		}*/
		return answer+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
	}

}
