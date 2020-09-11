package javaInteviewQue;

public class leapYear {

	public static void main(String[] args) {
		
		//divisible by 4 for all the century year ---ending with 00
		// An year is the leap year when it is divisible by 400

		int year=2000;
		boolean leap=false;
		
		if(year % 4 == 0) {
			if(year % 100 ==0) {
				if(year % 400 == 0) {
					System.out.println(year+" is the leap year");
				}
				else {
					System.out.println("not a leap year");
				}
			}
			else {
				leap=true;
			}
			
		}
		else {
			leap=false;
		}
	}

}
