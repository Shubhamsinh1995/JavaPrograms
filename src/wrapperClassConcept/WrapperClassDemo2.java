package wrapperClassConcept;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		//  Wrapper class Conversion
      String s1="40";
      String s2="60";
      //System.out.println(s1+s2);
    
      int i=Integer.parseInt(s1);
      int j=Integer.parseInt(s2);
     int sum=i+j;
       System.out.println(sum);
       System.out.println("---------------------");
       
       String st1="40.00";
       String st2="60.00";
       double k=Double.parseDouble(st1);
       double l=Double.parseDouble(st2);
       double res=k+l;
       System.out.println(res);
	}

}

//some java wrapper Classes
/* 
boolean :-> Boolean
byte :-> Byte
int :-> Integer
char :-> Character
float :-> Float
long :-> Long
short :-> Short
double :-> Double

*/