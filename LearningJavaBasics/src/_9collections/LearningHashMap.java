package _9collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearningHashMap {

	public static void main(String[] args) {

        //HashMap<String, String> hm = new HashMap<>();    
        Map<String, String> hm = new HashMap<>();  
        
        hm.put("Jason", "5645664");
        hm.put("Kerrie", "8678667");
        hm.put("Lee", "564564");
        hm.put("Jack", "6576575");
        hm.put("Ben", "654645");
        hm.put("Ben", "654645");
        
        //System.out.println(hm.get("Kerrie"));
        
        System.out.println("=================KEYS======================="); 
       Set<String> keys=  hm.keySet();
       
       for(String k : keys)
       {
    	   System.out.println(k);
       }
       
       System.out.println("=================VALUES=======================");
       Collection<String> values=hm.values();
       
       for(String v : values)
       {
    	   System.out.println(v);
       }
        
        
        

	}

}
