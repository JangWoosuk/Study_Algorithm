package ���α׷��ӽ�2;

public class ��������ū�� {
	
	 public int solution(int n) {
		 int answer = n;
		 int count1=0;
		 int loopCount=0;
		 int [] binary= toBinary(n);
		 boolean result=true;
		 //���������� 1�� ã�Ƽ� ī��Ʈ���Ѵ�.
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
	 //2������ ��ȯ
	public int[] toBinary(int n){ 
		int count=0;
		int x = n;
		//2������ ���ڰ� ��� �ִ��� Ȯ��
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
		��������ū�� ���� = new ��������ū��();
		int[] binary =����.toBinary(n);
		System.out.println(n+"�� 2������ ��ȯ�� ����");
		for(int i = 0; i<binary.length;i++){
			System.out.print(binary[i]);
		}
		System.out.println();
		System.out.println("Ȯ���ϱ�");
		String num = Integer.toBinaryString(n);
		System.out.println(n+"�� toBinaryString���� ��ȯ�� ���:"+num);
		
		System.out.println(����.solution(15));
	}	
		
		

}
