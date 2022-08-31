package _17LearningStatic;

public class ExecutingStatic {

	public static void main(String[] args) {

         StaticConcept.a=10;
         StaticConcept.name="";
         
         
         
         
         
         StaticConcept sc1 = new StaticConcept();
         sc1.a=20;
                  
         StaticConcept sc2 = new StaticConcept();
         sc2.a=30;
         
         StaticConcept sc3 = new StaticConcept();
         sc3.a=1500;
         System.out.println(sc1.a);
         System.out.println(sc2.a);
         
         // If something is used very frequently without making changes into it, make that thing static

	}

}
