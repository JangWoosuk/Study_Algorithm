package 프로그래머스2;

public class 가장큰정사각형 {
	 public int solution(int [][]board)
	 {
		 
		 /*
		  * 2차원배열에서 동적계산법을 이용하여 문제를풀어본다
		  * 만약 11
		  *    11
		  *    이라면 마지막 11
		  *              12 로 바꾸어준다 이말은 (1,0)(0,0)(0,1)이 모두다 1이상일때 (1,1)은 세가지 수중에 가장수+1을 한다.
		  *              111
		  *              122
		  *              123 이되어 3*3을 하면 넓이 9가나옴.
		  * */
         int answer = 0;
         int [][]dp = new int[board.length+1][board[0].length+1];
  
         for(int i=0; i<board.length; i++){
             for(int j=0; j<board[0].length; j++){
                 if(board[i][j]==1){
                     dp[i+1][j+1] = 1;
                 }
             }
         }
          
         for(int i=0; i<dp.length; i++){
             for(int j=0; j<dp[0].length; j++){
                 if(dp[i][j]>=1 && dp[i][j-1]>=1 && dp[i-1][j-1]>=1 && dp[i-1][j]>=1){
                     dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j-1], dp[i-1][j]))+1; 
                 }
             }
         }

         //printArray(dp);
         for(int i=0; i<dp.length; i++){
             for(int j=0; j<dp[0].length; j++){
                 answer = Math.max(dp[i][j], answer);
             }
         }
          
         return answer*answer;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
