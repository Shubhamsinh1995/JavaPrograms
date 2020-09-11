package multithreadingConcept;

class Sys{
	int num;
	boolean valueSet=false;
	
	public synchronized void put(int num) {
		
		while(valueSet) {
			try {wait();} catch(Exception e) {}
		}
		System.out.println("put "+num);
		this.num=num;
		valueSet=true;
		notify();
	}
	public synchronized void get() {
		while(!valueSet) {
			try {wait();} catch(Exception e) {}	
		}
		System.out.println("Get "+num);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable{
	Sys s;

	public Producer(Sys s) {
		this.s = s;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			s.put(i++);
			try {Thread.sleep(1000);} catch(Exception e){}
		}
	}
	
}

class Consumer implements Runnable{
	Sys s;

	public Consumer(Sys s) {
		this.s = s;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	public void run() {
		while(true) {
			s.get();
			try {Thread.sleep(1000);} catch(Exception e){}
		}
	}
	
	
}

public class InterThreadDemo {

	public static void main(String[] args) {
		Sys s=new Sys();
		new Producer(s);
		new Consumer(s);

	}

}
