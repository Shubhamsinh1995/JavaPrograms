package javaInteviewQue;

public class MainClass {
	
	public static void stringCombinations(String str) {
		System.out.println("Combinations of string "+str);
		System.out.println();
		stringCombinations("",str);
	}
	
   private static void stringCombinations(String comb, String str) {
	   String rev="";
	   if(str.length()==0) {
		  System.out.println(comb);
		   for(int i=comb.length()-1;i>=0;i--) {
			   rev=rev+comb.charAt(i);
		   }
		   if(comb.equals(rev)) {
			   System.out.println("String is palindromable");
		   }
	   }
	   else {
		   for(int i=0;i<str.length();i++) {
			   stringCombinations(comb+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
			   }
		 
}
   }
	public static void main(String[] args) {
		
		stringCombinations("NINIT");
		 

	}

}
