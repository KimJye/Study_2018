package programmers;
/*
 * strToInt �޼ҵ�� String�� str�� �Ű������� �޽��ϴ�.
str�� ���ڷ� ��ȯ�� ����� ��ȯ�ϵ��� strToInt�� �ϼ��ϼ���.
������� str�� ��1234���̸� 1234�� ��ȯ�ϰ�, ��-1234���̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 */

public class StrToInt {
    public int getStrToInt(String str) {
    	int result=Integer.parseInt(str);

        return Integer.parseInt(str);
    }
    //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }

}

