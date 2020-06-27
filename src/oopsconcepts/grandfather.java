package oopsconcepts;

public class grandfather {// if class is marked a final then it cant be extended by any other class

	String grandfather = "I am grandfathr";
	
	final int grandz = 2;

	public void getdataGrandFather() {
		int i = 10;
		int grandz = 3;//allowed even though the global var is amrked aa final bcz this is local var
		System.out.println(grandz);
		//grandz=2;//not allowed to change as it is mrked as final
		System.out.println("Inside grandfather class" + i);
		// grandz=4; not allowed as it is amrked as final
	}

	public void getdataGrandFatherDuplicate() {
		System.out.println("Inside grandfather class same function");
	}

	final void getdataGrandfFinal() {
		System.out.println("Inside grandfather class FINAL keywor check");
	}
	
	public static void grndFthrD() {
		System.out.println("Inside grandfather class using without creating class object");
	}

}
