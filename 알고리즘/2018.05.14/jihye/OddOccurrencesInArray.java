/*
 * 2018.05.14
 * ������
 * N���� ������ �����ǰ� Ȧ�� ���� ���ҵ��� ������ �ִ� �迭�� �� ���Ҹ� ������ 
 * ������ ���ҵ��� ¦�� �̷��. ���⼭ ¦�� �̷��� �ʴ� ���Ҹ� �˾Ƴ���.
 * Hash �� Iterator ������.
 */
package codility;

//import java.util.*//HashSet����ϱ�����
public class OddOccurrencesInArray {
	public static int solution(int[] A) {
		int a =0;
		
		for(int i=0;i<A.length;++i) {
			a=a^A[i];
		}
		return a;
	}
	/* 
	 * <HashSet>����ϱ�.
	 * HashSet�� ������ ���� ���� �� ����.
	 * Iterator(�ݺ���): �÷��ǿ� (Array, List, Set, Map)����Ǿ��ִ� ��ҵ��� �о���� ����� ǥ��ȭ.
	 * public static int solution(int[] A){
	 * HashSet<Integer> hs = new HashSet<Integer>();
	 * for(int i :A){
	 * 	if(!hs.add(i)){
	 * 		hs.remove(i);
	 * 	}
	 * }
	 * return hs.iterator().next();
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int array[] = {9,3,9,3,9,7,9};
		System.out.println(solution(array));
	}
}
