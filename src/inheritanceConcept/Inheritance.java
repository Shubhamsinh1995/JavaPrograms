package inheritanceConcept;

public class Inheritance {

	public static void main(String[] args) {
		B obj=new B();
		obj.add();
        obj.subtraction();
        obj.intnum();// overide the method subtraction from class A
        obj.set();
        obj.carry();
        System.out.println("-----------------------------");
        C obj2=new C();
        obj2.add();
        obj2.subtraction();// overide the method subtraction from class A
        obj2.intnum();
        obj2.set();
        obj2.carry();
        obj2.multiplication();
	}

}
