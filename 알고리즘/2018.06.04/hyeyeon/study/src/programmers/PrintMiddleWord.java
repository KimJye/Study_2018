package programmers;

/*
 * getMiddle�޼ҵ�� �ϳ��� �ܾ �Է� �޽��ϴ�. �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������. �ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
������� �Է¹��� �ܾ power�̶�� w�� ��ȯ�ϸ� �ǰ�, �Է¹��� �ܾ test��� es�� ��ȯ�ϸ� �˴ϴ�.
 */

public class PrintMiddleWord {
    String getMiddle(String word){
        int length=word.length();
        String result;
        if(length%2==0){
            result=word.substring(length/2-1, length/2+1 ); //substring:������������ �������� �ٷ� ������ ��ȯ �� ������ ��ȯ�ȉ�
        }
        
        else{
            result=word.substring(length/2, length/2+1 );
        }
        
    	return result;    
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
    	PrintMiddleWord se = new PrintMiddleWord();
        System.out.println(se.getMiddle("power"));
    }
}
