package JavaProject;

import java.util.Scanner;

public class areaOfSquare {

	
	double length;
	double width;
	double area;
	
	public double areaOfSquare(double length) {   //constructor with one parameter and return type;
		width = 50;
		double returnarea;
		returnarea = length *width;
		//System.out.println("The area of square is:" +returnarea);
		return returnarea;
		
	}

	
	public double areaOfSquare(double length1, double width1) //passing two parameter in constructor method and returning answer.
	{
		double returnarea1;
		returnarea1 = length1 * width1;
		return returnarea1;
	}
	public double areaOfSquare() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner class object
	    System.out.println("Enter the length of square");  //user enters the first number
	    double length = myObj.nextDouble();
	    System.out.println("Enter the width of square");
	    double width = myObj.nextDouble();
	    double area;
	    area = length * width;
	    return area;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          areaOfSquare aofs = new areaOfSquare();
          double areaans;
          areaans = aofs.areaOfSquare(6.5);  //constructor with one parameter and return type double
          double area1;
          area1 = aofs.areaOfSquare();  //constructor with no parameter and return type double
          System.out.println("The area of square using two user input is: " +area1);
          System.out.println("The area of square is: " +areaans);
          areaans = aofs.areaOfSquare(15.2, 12.5);  //constructor with two double parameter and double return type
           System.out.println("The area of square using two parameter in constructor method is: " +areaans);
	}
	

}
