package interfaceConcept;

public class Test implements USbank, RBIbank{
	public void tset() {
		System.out.println("This is my own method");
	}

	@Override
	public void educationLoan() {
		System.out.println("Test...edu.loan");
		
	}

	@Override
	public void insurance() {
		System.out.println("test ....insurance");
		
	}

	@Override
	public void credit() {
		System.out.println("test ...credit");
		
	}

	@Override
	public void debit() {
		System.out.println("Test ...debit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Test...withdraw");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("Test ...homeLoan");
		
	}

	public static void getRBI() {
		System.out.println("this is ststic method of RBI");
	}
	
    public static void getUSbank() {
    	System.out.println("this is ststic method of USbank");
    }

    }


