package 프로그래머스_배열;

import java.util.Arrays;
	
public class K {
	
	
	
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        int index = 0;
	       for(int i = 0; i<commands.length; i++){
	    	   int start = commands[i][0];
	    	   int end = commands[i][1];
	    	   int k = commands[i][2];
	    	   int[] temp = new int[end-start+1];
	    	   int x=0;
	    	   for(int j = start-1; j<end; j++){
	    		   temp[x++]=array[j];
	    	   }   
	    		   Arrays.sort(temp);
	    		   
	    		   answer[index++] = temp[k-1];
	    	   
	       }
	       return answer;
	    }
	}
