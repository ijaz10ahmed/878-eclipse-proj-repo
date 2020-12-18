package CodilityPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class IterationsCollections {
public static void main(String[] args) {
	//String[] days = {"Monday","Tues","Wed"};
	//for (String day : days) {
	//	System.out.println(day);
	//}
	
	HashSet<String> hs = new HashSet<String>();  
    hs.add("Mon"); 
    hs.add("Tues"); 
    hs.add("Wed"); 
    hs.add("Thurs"); 
    hs.add("Fri"); 
    hs.add("Sat");
    hs.add("Sun");
 
    for (String day : hs)
    {
    System.out.println(day);
    }
    
    System.out.println("------------------------");
    
    HashMap<Integer, String> hmap = new HashMap<>(); 
    
    hmap.put(1,"Mon"); 
    hmap.put(2,"Tue"); 
    hmap.put(3,"Wed");
    hmap.put(4,"Thur");
    hmap.put(5,"Fri");
    hmap.put(6,"Sat");
    hmap.put(7,"Sun");
    for (Integer i : hmap.keySet()) 
    	{
    	  System.out.println(i +" "+ hmap.get(i));
    	} 
} 
}

