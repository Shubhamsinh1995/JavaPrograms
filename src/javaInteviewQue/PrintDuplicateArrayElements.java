package javaInteviewQue;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateArrayElements {

	public static void main(String[] args) {
		
		String string[]=new String[]{"java", "sring", "hibernate", "java"};
		Set nonDup=new HashSet<>();
		Set dup=new HashSet<>();
		for(String s:string) {
			if(!nonDup.contains(s))
				nonDup.add(s);
			else
				dup.add(s);
		}
      System.out.println("duplicate array elements are:"+dup);
	}

}
