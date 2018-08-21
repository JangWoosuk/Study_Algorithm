package 프로그래머스2;

public class 다음으로큰수 {
	
	 public int solution(int n) {
		 int answer = n;
		 int count1=0;
		 int loopCount=0;
		 int [] binary= toBinary(n);
		 boolean result=true;
		 //이진수에서 1을 찾아서 카운트를한다.
		 for(int i =0; i<binary.length; i++){
			 if(binary[i]==1){
				 count1++;
			 }
		 }
		 
		 while(result){
			 answer++;
			 int [] temp =toBinary(answer);
			 for(int i =0; i<temp.length;i++){
				 if(temp[i]==1){
					 loopCount++;
				 }
			 }
			 if(loopCount==count1){
				 result=false;
			 }
			 else{
				 loopCount=0;
				 result=true;
			 }
		 }
		 
		 return answer;
	  }
	 //2진수로 변환
	public int[] toBinary(int n){ 
		int count=0;
		int x = n;
		//2진수의 숫자가 몇개나 있는지 확인
		 while(n>1){
			 n=n/2;
			 count++;
		 }
		int [] binary= new int[count+1];
		 
		 for(int i =binary.length-1; i>=0; i--){
			 if(x/2>=1){
				 
				 binary[i]=x%2;
				 x=x/2;
			 }
			 else
				 binary[i]=1;
			 
		 }
		 int[] result= new int[binary.length];
			
		 for(int i = 0; i<=binary.length-1;i++){
			 result[i]=binary[i];
		 }
		 
	
		 return result;
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 83;
		다음으로큰수 다음 = new 다음으로큰수();
		int[] binary =다음.toBinary(n);
		System.out.println(n+"을 2진수로 변환한 값은");
		for(int i = 0; i<binary.length;i++){
			System.out.print(binary[i]);
		}
		System.out.println();
		System.out.println("확인하기");
		String num = Integer.toBinaryString(n);
		System.out.println(n+"을 toBinaryString으로 변환한 결과:"+num);
		
		System.out.println(다음.solution(15));
	}	
		
		

}
