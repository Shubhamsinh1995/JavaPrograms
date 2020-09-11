package multithreadingConcept;

class Hi extends Thread{
	  public void run() {
		  for(int i=1;i<=5;i++) {
			  System.out.println("shubham");
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  }
		  
	  }
}

class Hello extends Thread{
	  public void run() {
		  for(int i=1;i<=5;i++) {
			  System.out.println("Baiyas");
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  }
		  
	  }
}
public class MultithreadPractical {

	public static void main(String[] args) {
		Hi o1=new Hi();
		Hello o2=new Hello();
		
		o1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		o2.start();

	}

}
  
  