package study;

public class Average {
/*
 * 작성일 : 2018년 4월 28일 토요일
 * 내 용 :  메소드의 매개변수로 배열을 전달한 후 배열 원소의 평균을 리턴하는 메소드를 작성하는 문제. 
 *        프로그래머스 level1 참고
 */
    public int getAverage(int[] array) { // 내 풀이 : for문을 이용해 배열의 합 구한 후 배열의 길이로 나누기
        int l = array.length;	
        int sum = 0;
        for(int i=0; i<l; ++i){
        	sum += array[i];
        }
          return sum/l;
          //length() : 배열의 길이를 알아낼 때
          //length : 문자열의 길이를 알아낼 때
          //size() : 콜렉션 타입의 길이를 알아낼 때 
      }
	
	public int getAverage2(int[] array) { //forEach문 활용하기
		int sum = 0;
		for(int i : array) 
			sum += i;
		
		return sum/array.length;
	}	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int x[] = {5, 4, 3};
		  Average getMean = new Average();
	 	 System.out.println("평균값 메소드1: " + getMean.getAverage(x));
		 System.out.println("평균값 메소드2: " + getMean.getAverage2(x));
	}

}
