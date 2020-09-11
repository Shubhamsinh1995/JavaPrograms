package javaInteviewQue;

public class SwapInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x=10;
       int y=20;
       System.out.println("before swappin");
       System.out.println("x:"+x+"  y:"+y);
       System.out.println("---------------------------");
       
       // swap using third variable
       System.out.println("Using third variable");
      int t;
      t=x;
       x=y;
       y=t;
       //System.out.println("After swappin");
    //   System.out.println("x:"+x+"  y:"+y);
      // System.out.println("--------------------------");
       
       // swap without using third variable
     /*  System.out.println("Without Using third variable");
       x=x+y;  
       y=x-y;  
       x=x-y;  */
       
    // swap without using third variable and *,/ operator
      // x=x*y; //200
     //  y=x/y;
    //   x=x/y;
       System.out.println("After swappin");
       System.out.println("x:"+x+"  y:"+y);  
       
       
	}

}
