package polymorphism;

public class MyClass {

	public static void main(String[] args) {
		BANK_ABC abc=new BANK_ABC();
		BANK_DEF def=new BANK_DEF();
		BANK_XYZ xyz = new BANK_XYZ();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());

	}

}
