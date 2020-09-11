package switchCase;

public class MySwitchCase {

	public static void main(String[] args) {
		int percentage=80;
		
		switch(percentage) {
		
		case 100:
		case 90:
			System.out.println("very good");
			break;
		case 80:
			System.out.print("not much");
			break;
		case 70:
			System.out.println(" good");
			break;
		case 50:
			System.out.println("ok");
			break;
			default :
				System.out.println("percentage are not defined");
				break;
		}
		

	}

}
