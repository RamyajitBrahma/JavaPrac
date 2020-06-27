package oopsconcepts;

public class father extends grandfather {
    int fatherz = 13;
    String grandfather = "I am fathr";
    int grandz = 6;
    static String arg = "dd";
   // int globalVar = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Inside father get data printing with super"+super.grandfather);
		grndFthrD();//cant use this if grndFthrD is not mentioned as static
		System.out.println(father.arg);
		son sonObj=new son();
		sonObj.songetdata();
		//sonObj.grndFthrD();//cant use this if grndFthrD is mentioned as static??????? WHY is this SO
        father fObj = new father();
        fObj.getdataGrandFatherDuplicate();
        //fObj.super.getdataGrandFatherDuplicate(); not valid
        //super.getdataGrandFatherDuplicate(); cant use super in a static context
        String GrndFString = fObj.grandfather;
        int returnFunction = fObj.fatherGetDataReturnInt();
        //System.out.println(fatherz);
        System.out.println(returnFunction);
        System.out.println(GrndFString);
        fObj.getdataGrandFather();
        fObj.fatherGetData();
        
        
        //son fsonObj = (son) new father();
        // this is similar to son fsonObj = new son(); since we cant create a father obj with return type of son we need to typec ast it to (son) but it did not work??
        //fsonObj.songetdata();
        //System.out.println("Inside father get data printing global var"+fatherz);
	}
	
	public void fatherGetData() {
		int fatherz = 12;
		System.out.println("printing child var"+grandz);
		System.out.println("printing parent var"+super.grandz);//can use duplicate var name even if it is marked as final in parent class but cant change the value in parent class
		System.out.println("printing gl;obal var"+this.fatherz);
		System.out.println("printing local var"+fatherz);
		System.out.println("Inside father get data printing with super"+super.grandfather);
		super.getdataGrandFatherDuplicate();
		getdataGrandFatherDuplicate();
		System.out.println("Inside father get data");
		System.out.println("Inside father get data printing global var"+fatherz);
	}
	
	public void getdataGrandFatherDuplicate() {
		System.out.println("Inside father class same function");
	}
	
	public int fatherGetDataReturnInt() {
		System.out.println(grandz);
		return grandz;
		
	}
	
	//will not allow to create this method bcz it is marked as final in parent class hence cant override
	//public void getdataGrandfFinal() { //will not allow to create this method bcz it is marked as final in parent class hence cant override
		//System.out.println("Inside father class FINAL keywor check");
	//}
}
