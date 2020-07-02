
import java.util.*;

public class ReturnMultipleVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> person = returnMultipleVal();
		System.out.println(person);
		System.out.println(person.contains("Geek"));
		System.out.println(person.size());
		

	}

	
	public static List<Object> returnMultipleVal() {
        String name = "Geek"; 
        int age = 35; 
        char gender = 'M';
        
        List<Object> arrObj = new ArrayList<Object> ();
        arrObj.add(name);
        arrObj.add(age);
        arrObj.add(gender);
        return arrObj;
        
     // this is another way of directly adding it as list , in this u dont have to add it individually
        //List<Object> arrObj = Arrays.asList(name,age,gender); // this is one way of directly adding it as list
        //return arrObj;
        
        
	}
	

}
