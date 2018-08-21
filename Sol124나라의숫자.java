package 프로그래머스2;

public class Sol124나라의숫자 {

	public String solution(int n) {
	      String answer = "";
	        int[] arr = {4, 1, 2};
	        int a;
	        while (n > 0) {
	            a = n % 3; 
	            n = n / 3;
	            if (a == 0) {
	                n -= 1;
	            }
	            answer = arr[a] + answer;
	        }
	        return answer;
	 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
