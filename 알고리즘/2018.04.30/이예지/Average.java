package study;

public class Average {
/*
 * �ۼ��� : 2018�� 4�� 28�� �����
 * �� �� :  �޼ҵ��� �Ű������� �迭�� ������ �� �迭 ������ ����� �����ϴ� �޼ҵ带 �ۼ��ϴ� ����. 
 *        ���α׷��ӽ� level1 ����
 */
    public int getAverage(int[] array) { // �� Ǯ�� : for���� �̿��� �迭�� �� ���� �� �迭�� ���̷� ������
        int l = array.length;	
        int sum = 0;
        for(int i=0; i<l; ++i){
        	sum += array[i];
        }
          return sum/l;
          //length() : �迭�� ���̸� �˾Ƴ� ��
          //length : ���ڿ��� ���̸� �˾Ƴ� ��
          //size() : �ݷ��� Ÿ���� ���̸� �˾Ƴ� �� 
      }
	
	public int getAverage2(int[] array) { //forEach�� Ȱ���ϱ�
		int sum = 0;
		for(int i : array) 
			sum += i;
		
		return sum/array.length;
	}	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int x[] = {5, 4, 3};
		  Average getMean = new Average();
	 	 System.out.println("��հ� �޼ҵ�1: " + getMean.getAverage(x));
		 System.out.println("��հ� �޼ҵ�2: " + getMean.getAverage2(x));
	}

}
