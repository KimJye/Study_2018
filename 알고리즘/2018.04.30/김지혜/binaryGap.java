/*
 * 2018.04.30
 * ������
 * ���� �� ���̳ʸ� �� ���� ��ȯ�ϱ�
 */

package exam;

import java.util.ArrayList;

public class binaryGap {
	
	public int solution(int n) {
		
		int a=0;
		int num=0;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while(n>0) {//�������� �ٲٴ� �޼ҵ尡 �ִٰ��մϴ�.
			arrayList.add(n%2);
			n=n/2;
		}
		for(int i=arrayList.size()-1;i>=0;i--) {
			if(arrayList.get(i)==0) {
				num++;
			}else if(arrayList.get(i)==1) {
				if(num>a) {
					a=num;
				}
				num=0;
			}
			
			System.out.print(arrayList.get(i));
		}
		System.out.println();
		return a;
	}
	
	public static void main(String[] args) {
			
		String str = "1,...2,147,483,647";
		
		binaryGap binarygap = new binaryGap();
		  
		System.out.println("���̳ʸ� �� : " + binarygap.solution(11240));
	}
}
