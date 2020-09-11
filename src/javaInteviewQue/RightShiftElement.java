package javaInteviewQue;

public class RightShiftElement {
	static void Movelement(int arr[],int n) {
		int count=0;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%5!=0) {
				arr[count++]=arr[i];
			}
			else 
			sum=arr[i];
		}
		while(count<n){
			arr[count++]=sum;
			}
	}

	public static void main(String[] args) {
		
    int arr[]= {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
	int n=arr.length;
	Movelement(arr,n);
	
/*	int count=0;
	int sum=0;
	
	for(int k=0;k<n;k++)
	{
	 if(arr[k]%5!=0)
	   {
	     arr[count++]=arr[k];
	   }
	 else{
		  sum=arr[k];
         }
    }
	
	while(count<n){
		arr[count++]=sum;
	} */
	   
	   
	for(int j=0;j<n;j++) {
		System.out.println(arr[j]+" ");
     }  
  }
}