package ÇÁ·Î±×·¡¸Ó½º2;

public class ¿Ã¹Ù¸¥°ýÈ£ {
	  boolean solution(String s) {
	        boolean answer = true;
	        int count=0;
	    
	        char[] temp = s.toCharArray();
	       
	        for(int i = 0 ; i<temp.length;i++){
	        	if(temp[i]=='('){
	        		count++;
	        		;
	        	}
	        	if(temp[i]==')'){
	        		count--;
	        		;
	        	}
	        	if(count==-1){
	        		return false;
	        	}
	        }
	        if(count==0){
	        	answer=true;
	        }
	        else
	        	answer=false;
	        
	        
	        
	        /* if(s.substring(0,1).equals(")")||s.substring(s.length()-1, s.length()).equals("(")){
           		return false;
           		
           	}
	        for(int i =0; i<s.length();i++){
	        	
	        	
	        	if(s.substring(i,i+1).equals("(")){
	        		count++;
	        		count3++;
	        		}
	        	if(s.substring(i,i+1).equals(")")){
	        		count2++;
	        		count3--;
	        			}
	        	if(count3==-1){
	        		return false;
	        	}
	        	}
	        
	        
        
	        if(count==count2){
	        	answer=true;
	        }
	        else
	        	answer=false;   
      */
        	
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			¿Ã¹Ù¸¥°ýÈ£ ¿Ã°ý = new ¿Ã¹Ù¸¥°ýÈ£();
			System.out.println(¿Ã°ý.solution("()()()"));
			System.out.println(¿Ã°ý.solution(")()("));
	}

}
