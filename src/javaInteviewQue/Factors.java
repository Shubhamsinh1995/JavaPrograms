package javaInteviewQue;

public class Factors {
	public static void factorsOf(int num) {
		System.out.print("Factors of "+num+" : ");
	for(int i=1;i<=num;i++) {
		if(num%i==0)
			System.out.print(i+" ");
	}
}
	public static void main(String[] args) {
		
		// 10=> 1,2,5,10
		//20=> 1,2,4,5,10,20
		
		factorsOf(60);
		
		
		}

	}


