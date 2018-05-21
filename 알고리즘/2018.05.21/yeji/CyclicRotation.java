package task;

import java.util.Arrays;
/*
 * 작성일 : 2018년 05월 15일 
 * 내 용 : codility - CyclicRotation 참고
 *  	배열 A를 K번 오른쪽으로 이동하는 메소드 solution.
 *  	빈 배열일경우 주의!
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
