package task;

import java.util.Arrays;
/*
 * �ۼ��� : 2018�� 05�� 15�� 
 * �� �� : codility - CyclicRotation ����
 *  	�迭 A�� K�� ���������� �̵��ϴ� �޼ҵ� solution.
 *  	�� �迭�ϰ�� ����!
 */
public class CyclicRotation {
	
	public static int[] solution(int[] A, int K) {
		int end;
		
		if(A.length==0) {
			return A;
		}
		
		for(int i=0; i<K; ++i) {
			end = A[A.length-1];
			for(int j=A.length-1; j>0; --j) {
				A[j]=A[j-1];
			}
			A[0] = end;
		}
		
		return A;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 8, 9, 7, 6};
		System.out.println(Arrays.toString(solution(a,3)));
		int[] b = {3, 8, 9, 7, 6};
		System.out.println(Arrays.toString(solution(b,0)));
		int[] c = {};
		System.out.println(Arrays.toString(solution(c,100)));
	}

}
