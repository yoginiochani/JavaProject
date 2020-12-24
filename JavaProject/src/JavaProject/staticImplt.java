package JavaProject;

public class staticImplt 
{
	static int a, z;
	int b;
	public static void staticmethod(int aa)
	{
		a = aa;
		System.out.println("Printing static variable which is " +a);
		System.out.println("Printing static variable which is " +z);
	}
	
	public void nonstatic(double bb, int a3)   //non static method
	{   double cc;
	    cc = bb;
	    a = a3;
		System.out.println("Printing non-static variable which is " +cc);
		System.out.println("Printing static variable which is " +a);
	}


public static void main(String[] args)
{
	staticImplt x = new staticImplt();  //object x is created.
	x.z= 99;  //assigning value to static variable z;
	x.nonstatic(52.56, 89);   //  method nonstatic is being called using object x. object x has access to static and non static varialbe
	staticImplt.staticmethod(5); //static variable and static method are called using classname and objects.
	                               //changing the value of static variable applys to all methods or objects which are using static variable
	                                //changes to non static variable is only applicable to local object, not the entire code
	
}
}

