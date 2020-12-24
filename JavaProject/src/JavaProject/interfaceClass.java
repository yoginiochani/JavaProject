package JavaProject;

public class interfaceClass implements interfaceOne, interfaceTwo //two interfaces are implemented in class.
{   //implements keyword is used to add interfaceOne 

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
           interfaceClass i = new interfaceClass(); //class object is created to call methods of interface.
           i.add(100, 500);  //two parameters in passed into this method
           i.sub();  //
           i.divide1(100.0,50.0);
        
	}

	@Override
	public void add(double aa, double bb)
		{  //here, method add is implemented
			System.out.println("The addition of two numbers are " + (aa+bb));
		}

	@Override
		public void divide1(double n1, double n2) //divide1method from second interface is implemented here
		{
			System.out.println("The division of two nubers are " + (n1/n2));
		
		}
}
