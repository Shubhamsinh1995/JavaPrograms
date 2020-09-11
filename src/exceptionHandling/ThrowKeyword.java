package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
     
		
		System.out.println("Start");
		try 
		{
			int i=9/0;
			throw new Exception("Divide by Zero exception");
		} catch (Exception e)
		{
			e.printStackTrace();
           e.getMessage()	;
        }
		System.out.println("END");
	}

}
