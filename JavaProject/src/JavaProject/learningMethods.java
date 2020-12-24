package JavaProject;

public class learningMethods {
	int x, y, z;  //global variables
	public static void main(String[] args) 
	{
		learningMethods a = new learningMethods(); //created object of the class in main method
		a.x = 20;  //assigning value to x and y using object
		a.y = 23;  //this x,and y can be used in any method
		a.add(); //calling method using object a
		a.sub(433); //calling method using object with one parameter
		double r; //local variable
		r = a.multi(); //calling multi method using object
		System.out.println("multipying x and y and the result is " +r);
	}
	public void sub(int i) //i = 433
	{
		double h = 100.0; //created local variable within method
		double k; //local variable
		k = h +i; //100 + 433
		z = x -i;  //20-433  which is -413
		System.out.println(z);
		System.out.println(k);
	}
	public void add()
	{
		z = x+y;  //20 + 23
		System.out.println("printing the addition of z " +z);	
	}
	public double multi()
	{
		double c = x *y;
		return c;
	}
	
	


}
