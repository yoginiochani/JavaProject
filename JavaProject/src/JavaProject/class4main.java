package JavaProject;

public class class4main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class3 obj = new class3();  //created object of class3 and now using this object to assign the values to all the 
		                                  //variables from all the classes. 
		obj.a = 45;
		obj.b = 15;
		obj.c = 56; 
		obj.sample1(); //called methods of all the classes using class3 object. 
		obj.sample2();   //this is called multilevel inheritence. 
		obj.sample3();
		
		System.out.println("Now using class2 object to call super class method");
		class2 obj2 = new class2();
		obj2.a=6587;
		obj2.sample1();
		
	}

}
/*
 * Multilevel Inheritence. Three classes, A, B, C. classB have access to all the variables and methods of class A and ClassB
 *                                                 classC have access to all the variables and methods of class A, ClassB and class C.
 *                                                 
 */
