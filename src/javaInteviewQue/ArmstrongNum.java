package javaInteviewQue;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		// 153=> 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 =153
        // 371
		
		int num=371;
		int actnum=num;
		double result=0;
		
		while(actnum != 0) {
			int n= actnum%10;
			result=result+Math.pow(n, 3);
			actnum=actnum/10;
		}
		//System.out.println(result);
		
		if(result==num) {
			System.out.println(result);
			System.out.println(num+" is an Armstrong Number");
		}
		else {
			System.out.println(num+" is not an Armstrong Number");
		}
	}

}
