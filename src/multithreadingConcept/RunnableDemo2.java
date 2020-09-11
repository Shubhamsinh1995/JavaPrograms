package multithreadingConcept;

// here  we use lambda expression
public class RunnableDemo2 {

public static void main(String[] args) throws Exception {
		
	/*	Runnable abc=() -> {
				for(int i=1;i<=5;i++) {
				  System.out.println("Shubham");
				  try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
			};
		Runnable def=() ->{
				 for(int i=1;i<=5;i++) {
					  System.out.println("Baiyas");
					  try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
					}
			 };*/
       
       Thread t1=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				  System.out.println("Shubham "+Thread.currentThread().getPriority());
				  try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
			});
       Thread t2=new Thread(() ->{
			 for(int i=1;i<=5;i++) {
				  System.out.println("Baiyas "+Thread.currentThread().getPriority());
				  try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
		 });
       
       t1.setName("magic");
       t2.setName("Power");
       System.out.println(t1.getName());
       System.out.println(t2.getName());
       
       t1.setPriority(Thread.MIN_PRIORITY);  // 1 means minimum priority and 10 means max priority
       t2.setPriority(Thread.MAX_PRIORITY);
       System.out.println(t1.getPriority());
       System.out.println(t2.getPriority());
       
       t1.start();
       try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
       t2.start();
       
       
       t1.join(); //  join() method waits for this thread to die
       t2.join();
       
       System.out.println(t1.isAlive());// isAlive() method shows thread is alive OR dead
       System.out.println("THE END ");
      
	}

	}


