package javaInteviewQue;

public class RightShiftDemo2 {

	static void Movelement(int arr[],int n) {
		int count=0;
		int sum=0;
		int temp;
		for(int i=0;i<n;i++) {
			if(arr[i]%5!=0) {
				//arr[count++]=arr[i];
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				System.out.println(arr[i]);
			}
	}
}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
			int n=arr.length;
			Movelement(arr,n);
	}

}
