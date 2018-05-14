package task;
/*
 * 작성일 : 2018년 05월 13일
 * 내 용 : codility lesson2 - OddOccurrencesInArray.
 * 
 */

/*
  	xor의 특징
 	a ^ a = a;
 	a ^ 0 = 0;
  	a ^ a ^ a = a;
  */

public class OddOccurrencesInArray {
	
	static int solution(int[] a) {
		int v=a[0];
		//시간O(n) 공간O(1)
		
		for(int i=1; i<a.length; ++i) {
			 v = (v^a[i]);
		}
		
		return v;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("결과 : "+solution(a));
	}

}
