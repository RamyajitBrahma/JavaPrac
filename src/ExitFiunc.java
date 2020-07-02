
public class ExitFiunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exitFuunc();
		System.out.println("I am  executed");
	}
	
	public static void exitFuunc() {
		int a =3;
		if(a==4) {
			//Fo nothing
		}
		else {
			return;
		}
		
		System.out.println("I am not executed"); // this will not be executed bcz return statmeent makes it go  back to the parent method and execute the rest by skipping this method
	}

}
