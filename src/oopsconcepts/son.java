package oopsconcepts;

public class son extends father implements interface1,standalonmeinterfce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sonObj object will have access to both father nad grandfather methods and variable becuase son extends father and father extends grandfather
     son sonObj = new son();
     System.out.println("Inerface var"+interface1.interface1Var);
     sonObj.songetdata();
     sonObj.getdataGrandFatherDuplicate();// this takes the function of the i9mmediate parent , hence taking it from father and grandfather
     sonObj.getdataGrandFather();
     sonObj.fatherGetData();
     sonObj.interface1getdata();
     sonObj.interfce2getData();
     
     //example of typecastring objects 
     // sobObjfather this object will have access to only grandfather methods and variables becuase return type is grandfather, it wont have access to son methods or vars
     grandfather sobObjfather = new son(); // example of reference typecastring
  // another eway of doing the above typecasting. here also sobObjfather1 will only have access to grandfather vars an methods
     //Super class csn be explicityl typecasted to sublass but not the vice versa
     grandfather sobObjfather1 = (grandfather) sonObj; 
     sobObjfather.getdataGrandFather();
     sobObjfather1.getdataGrandFather();
     //Runtime polymorohism - above example is also that
     standalonmeinterfce sonObjInterface = new son();
     sonObjInterface.standalonmeinterfcegetData();
     
    }
	
	public void songetdata(){
		System.out.println("inside son get data");
		super.getdataGrandFatherDuplicate();// this takes the function of the i9mmediate parent , hence taking it from father and grandfather

		
	}
	
	public void interface1getdata() {
		System.out.println("inside son get data interface1");
	}

	
	public void interfce2getData() {
		// TODO Auto-generated method stub
		son sonObj = new son();
		
		sonObj.getdataGrandFather();
		sonObj.standalonmeinterfcegetData();
	}

	
	public void standalonmeinterfcegetData() {
		// TODO Auto-generated method stub
		
	}
}