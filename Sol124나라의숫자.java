package ���α׷��ӽ�2;

public class Sol124�����Ǽ��� {

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
