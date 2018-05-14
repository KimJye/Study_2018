package task;
/*
 * �ۼ��� : 2018�� 05�� 13��
 * �� �� : codility lesson2 - OddOccurrencesInArray.
 * 
 */

/*
  	xor�� Ư¡
 	a ^ a = a;
 	a ^ 0 = 0;
  	a ^ a ^ a = a;
  */

public class OddOccurrencesInArray {
	
	static int solution(int[] a) {
		int v=a[0];
		//�ð�O(n) ����O(1)
		
		for(int i=1; i<a.length; ++i) {
			 v = (v^a[i]);
		}
		
		return v;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("��� : "+solution(a));
	}

}
