package codility;

public class PrintTriangle {
	public String printTriangle(int num){
        String s =""; 
        for(int i=1; i<=num; ++i){
            for(int j=1; j<=i; ++j){
              s += "*";
            }
            s+="\n";
        }
    
		return s;		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}