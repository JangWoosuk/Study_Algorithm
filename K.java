package 프로그래머스_배열;

import java.util.Arrays;

/*
		  * 
		  * i는 인덱스값  j 는  i인덱스부터 j인덱스 까지의 배열을 자르고 정렬, k는 정렬한 배열의  인덱스.
		  * 
		  * arr길이으 100이하 commands의 길이는 50이하 
		  * 
		  * 1.먼저 배열을 새로 받아오고 그 배열을 i부터 j까지 넣는다.
		  * 2.선택 정렬을 이용하여 배열을 정렬
		  * 3.k번째 인덱스를  answer에다가 추가.
		  * */
public class K {
	
	
	
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];

	        for(int i=0; i<commands.length; i++){
	            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	            Arrays.sort(temp);
	            answer[i] = temp[commands[i][2]-1];
	        }

	        return answer;
	    }
	}