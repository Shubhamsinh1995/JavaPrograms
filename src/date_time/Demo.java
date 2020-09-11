package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
         System.out.println(date.getTime());  // here time method gives  time in miliseconds
         System.out.println(date.getDate());
         System.out.println(date.getDay());   // o/p is 5 that means friday bcoz day starts from monday
         System.out.println(date.getHours());
         System.out.println(date.getMinutes());
         System.out.println(date.getMinutes());
         System.out.println(date.getMonth());
         System.out.println(1900+date.getYear());
         
         System.out.println("****************************");
         SimpleDateFormat sdf=new SimpleDateFormat("E  yyyy-MM-dd  HH:mm:ss");
         System.out.println(sdf.format(date));
         System.out.println(sdf.toPattern());
	}

}
