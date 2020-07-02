
public class MiscJavaPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Integer i = new Integer(10); 
	      Integer j = new Integer(20); 
	      swap(i, j); 
	      System.out.println("i = " + i + ", j = " + j);
	      
	        Test t = new Test(5); 
	      
	        // Reference is passed and a copy of reference 
	        // is created in change() 
	        change(t); 
	  
	        // New value of x is printed 
	        System.out.println("Val inside the main method:"+t.x); 
	}
	
	   public static void swap(Integer i, Integer j)  
	   { 
	      Integer temp = new Integer(i); 
	      i = j; 
	      j = temp; 
	   } 
	   
	    // This change() doesn't change the reference, it only 
	    // changes member of object referred by reference 
	    public static void change(Test t) 
	    { 
	    	 t = new Test(); // if we remove this statement thren the output changes
	        t.x = 10; 
	        System.out.println("Val inside the change method:"+t.x);
	    } 

}
