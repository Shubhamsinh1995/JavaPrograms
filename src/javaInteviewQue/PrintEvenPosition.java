package javaInteviewQue;

public class PrintEvenPosition {

	public static void main(String[] args) {
	
		int arr[]= {1,4,32,48,9,87,55,43,76,98,21};
	
		for(int i=2;i<=arr.length;i=i+2) {
			System.out.println("Index "+i);
			System.out.println("Value "+arr[i]);
			System.out.println();
		}

	}

}
