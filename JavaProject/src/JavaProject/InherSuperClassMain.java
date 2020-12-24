package JavaProject;

public class InherSuperClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          inherClassB clasb = new inherClassB();
          clasb.A = 45;   //assigning value to variables from super class using subclass object
          clasb.B = 88;   //assigning value to variable from super class using subclass object
          clasb.multiplication();  //calling method from super class using subclass object
          
          clasb.inherSuperClass(100);  //calling constructor of super class using object of sub class
          
          clasb.staticmethod(6);   //calling static method of super class using object of sub class
          
         System.out.println();
          System.out.println("next line of output is using classname to call static method");
          inherSuperClass.staticmethod(89); //calling static method using classname
          System.out.println("--------------------------");
          
          InherClassC clasc = new InherClassC(); //created object of the sub class
          clasc.A = 50;   //assigning value to super class object : class is inherSuperClass
          clasc.B = 20;   //assigning value to super class object : class is inherSuperClass
          clasc.E = 26.4;  //assigning value to variable in sub class
          clasc.F = 58.45;
          clasc.multiplication();  //calling method in supper class using subclass object
          clasc.subtraction();    //calling method of sub class
          clasc.inherSuperClass(784);
          
          
          
          
	}

}
