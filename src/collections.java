import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Arraylist
		//Array list stores elements in sequential order as they r added
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
		
		/*
		//main diff between array and arraylist is array has fixed sizwe but arraylist r dynamic and we can insert any value at any index in between
		ArrayList<String> arrString = new ArrayList<String> ();
		arrString.add("Kolkata");
		arrString.add("Mumbai");
		arrString.add("Kolkata"); // all classes of list interface can accedpt duplicate values
		arrString.add(1,"Delhi"); // this add is not present for an integer arraylist
		arrString.add("Goa");
		//arrString.remove(1);
		//arrString.remove("Kolkata");
		
		System.out.println("First string"+arrString.get(0));
		System.out.println("second string"+arrString.get(1));
		System.out.println(arrString);
		System.out.println("Size of arraylist is "+ arrString.size());
		System.out.println(arrString.contains("kolkata")); // it is case sensitive
		System.out.println(arrString.contains("Kolkata"));
		System.out.println(arrString.indexOf("Kolkata")); //returns first occirence if it is duplicate
		arrString.remove("Kolkata"); // rrmoves first occurence of the string if duplicate
		System.out.println(arrString);
		System.out.println(arrString.isEmpty());
		//arrString.listIterator();
		
		//For arraylist also u can use interator to get values or run a for loop and get each ite  with get(i) method
		Iterator<String> arrStrngItertr=arrString.iterator(); 
		while(arrStrngItertr.hasNext()) {
			System.out.println(arrStrngItertr.next());
		}
		 
		 */
		 
		 /*
		
		//HashSet   - hashset will accept duplicate values
		// hashset the elements doesnt get stored in sequential order
		// like arraylist hashset doesnt have the get(i) mentod to fetch the values in each index hence they use an interface names iterator 
		
		HashSet<String> hs = new HashSet<String> ();
		hs.add("INDIA"); //wont have an insex option in hashset becuase it is stored in non sequesntial order
		hs.add("UK");
		hs.add("INDIA"); // womnt print this becuase it is duplicate 
		hs.add("Cambodia");
		hs.add("Argentina");
		hs.add("Sinaloa");
		System.out.println(hs);
		System.out.println("size:"+hs.size());
		System.out.println("contains:"+hs.contains("INDIA"));
		hs.remove("UK");
		System.out.println(hs);
		System.out.println("size:"+hs.size());
		
		Iterator<String> hsIt=hs.iterator();
		while(hsIt.hasNext()) {
			System.out.println(hsIt.next());
		}
		
		
		HashSet<Integer> hsInt = new HashSet<Integer> ();
		hsInt.add(3);
		Iterator<Integer> hsIntIt=hsInt.iterator();
		while(hsIntIt.hasNext()) {
			System.out.println(hsIntIt.next());
		}
		
		*/
		
		
		/*
		//HashMap
		
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
		
		//Changing hashmap to normal set
		Set setHsObj = hsObj.entrySet();
		Iterator setHsObjIT = setHsObj.iterator();
		int i = 0;
		while(setHsObjIT.hasNext()){
			//System.out.println(setHsObjIT.next());// this will throw erro it is not like SET interface becuase it has keys an values
			Map.Entry mpObj = (Map.Entry)setHsObjIT.next();
			i++;
			System.out.println(mpObj.getKey());
			System.out.println(mpObj.getValue());
			System.out.println(mpObj.setValue("Jit"+i));// this changes the hashmap values
			
			
		}
		
		System.out.println("value of the changed 1st Obj : "+hsObj.get(1));
		System.out.println("value of the changed Obj : "+hsObj.get(2));
		System.out.println("value of the changed Obj : "+hsObj.get(3));
	*/	
		
	
  ///*		
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
//*/
		
		/*
		 Difference between and hashTable read from the rahul shetty udemy lecture 298
		 */
		 
   }
}
