package study;
/*
 * �ۼ��� : 2018�� 5�� 13�� 
 * �� �� : ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, �� ���� ���� ���ϴ� ���α׷�. - ���α׷��ӽ� ����� ���� ����.
 */
class SumMatrix {
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][A[0].length];
        
        for(int i=0; i<A.length; i++){
           for(int j=0; j<A[i].length; ++j){
                answer[i][j] = A[i][j]+B[i][j];
            }
        }
		return answer;
	}

	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2 }, { 2, 3 }  };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("�¾ҽ��ϴ�. ������ ���� ������");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. �����ϴ°� ���ھ��");
		}
        
	}
}


