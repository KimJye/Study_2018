/*
 * 2018.04.30
 * ������
 * �Լ��� �ϼ��ؼ� �Ű����� array�� ��հ��� return�ϵ��� ����� ������.
 * ��� ũ���� array�� �͵� ��հ��� ���� �� �־�� �մϴ�.
 */
package programmers;

public class GetMean {
	
	 public int getMean(int[] array) {
		 
		 int sum=0;
		 
		 for(int i=0;i<array.length;++i) {
			 sum+=array[i];
		 }
	        return sum/array.length;
	    }

	    public static void main(String[] args) {
	        int x[] = {5, 4, 3};
	        GetMean getMean = new GetMean();
	        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	        System.out.println("��հ� : " + getMean.getMean(x));
	    }
}
