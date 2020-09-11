package javaInteviewQue;

public class FibonacciDemo {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int num=20;
	    System.out.println("Fibinacci series is:");
		for(int i=1;i<=num;i++) {
			System.out.print(n1+" ");
			int sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		

	}

}
