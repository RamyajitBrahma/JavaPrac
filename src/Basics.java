import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Basics {
      int globalVar = 11;
      static int staticVar = 13;
      final int finalVar = 15;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println(zz1);
		/*
		int a = 2;
		int b =3;
		int c = a+b;
		int d;
		d=a+1;
		System.out.println("SUM is:"+c);
		System.out.println("SUM is:"+d);
		
		//int methodValue = sumAdd(2);
		//System.out.println("SUM of method:"+methodValue);
		//int i = 1;
		//for(i=1;i<5;i++) {
			//System.out.println("Check");

			
		//}
		String aStr = "Hotath Porlot Mone";
		
		boolean z = aStr.contains("Por");
		System.out.println(z);
		boolean zz = aStr.equalsIgnoreCase("HOTAT Porlo Mone");
		System.out.println(zz);
		boolean zz1 = aStr.equalsIgnoreCase("HOTATH PorloT Mone");
		System.out.println(zz1);
		
		char aa = aStr.charAt(4);
		System.out.println(aa);
		
		int aInt = aStr.indexOf("o");
		System.out.println(aInt);
		
		 aInt = aStr.indexOf("H");
		System.out.println(aInt);
		
		 aInt = aStr.indexOf("h");
		System.out.println(aInt);
		
		 aInt = aStr.indexOf("Por");
		System.out.println(aInt);
		
		 aInt = aStr.indexOf("ot");
		System.out.println(aInt);
		
		 aInt = aStr.indexOf("por");
		System.out.println(aInt);
		
		String aStr1 = "Payments $100 paid";
		aInt = aStr1.indexOf("$");
		System.out.println("Index Of"+aInt);
		
		System.out.println(aStr1.contains("ments"));
		System.out.println(aStr1.contains("Ments"));
		
		
		
		String aStrSubString = aStr1.substring(3);
		System.out.println(aStrSubString);
		
		 aStrSubString = aStr1.substring(3, 10);
		System.out.println(aStrSubString);
		
		String aStr2 = "Jit";
		aInt = aStr2.length();
		System.out.println(aInt);
		
		
		
		aStr2 = aStr2.replace("i", "e");
		System.out.println(aStr2);
		
		//aStr2 = aStr2.replace("I", "e");  an erro is coming if I am execuyting this line .. 
		//System.out.println(aStr2);
		
		//aStr2 = aStr2.replace("i", "ee");  an erro is coming if I am execuyting this line .. 
		//System.out.println(aStr2);
		
		aStr2 = aStr2.replace("et", "eet");
		System.out.println(aStr2);
		
		aStr2 = aStr2.replace("e", "ii");
		System.out.println(aStr2);
		
		aStr2="Jit/Someone/Two";
		String aStr2Arr[]=aStr2.split("/");
		System.out.println(aStr2Arr.length);
		System.out.println(aStr2Arr[0]);		
		
		aStr2="jit is a good boy";
		String aStr3 = "jit is a good boy";
		String aStr4 = "JIT is a GOOD BOY";
		
		if(aStr2==aStr3) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
		if(aStr2==aStr4) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
		if(aStr2.equals(aStr3)) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
		if(aStr2.equals(aStr4)) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
		if(aStr2.equalsIgnoreCase(aStr4)) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
		
		int a1[][] = new int[3][5];
		int lengthOfArrayRow = a1.length;
		System.out.println(lengthOfArrayRow);
		
		int lengthOfArrayCol = a1[0].length;
		System.out.println(lengthOfArrayCol);
		
		String b1[] = new String[4];
		int lengthOfArray = b1.length;
		System.out.println(lengthOfArray);
		*/
		
		
		Date d = new Date();
		//d.getHours();
		//System.out.println(d.getHours());
		String todayDate = d.toString();
		System.out.println(todayDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		String formatDate = sdf.format(d);
		System.out.println(formatDate);
		
		int cal = Calendar.DAY_OF_MONTH;
		System.out.println(cal);
		
		Calendar calObj = Calendar.getInstance();
		int cal2 = calObj.DAY_OF_MONTH;
		System.out.println(cal2);
		
		int cal3 = calObj.get(Calendar.DAY_OF_MONTH);
		System.out.println(cal3);
		
		int cal31 = calObj.get(calObj.DAY_OF_MONTH);
		System.out.println(cal31);
		int cal4 = calObj.get(calObj.HOUR_OF_DAY);
		System.out.println(cal4);
		
		int cal5 = calObj.get(calObj.MINUTE);
		System.out.println(cal5);
		
		/*
		String aaa = "dsfdsf";
		if(aaa.equals("dsfdsf")) {
			System.out.println("True");
		}
		
		Basics bsObj = new Basics();
		int zz1=bsObj.sumAdd(2);
		System.out.println("Just printing the var"+zz1);
		int zz2 = bsObj.sumAdd(4);
		System.out.println("Just printing the var"+zz2);
		bsObj.globalvarCheck();
	}
	
	public int sumAdd(int d) {
		d=d+1;		
		//finalVar = finalVar+11; //not allowed as finalvar is amrked as FINAl
		globalVar=globalVar+1; //global varioable values can be changes inside a method becuase it is accesible to all methods
		System.out.println("After changing"+globalVar);
		return d;
	}
	
	public void globalvarCheck() {
		//d=d+1;		
		//globalVar=globalVar+1; //global varioable values can be changes inside a method becuase it is accesible to all methods
		System.out.println("After changing"+globalVar);
		//return d;
	}
	
	public static void staticCheck() {
		//d=d+1;		
		//globalVar=globalVar+1; //global varioable values can be changes inside a method becuase it is accesible to all methods
		System.out.println("checking static var");
		//return d;
		 */
		 
	}

}
