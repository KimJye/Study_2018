package study;
/*
 * 작성일 : 2018년 05월 07일
 * 내 용 : 프로그래머스 - 수박수박수박수? 참고
 */
public class WaterMelonTest {
	
		public String watermelon(int n) {
			 String s ="";
			    for(int i=0; i<n; ++i){
			    	if(i%2==0)
			        s+="수";
			      else{
			      	s+="박";
			      }
			    }
					return s;
		}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelonTest wm = new WaterMelonTest();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}

}
