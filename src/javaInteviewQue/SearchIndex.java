package javaInteviewQue;

public class SearchIndex {
	
	public static int getarr( int arr[], int x) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x)
				return i;
		}
		return x;
	
		
	}

	public static void main(String[] args) {
		
		int arr[]= {56,76,32,89,56,88,21};
        int  x=21;
        System.out.println(getarr(arr, x));
	}

}
