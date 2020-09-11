package interfaceConcept;

public class RunInterface {

	public static void main(String[] args) {
		Test tst=new Test();
		tst.credit();
		tst.debit();
		tst.withdraw();
		System.out.println("******************");
		tst.educationLoan();
		tst.homeLoan();
		tst.insurance();
		System.out.println("********************");
		System.out.println(Test.min_bal);
		tst.tset();
       tst.getRBI();
       tst.getUSbank();
	}


}
