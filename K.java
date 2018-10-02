package ���α׷��ӽ�_�迭;

import java.util.Arrays;

/*
		  * 
		  * i�� �ε�����  j ��  i�ε������� j�ε��� ������ �迭�� �ڸ��� ����, k�� ������ �迭��  �ε���.
		  * 
		  * arr������ 100���� commands�� ���̴� 50���� 
		  * 
		  * 1.���� �迭�� ���� �޾ƿ��� �� �迭�� i���� j���� �ִ´�.
		  * 2.���� ������ �̿��Ͽ� �迭�� ����
		  * 3.k��° �ε�����  answer���ٰ� �߰�.
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