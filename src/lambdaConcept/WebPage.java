package lambdaConcept;


@FunctionalInterface
public interface WebPage {

// SAM--Single abstract method that means only one abstract method allowed in FunctionalInterface

	//public void header(String st);
    //public void employee(String name, int age);
	public void show(String name, int price);


}
