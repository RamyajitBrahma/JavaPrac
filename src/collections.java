import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Arraylist
		/*
		ArrayList<Integer> arrInt = new ArrayList<Integer> ();
		arrInt.add(2);
		arrInt.add(5);
		arrInt.add(2);
		System.out.println(arrInt);
		System.out.println(arrInt.get(2));
		System.out.println(arrInt.indexOf(2));//returns the first occurence of that number if it is a duplicate no 
		System.out.println(arrInt.indexOf(5));
		*/
		
		//HashSet
		/*
		HashMap<Integer,String> hsObj = new HashMap<Integer,String>();
		hsObj.put(1,"First Val");
		hsObj.put(2,"second Val");
		hsObj.put(3,"third Val");
		hsObj.put(null,"It has a null key");
		hsObj.put(6,null);
		hsObj.put(1,"Dupklicate First Val");//duplikcate is not allowed it just overrides the previous allocation
		
		System.out.println("Size is : "+hsObj.size());
		System.out.println("value of the 2nd Obj : "+hsObj.get(2));
		System.out.println("value of the 1st/duplicate Obj : "+hsObj.get(1));
		System.out.println("values : "+hsObj.values());
		System.out.println("keys : "+hsObj.keySet());
		//System.out.println("keys : "+hsObj);
		System.out.println("conditions : "+hsObj.containsValue("First Val"));
		
		//Changing hashset to normal set
		Set setHsObj = hsObj.entrySet();
		Iterator setHsObjIT = setHsObj.iterator();
		int i = 0;
		while(setHsObjIT.hasNext()){
			//System.out.println(setHsObjIT.next());// this will throw erro it is not like SET interface becuase it has keys an values
			Map.Entry mpObj = (Map.Entry)setHsObjIT.next();
			i++;
			mpObj.getKey();
			mpObj.getValue();
			mpObj.setValue("Jit"+i);// this changes the hashmap values
			
			
		}
		
		System.out.println("value of the changed 1st Obj : "+hsObj.get(1));
		System.out.println("value of the changed Obj : "+hsObj.get(2));
		System.out.println("value of the changed Obj : "+hsObj.get(3));
	*/	
		
		//Practixe of arraylist and hashmap example - printing the unique nos in te array and also printing which no is repeated how many times
		int a[] = {3,4,4,4,6,7,7,8,9,9};
		ArrayList<Integer> storingNos = new ArrayList<Integer>();
		
				
		for(int i =0;i<a.length;i++) {
			int counter = 0;
			if(!storingNos.contains(a[i])) {
				storingNos.add(a[i]);
				counter++;
				
				for(int j = i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						counter++;
					}
				}
				System.out.println("No is"+a[i]);
				System.out.println("count fo the above no is"+counter);
				if(counter==1) {
					System.out.println("unique no is"+a[i]);
				}
			}
		
	}

   }
}
