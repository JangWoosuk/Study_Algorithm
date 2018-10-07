package ���α׷��ӽ�2;

import java.util.*;

/*
		 * �Ű������� ���� ���� �̿��Ͽ� ���� ū���� ������
		 * ������� 6,10,2 �̸� 6210�� ������. = 6,2,10���� �迭�� ����� �����Ѵ�.
		 * 3,30,34,5,9 �ς��� 9534330�� �ȴ�. 9,5,34,3,30���� �迭�� ���� �����Ѵ�.
		 * 
		 * 1.1�� �����ΰ͵��� ���� ū���� �޴´�.
		 * 2.���� 1�� �ڸ� ���ڿ� 0 �� �ٿ� 10,100�� �ڸ����Ǿ��µ� �迭�� �װͺ��� ū���� ������ �� 10,100�� �ڸ������
		 * 3. 10���ڸ����� ���ٸ� 1�� �ڸ��� ����ϰ� ���� �� 10�� �ڸ����� ����Ѵ�. 
		 * 
		 * */




public class ����ū�� {
	public String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		//String ���� �ٲ��ش�.
		for(int i = 0 ; i<numbers.length;i++){
			arr[i]=String.valueOf(numbers[i]);
		}
		//String�� ������ �ϴµ� compare�� �°� ��ü. 3,30 30,3 �� ���� ���ϸ� 330 303 �̹Ƿ� 3,30�� ��ȯ.
		 Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b){
				String temp1 = a+b;
				String temp2 = b+a;
				
				return temp2.compareTo(temp1);//temp1�� temp2�� ū���� ��ȯ.
			}
		});
		 
		 StringBuilder answer = new StringBuilder();
		 //�迭�� �� ���δ�.
		 for(String item : arr){
			 answer.append(item);
		 }
		 if(answer.toString().startsWith("0")) return "0";
		 
		 return answer.toString();
	}
}


