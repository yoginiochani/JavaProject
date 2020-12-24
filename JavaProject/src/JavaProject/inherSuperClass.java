package JavaProject;

public class inherSuperClass {
	int A;
	int B;
	double multi;
	static int x;
	
	public void multiplication()
	{
		multi = A * B;
		System.out.println("The value of A from inherSuperClass is" + A);
		System.out.println("The value of A from inherSuperClass is" + B);
		System.out.println("Multiplication of A and B is " +multi );
	}
	
	public void inherSuperClass(int a)
	{
		System.out.println("I am calling constructor method from superclass");
		System.out.println("The value of a is " +a);
	}
	public static void staticmethod(int b)
	{   double c; 
		x = 5;
	     c = b *x;
		System.out.println("Printing static value of x, which is " +x);
		System.out.println("Printing multiplication of b =" +b+ " and x = " +x+ " is =  " +c);
	}
	
}
