package javaInteviewQue;

public class CountCharacter {

	static void count (String str) {
		// create char array of given string
          char arr[]=str.toCharArray();
          for(int i=0;i<arr.length;i++) {
        	  
        	  String s="";
        	  
        	  while(i<arr.length && arr[i]!=' ') {
        		  s=s+arr[i];
        		  i++;
        	  }
        	  if(s.length()>0) {
        		  System.out.println(s +"->"+ s.length());
        	  }
          }
	}
	
	public static void main(String[] args) {
		
		String str=" Hello World";
		count(str);
	}
}
