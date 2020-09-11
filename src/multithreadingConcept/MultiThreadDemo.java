package multithreadingConcept;

class A extends Thread{
	public void run() {
		System.out.println(" Start thread ...A");
		for(int i=1;i<4;i++) {
			if(i==1) yield();   // this yield method shows current running thread
			System.out.println("from thread ....A"+i);
		}
		System.out.println("Exit from thread A");
	}
}
class B extends Thread{
	public void run() {
		System.out.println(" Start thread ...B");
		for(int j=1;j<=4;j++) {
			if(j==2) stop();   // at j==2 this thread will die
			System.out.println("from thread ....B"+j);
		}
		System.out.println("Exit from thread B");
	}
}
class C extends Thread{
	public void run() {
		System.out.println(" Start thread ...C");
		for(int k=1;k<=4;k++) {
			if(k==2) {
				try {
					sleep(3000);   // this thread sleep for 3 sec
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
			System.out.println("from thread ....C"+k);
		}
		System.out.println("Exit from thread C");
	}
}

class D extends Thread{
	public void run() {
		System.out.println("start Thread ....D");
		for(int x=1;x<5;x++) {
			System.out.println("thread is running");
			if(x==3) {
				suspend();   // suspend method suspend the execution of thread for some time
				}
		}
		
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) throws Exception {
	Thread t1=new A();
	Thread t2=new B();
	Thread t3=new C();
	Thread t4=new D();
     t1.start();
     t1.join();
    System.out.println("Thread t1 ID "+ t1.getId());
    System.out.println();
    
     t2.start();
     t2.join();
     System.out.println();
     t3.start();
     t3.join();
     System.out.println();
     t4.start();
     
	}

}
