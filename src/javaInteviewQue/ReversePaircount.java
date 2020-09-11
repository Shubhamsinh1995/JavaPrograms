package javaInteviewQue;

public class ReversePaircount {

	public static void main(String[] args) {
		
		int[] arr= {21,43,54,23,67,90,84,34,45,55,76,26,48};
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[i]-arr[j])%9==0 && (arr[i]+arr[j])%11==0) {
						System.out.println(arr[i]+","+arr[j]);
						count++;
				}
		}
         
	}
		System.out.println();
    System.out.println("reverse number count: "+count);
  }
}
