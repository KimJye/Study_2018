package study;
/*
 * �ۼ��� : 2018�� 05�� 07��
 * �� �� : ���α׷��ӽ� - ���ڼ��ڼ��ڼ�? ����
 */
public class WaterMelonTest {
	
		public String watermelon(int n) {
			 String s ="";
			    for(int i=0; i<n; ++i){
			    	if(i%2==0)
			        s+="��";
			      else{
			      	s+="��";
			      }
			    }
					return s;
		}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelonTest wm = new WaterMelonTest();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}

}
