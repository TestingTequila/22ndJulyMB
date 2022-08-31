package _16LearningConstructors;

public class ExecutingConstructors {

	public static void main(String[] args) {

		/*
		 * _1ConstructorsConcept cc = new _1ConstructorsConcept();
		 * System.out.println(cc.a); // 0 System.out.println(cc.b); // 0
		 * System.out.println(cc.name); // null System.out.println(cc.check); // false
		 * 
		 * int sum = cc.a + cc.b;
		 * 
		 * int diff = cc.a - cc.b;
		 * 
		 * System.out.println("Addition :" + sum);
		 * 
		 * System.out.println("Subtraction:" + diff);
		 */

		CalculateVolume a = new CalculateVolume();
		a.calculateVolumeOfBoxes();
		
		
		CalculateVolume b = new CalculateVolume();
		b.calculateVolumeOfBoxes();
		
		CalculateVolume c = new CalculateVolume();
		c.calculateVolumeOfBoxes();
		
		
		CalculateVolume d = new CalculateVolume(3,4,5);
		
		// ParentClass aliasName = new ChildClass();
		// ClassName aliasName = new ClassName(parameters);
		
		
		
		

	}

}
