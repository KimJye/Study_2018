package study;
/*
 * �ۼ��� : 2018�� 5�� 10�� 
 * �� �� : �Ű������� ���� ���ڿ����� �ִ�/�ּҰ��� ã�� ���ڿ����� ��ȯ�ϴ� �޼ҵ� - ���α׷��ӽ� �ִ밪�� �ּҰ� ����.
 */
public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String [] arr = str.split(" ");
        int max = Integer.valueOf(arr[0]); //Integer.parseInt(tmp[0]);
        int min = max;
        int value;
        //length : �迭�� ���� , length() : ���ڿ��� ����, size() : CollectionŸ���� ���� 
        for(int i=1; i<arr.length; i++){
            value = Integer.valueOf(arr[i]);
            if(max<value) max = value; 
            if(min>value) min = value;
        }
        return String.format("%d %d", min, max);
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
    }
}