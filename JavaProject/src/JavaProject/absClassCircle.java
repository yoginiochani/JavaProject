package JavaProject;

import java.util.Scanner;

public class absClassCircle extends absClass {

	double r;
	Scanner rr = new Scanner(System.in);  // Create a Scanner class object to get input from user
	
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("The area of circle is " +3.14*r*r);
		System.out.println();
		
		System.out.println("Enter the radius to calculate the are of circle");//user enters the first number
		double radius = rr.nextDouble();  //value entered by user is stored in radius variable;
		System.out.println("The area of circle is" + 3.14*radius*radius);
		
	}
	

}
