/*
 * 2018.05.10
 * ������
 * �ִ񰪰� �ּڰ� ���ϱ�.
 */
package programmers;
public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	
        String strArr[] = str.split(" ");
        
        int array[] = new int[strArr.length];
        
        for(int i=0; i<strArr.length;++i) {
        	array[i]=Integer.parseInt(strArr[i]);
        }
        
        int min= array[0];
        int max= array[0];
        
        for(int i=1;i<strArr.length;++i){
            if(min>array[i]) min = array[i];
            if(max<array[i]) max = array[i];
        }
        return min+" "+max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
    }
}