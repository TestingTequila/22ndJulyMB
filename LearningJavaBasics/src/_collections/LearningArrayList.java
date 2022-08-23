package _collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LearningArrayList {

	public static void main(String[] args) {

             ArrayList<Integer> list = new ArrayList<>(); 
             list.add(12);
             list.add(45);
             list.add(100);
             list.add(35);
             list.add(45);
             
             
             System.out.println("=======FOR LOOP RESULT====================");
             for(int i=0; i <list.size(); i++)
             {
            	 System.out.println(list.get(i));
             }
             
             System.out.println("=======WHILE LOOP RESULT====================");
             int i=0;
             while( i <list.size())
             {
            	 System.out.println(list.get(i));
            	 i++;
             }
             
             System.out.println("=======ADVANCED FOR LOOP RESULT====================");
             
             for(int lst :list )
             {
            	 System.out.println(lst);
             }
             
             
             System.out.println("=======ITERATOR LOOP RESULT====================");
             Iterator<Integer> it =list.iterator();
             
             while(it.hasNext())
             {
            	 System.out.println(it.next());
             }
             
             
         
           
             
             
            
             
             

	}

}
