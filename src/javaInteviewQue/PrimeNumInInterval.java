package javaInteviewQue;

public class PrimeNumInInterval {
	
	/*public static int isPrime(int num) {
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void getPrimeNumber(int num) {
		for(int i=2;i<=num;i++) {
		if(isPrime(i)==1)
			System.out.print(i+"  ");
		
		}
	}*/

	public static void main(String[] args) {	
      // System.out.println(isPrime(7));
      // getPrimeNumber(40);
		
		int low=2;
		int high=100;
		while(low<high) {
			boolean flag=false;
			for(int i=2;i<low;i++) {
			if(low%i==0) {
				flag=true;
			break;
			}
		}
			if(!flag)
				System.out.println(low);
			low++;
		}
		
	}

}
