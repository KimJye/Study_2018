package study;
/*
 * �ۼ��� : 2018�� 5�� 13�� 
 * �� �� :  ���α׷��ӽ� �ְ��� ���� ����.
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
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
        System.out.println(Arrays.toString(c.bestSet(5,13)));
        System.out.println(Arrays.toString(c.bestSet(2,1)));
        System.out.println(Arrays.toString(c.bestSet(2,0)));
    }

}
