package exceptionDemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo {

	// throws keyword used only to suppress the Exception, it is not used to handle the Exception
	public static void main(String[] args) throws IOException {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) 
		{
		String str="";
	  //  br=new BufferedReader(new InputStreamReader(System.in));  // this is resource and we need to close this before executing program
        //   as soon as the try block executed this resource gets deallocated , no need to use br.close() method
		
		str=br.readLine();
		
		}
	
		/*	catch(Exception e)
		{
		  System.out.println(e);	
		}
		finally
		{
			br.close(); // to close the resource
		}*/
	}

}
