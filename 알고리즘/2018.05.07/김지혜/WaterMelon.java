/*
 * 2018/05/08
 * ������
 * �Է� ���ڸ�ŭ ���ڼ� ���
 */
package programmers;

import java.util.Arrays;

public class WaterMelon {

	public String watermelon(int n){

		String a="";
		
		
		for(int i=0;i<n;++i) {
			if(i%2==0) {
				a+="��";
				
			}else {
				a+="��";
			}
		}
		
		return a;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}

}
