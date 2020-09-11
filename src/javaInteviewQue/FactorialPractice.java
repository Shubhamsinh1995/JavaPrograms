package javaInteviewQue;

public class FactorialPractice {
	
   public static int factoRial(int num) {
	   System.out.print("factorial of "+num+" is: ");
    	int fact=1;
    	for(int i=1;i<=num;i++) {
    		fact=fact*i;
    	}
    	return fact;
    }
   
     public static int fact(int num) {
    	 if(num==0)
    		 return 1;
    	 else
    	 return (num*fact(num-1));
     }
	public static void main(String[] args) {
	
		// Using For loop
         System.out.println( factoRial(5));
         System.out.println( factoRial(6));
         System.out.println( factoRial(4));
         
         System.out.println();
         System.out.println( "Using Recursive function");
         System.out.println(fact(3));
         System.out.println(fact(5));
         System.out.println(fact(4));
         
         
		/*OR
		int number=5;
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);*/
	}

}
