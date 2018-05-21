package codility;

import java.util.ArrayList ;
import java.util.Arrays;
import java.util.Collection;

public class Gcdlcm {

    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        int tt = (a>b)? a: b;
        int max=1;
        
        for(int i=1; i<=tt; ++i) {
        	if((a%i)==0 && (b%i)==0)
        		max = i;
        }//�ִ�����
        
 
        int min=b;
        int i = 1;
        while(true) {
        	min = min*i;
        //	System.out.println("value : "+value+" i : "+i);
        	if(min%a==0)
        		break;
        	min=b;
        	i++;
        }
        
        answer[0] = max;
        answer[1]= min;
            
        return answer;
   /*
    	        Collection<String> c1 = new ArrayList<String>();
        Collection<String> c2 = new ArrayList<String>();
        
        for(int i=1; i<=a; ++i){
            if((a%i)==0)
            	c1.add(String.valueOf(i));
        }

        
        for(int i=1; i<=b; ++i) {
        	if(b%i==0)
        		c2.add(String.valueOf(i));
        }
        //c1�� c2���� ������ ������� �� ����
       
       c1.retainAll(c2);
        //c2�� ���� �� c1���� ����
    */
    
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
    	 Gcdlcm c = new  Gcdlcm();
        System.out.println(Arrays.toString(c.gcdlcm(14, 67)));
    }
	
}
