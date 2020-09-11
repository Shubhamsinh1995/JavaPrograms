package interfaceConcept;

public interface USbank {
	int min_bal=100;
	public void credit();
	public void debit();
	public void withdraw();
    
	// no method body, only declaration 
	//method prototype
	// we cannot create the object of interface
	// in interface only abstract methods are allowed
	//interface variables are static in nature by default
	//interface gives 100% abstraction
}
