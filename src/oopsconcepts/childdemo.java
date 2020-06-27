package oopsconcepts;

public class childdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accessing variables and mthods by creating objects of the classes
      parentdemo parentObj = new parentdemo();
      parentObj.getData();
      int childz = parentObj.z;
      System.out.println("Inside childdemo printing global variable from parent demo"+childz);
	}

}
