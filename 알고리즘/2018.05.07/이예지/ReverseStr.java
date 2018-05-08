package study;

import java.util.Arrays;
import java.util.Collections;
/*
 * �ۼ��� : 2018�� 05�� 08��
 * �� �� : string ���ڿ� ������������ �����ϱ� - ���α׷��ӽ� ���ڿ� ������������ ��ġ�ϱ� 
 */
public class ReverseStr {
	
	
	public String reverseStr(String str){
		
		char[] arr = str.toCharArray(); //char�迭�� ��ȯ
		Arrays.sort(arr);//ArraysŬ������ �̿��� �������� ����
		StringBuffer sf = new StringBuffer();
		sf.append(arr);
		str = sf.reverse().toString(); //��Ʈ�����۸��̿��� ������������ �ٲ�.
		return str;
	}

	public String reverseStr2(String str){
		
		String[] arr = str.split("");
		Arrays.sort(arr, Collections.reverseOrder());
		StringBuffer sf = new StringBuffer();
		for(String s : arr)
			sf.append(s);
		str = sf.toString();
		return str;
	}
	
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
		System.out.println( rs.reverseStr2("Zbcdefg") );

	}
}