package JavaProject;

public interface interfaceOne {
    
	double c = 45.5, d = 89.5;
	void add(double a, double b); //method is create here and implemented in another class called interfaceClass.
	
	default void sub()  //default word is used to create local method for interface.
	{
		System.out.println("The subtraction of two numbers is " + (c-d));
	}

}
