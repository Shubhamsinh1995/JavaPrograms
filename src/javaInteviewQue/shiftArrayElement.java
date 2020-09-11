package javaInteviewQue;

public class shiftArrayElement {

	public static void main(String[] args) {
	
		int[] arr1= {3,4,6,8,9,10};
		int[] arr2=shiftArrayRight(arr1);
		printArray(shiftArrayRight(arr2));
	}
	
	public static int[] shiftArrayRight(int[] arr1) {
		int temp=arr1.length-1;
		for(int i=arr1.length-2;i>-1;i--) {
			arr1[i+1]=arr1[i];
			
		}
		arr1[0]=temp;
		return arr1;

}
	public static void printArray(int[] arr) {
		for(int x:arr) {
			System.out.print(x+",");
		}
	}
	}