package programmers;

/*
 * getMiddle메소드는 하나의 단어를 입력 받습니다. 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요. 단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.
 */

public class PrintMiddleWord {
    String getMiddle(String word){
        int length=word.length();
        String result;
        if(length%2==0){
            result=word.substring(length/2-1, length/2+1 ); //substring:시작지점부터 끝지점의 바로 전까지 반환 끝 지점은 반환안됌
        }
        
        else{
            result=word.substring(length/2, length/2+1 );
        }
        
    	return result;    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
    	PrintMiddleWord se = new PrintMiddleWord();
        System.out.println(se.getMiddle("power"));
    }
}
