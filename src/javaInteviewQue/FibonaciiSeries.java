package javaInteviewQue;

public class FibonaciiSeries {

	public static void main(String[] args) {
		
        int max=20;
        int n1=0;
        int n2=1;
        System.out.println("Fibinacci series is:");
        for(int i=1;i<=max;i++) {
        	System.out.print(n1+" ");
        	int sum=n1+n2;
        	n1=n2;
        	n2=sum;
        	
        }
	
         // OR
//	int count=10;
//	int num[]=new int[count];
//	num[0]=0;
//	num[1]=1;
//	 for(int i=2;i<count;i++) {
//		 num[i]=num[i-1]+num[i-2];
//
//	 }
//	for(int k:num) {
//		System.out.print(k+" ");
//	}
}
}
