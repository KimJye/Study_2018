/*
 * 2018.05.13
 * ������
 * �ְ��� ���� ���ϱ�.
 */
package programmers;

import java.util.Arrays; //�׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer = new int[n];
        int [] array = new int[n];
        int [] fail= {-1};
        int num=s;
        int result=0;
        int a=0;
        
        if(n>s) {
        	return fail;
        }
        for(int i=n;i>0;--i){
              a=num/i;
              answer[i-1]=a;
              result=num-a; 
              num=result;
        }
        
        for(int i=0; i<n; ++i) {
        	array[i]=answer[n-i-1];
        }
        return array;
        
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
        System.out.println(Arrays.toString(c.bestSet(3,19)));
        System.out.println(Arrays.toString(c.bestSet(3,2)));
        
        
    }

}