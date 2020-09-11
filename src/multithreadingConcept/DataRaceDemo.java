package multithreadingConcept;
   // DATA RACE concept
public class DataRaceDemo extends Thread {
	public static int x;
	public void run() {
		for(int i=0;i<100;i++) {
			x=x+1;
			x=x-1;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x=0;
		for(int i=0;i<100;i++) {
           DataRaceDemo dt=new	DataRaceDemo();
           dt.start();
           System.out.println(x);
		}
	}

}
