package parameterPassing;

public class MyDemo {

	public static void main(String[] args) {
		sayHello(" shubham");
		//int sum=add(200,100);
		//int result=sum*10;
	//System.out.println(result);
		add(2,4);

	}
	 public static void sayHello(String name) {
		 System.out.println("Hello" + name);
	 }
	 
public static int add(int a, int b) {
	int sum=a+b;
	System.out.println(sum);
	return sum;
}
}
