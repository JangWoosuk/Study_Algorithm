package ���α׷��ӽ�2;

public class ����ū���簢�� {
	 public int solution(int [][]board)
	 {
		 
		 /*
		  * 2�����迭���� ���������� �̿��Ͽ� ������Ǯ���
		  * ���� 11
		  *    11
		  *    �̶�� ������ 11
		  *              12 �� �ٲپ��ش� �̸��� (1,0)(0,0)(0,1)�� ��δ� 1�̻��϶� (1,1)�� ������ ���߿� �����+1�� �Ѵ�.
		  *              111
		  *              122
		  *              123 �̵Ǿ� 3*3�� �ϸ� ���� 9������.
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
