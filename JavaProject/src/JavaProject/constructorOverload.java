package JavaProject;

public class constructorOverload {
	double length;
	double width;
	double height;
	double vol;
	
	
	constructorOverload()
	{
		double AreaRect;
		length = 45.5;
		width = 452.2;
		AreaRect= length * width;
		System.out.println("The area of rectangle is " +AreaRect);
		
	}
	constructorOverload(double length1, double width1)
	{
		height =  length1 + width1;
		System.out.println("The height is " +height);
	}
	
	public double volume(double v, double w, double h)
	{
		length = v;
		width = w;
		height =h;
		return length * width * height;
	}
	

}
