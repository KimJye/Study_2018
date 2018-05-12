package study;
/*
 * 작성일 : 2018년 5월 10일 
 * 내 용 : 매개변수로 받은 문자열에서 최대/최소값을 찾아 문자열으로 반환하는 메소드 - 프로그래머스 최대값과 최소값 참고.
 */
public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String [] arr = str.split(" ");
        int max = Integer.valueOf(arr[0]); //Integer.parseInt(tmp[0]);
        int min = max;
        int value;
        //length : 배열의 길이 , length() : 문자열의 길이, size() : Collection타입의 길이 
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
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}