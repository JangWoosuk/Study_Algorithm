package 프로그래머스2;

import java.util.*;

/*
		 * 매개변수로 받은 수를 이용하여 가장 큰수를 만들어보라
		 * 예를들어 6,10,2 이면 6210을 만들어낸다. = 6,2,10으로 배열을 만들고 연결한다.
		 * 3,30,34,5,9 일굥우 9534330이 된다. 9,5,34,3,30으로 배열을 만들어서 연결한다.
		 * 
		 * 1.1의 숫자인것들중 가장 큰수를 받는다.
		 * 2.만약 1의 자리 숫자에 0 을 붙여 10,100의 자리가되었는데 배열중 그것보다 큰수가 있으면 그 10,100의 자리를사용
		 * 3. 10의자리수와 같다면 1의 자리를 사용하고 다음 그 10의 자리수를 사용한다. 
		 * 
		 * */




public class 가장큰수 {
	public String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		//String 으로 바꿔준다.
		for(int i = 0 ; i<numbers.length;i++){
			arr[i]=String.valueOf(numbers[i]);
		}
		//String을 정렬을 하는데 compare에 맞게 교체. 3,30 30,3 을 각각 더하면 330 303 이므로 3,30을 반환.
		 Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b){
				String temp1 = a+b;
				String temp2 = b+a;
				
				return temp2.compareTo(temp1);//temp1와 temp2중 큰수를 반환.
			}
		});
		 
		 StringBuilder answer = new StringBuilder();
		 //배열을 다 붙인다.
		 for(String item : arr){
			 answer.append(item);
		 }
		 if(answer.toString().startsWith("0")) return "0";
		 
		 return answer.toString();
	}
}


