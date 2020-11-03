package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stubHashMap <String,Integer> hashMap=new HashMap<String,Integer>();
		HashMap <String,Integer> hm=new HashMap<String,Integer>();
		hashMap.put(null,new Integer(1));
		hashMap.put("Two" ,new Integer(2));
		hashMap.put("Three",new  Integer(3));
		hashMap.put("Three",new  Integer(5));
		//hashMap.put(null,new Integer(4));
		hm.putAll(hashMap);
		System.out.println(hashMap);
		System.out.println("HashMap contains "+hashMap.size() + "key value pairs.");
		//Finding particular value from the HashMap:
		if(hashMap.containsValue(new Integer(1))) {
			System.out.println("HashMap contains 1 as value");
		}
		else {
			System.out.println("HashMap does not contain 1 as" + " value");
		}
		   System.out.println("Retrieving all keys from" + "the HashaMap");
		   Iterator<String> iterator=hashMap.keySet().iterator();
		   while(iterator.hasNext()) {
			   System.out.println(iterator.next());
		   }
		   System.out.println("Retrieving all key value pairs :");
		   Iterator<Map.Entry<String,Integer >>itr=hashMap.entrySet().iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
			  }
		HashMap <String,Integer> obj=new HashMap<String,Integer>();
   obj.add("Hi");
    obj.add("Hlo");
    obj.add("Howru");
   obj.put("Two" ,new Integer(2));
	obj.put("Three",new  Integer(3));
	obj.put("five",new  Integer(5));
 
   
   
	}

}
