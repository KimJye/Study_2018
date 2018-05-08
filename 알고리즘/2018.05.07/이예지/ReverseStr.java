package study;

import java.util.Arrays;
import java.util.Collections;
/*
 * 작성일 : 2018년 05월 08일
 * 내 용 : string 문자열 오름차순으로 정렳하기 - 프로그래머스 문자열 내림차순으로 배치하기 
 */
public class ReverseStr {
	
	
	public String reverseStr(String str){
		
		char[] arr = str.toCharArray(); //char배열로 변환
		Arrays.sort(arr);//Arrays클래스를 이용해 오름차순 정렬
		StringBuffer sf = new StringBuffer();
		sf.append(arr);
		str = sf.reverse().toString(); //스트링버퍼를이용해 내림차순으로 바꿈.
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