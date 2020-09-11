package objectArray;
public class ObjectArray {

	public static void main(String[] args) {
		
		// In object Array we can store different types of element with fixed size which is not allowed in normal array
		
		Object obj[]=new Object[5];
		obj[0]=32;
		obj[1]=1f;
		obj[2]="shubham";
		obj[3]=63.6;
		obj[4]='A';

		System.out.println(obj[2]);
		System.out.println(obj[3]);
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println("size of array is : "+obj.length);
		System.out.println();
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}

}
