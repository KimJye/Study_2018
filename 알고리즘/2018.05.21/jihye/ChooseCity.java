package programmers;

public class ChooseCity {
	  public int chooseCity(int n, int [][]city)
	    {
	        int answer = 0;
	        for(int i=0;i<n;++i) {
	        	
	        	for(int j=0;j<2;++j) {
	        		city[i][j]-city[i+1][]
	        	}
	        }
	        return answer;
	    }
	    public static void main(String[] args)
	    {
	        ChooseCity test = new ChooseCity();
	        int tn = 3;
	        int [][]tcity = {{1,5},{2,2},{3,3}};
	        System.out.println(test.chooseCity(tn,tcity));
	    }
}
