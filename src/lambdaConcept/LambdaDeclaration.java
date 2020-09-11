package lambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {
		
		
		//  -> this symbol is called lambda express

//WebPage wb3=(st) -> System.out.println(st.toLowerCase());
  
//WebPage wb2=( st) -> System.out.println(st.length());
		
	/*WebPage wb= new WebPage() {
		
		@Override
		public void employee(String name, int age) {
			System.out.println("name: "+name+", price: "+age);
			
		}
	};	*/

		WebPage wb4=(name,price) -> System.out.println("name: "+name+", price: "+price);
		
		wb4.show("Dhoom2", 200);
		
     // wb.employee("Rakesh",43);
   // wb2.header("Facebook");
    //wb3.header("Shubham");
	}

}
