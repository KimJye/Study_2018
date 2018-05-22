package programmers;
import java.util.Arrays;
/*
 *  수를 입력받아 두 수의 최대공약수와 최소공배수를 반환해주는 gcdlcm 함수를 완성해 보세요. 
 *  배열의 맨 앞에 최대공약수, 그 다음 최소공배수를 넣어 반환하면 됩니다
 예를 들어 gcdlcm(3,12) 가 입력되면, [3, 12]를 반환해주면 됩니다
 */

public class GcdLcm {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int[] arr= {a,b};
        Arrays.sort(arr); // 배열 정렬
        int min=arr[0];
        int max=arr[1];
        int gcd = 0;

        
        if(max%min==0) answer[0]=min;//최대공약수 구하기 
        else {
        	for(int i=1; i<=min; i++) {  
        		if(min%i==0 && max%i==0) gcd=i; 
        	}
        	answer[0]=gcd;
        }

        answer[1]=(a*b)/answer[0]; //최소공배수의 공식
      
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        GcdLcm c = new GcdLcm();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
