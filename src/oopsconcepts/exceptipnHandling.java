package oopsconcepts;

public class exceptipnHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptipnHandling excpObj = new exceptipnHandling();
		excpObj.exceptionCheck();

	}
	
	public void exceptionCheck() {
	//try should have either catch or finally to copomplete the block
		try {
			int a[] =new int[3];
			a[0]= 2;
			a[1]=3;
			System.out.println(a[1]);
			System.out.println(a[4]);
			System.out.println(a[2]);
			//throw new IndexOutOfBoundsException(); //can throw error like this also
		}
		//catch block shd always be the exact next statement after try .. anything else after try then catch will not work
		//System.out.println(catch wont work")";
	
		catch(IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			//System.out.println(ex.fillInStackTrace("Check"););
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//System.out.println("code after catch"); // any code after catch will be executed , catch i used so that it catches it do some operation inside catch but does t stop execution
		//throw new IndexOutOfBoundsException("Got index out of bond exception");
		
		//finallyt block only works if there is try block .. it can work without catch but not wiothout try
		finally {
		System.out.println("in final block");
	}

}
}
