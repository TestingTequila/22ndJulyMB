package _collections;

import java.util.HashSet;
import java.util.Iterator;

public class LearningHashSet {

	public static void main(String[] args) {

            HashSet<Integer> set = new HashSet<>();
            set.add(12);
            set.add(45);
            set.add(100);
            set.add(45);
            System.out.println("=====Advanced For LOOP=====================");
            for(int s : set)
            {
            	System.out.println(s);
            }
            
            
            System.out.println("=====ITERATOR LOOP=====================");
           Iterator<Integer> it= set.iterator();
           
           while(it.hasNext())
           {
        	   System.out.println(it.next());
           }

	}

}
