package study;
/*
 * 작성일 : 2018년 5월 13일 
 * 내 용 :  프로그래머스 최고의 집합 참고.
 */
import java.util.Arrays;

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer = null;
        int [] a = new int[n]; 
        int sum =0;	
        int [] arr = {-1};
        
        if(n>s){
         	answer = arr;
         	return answer;
        }
        
        for(int i=1; i<=s+1; i++) {
        	sum = Arrays.stream(a).sum();
        	if(sum!=s) {
        		a[i%n]++;
        	}
        	else if(sum==s){
        		answer=a;
        	//	answer = Arrays.copyOf(a, a.length);
        	}
        		
        }

        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
        System.out.println(Arrays.toString(c.bestSet(5,13)));
        System.out.println(Arrays.toString(c.bestSet(2,1)));
        System.out.println(Arrays.toString(c.bestSet(2,0)));
    }

}
