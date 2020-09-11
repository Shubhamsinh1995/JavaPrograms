package multithreadingConcept;

 class ABC implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
		  System.out.println("Shubham");
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 
 class DEF implements Runnable{
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

public class RunableDemo {

	public static void main(String[] args) {
		
		Runnable abc=new ABC();
		Runnable def=new DEF();
       
       Thread t1=new Thread(abc);
       Thread t2=new Thread(def);
       
       t1.start();
       try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
       t2.start();
	}

}
