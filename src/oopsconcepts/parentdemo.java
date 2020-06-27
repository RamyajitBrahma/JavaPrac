package oopsconcepts;

public class parentdemo {
     int z = 12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println("Inside parent void main" +z);
		int z = 13;
		System.out.println("Inside parent void main" +z);
        getData();
	}
	
	public static void getData() {
		int i = 10;
		int j = 11;
		System.out.println("Parent class" + i);
	}

}
