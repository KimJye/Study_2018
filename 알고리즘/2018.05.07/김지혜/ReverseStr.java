/*
 * 2018/05/08
 * ������
 * ���ڿ� ������������ �迭�ϱ�. �빮�ڴ� �ҹ��ں��� �۴ٰ� ����.
 */
package programmers;

import java.util.Arrays;

public class ReverseStr {

	public String reverseStr(String str){
		
		Character [] array = new Character[str.length()];
		
		for(int i=0;i<array.length;++i) {
			array[i]=str.charAt(i);
		}
		
		Arrays.sort(array);
		
		String a="";
		
		for(int i=array.length-1;i>=0;--i) {
			a+=array[i];
		}
		
		return a.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}

}
