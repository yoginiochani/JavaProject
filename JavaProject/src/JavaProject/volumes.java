package JavaProject;

import java.util.Scanner;

public class volumes {
    double  volumeans;    //volume of sphere is v = 4/3 * pi *r^3
    
	public void volumes() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner class object
	    System.out.println("Enter the radius please:");  //user enters the first number
	    double radius = myObj.nextDouble();  //this line is to enter the digit in output
		volumeans = ((1.3)*(3.14)* (radius * radius * radius));
		System.out.println("The volume of sphere is: " +volumeans);
		
	}
	
	//volume of cylinder is v = pi(3.14) *r^2 *h
	
	public void cylindervo(double pi)
	{    
		Scanner rad = new Scanner(System.in);
		System.out.println("Enter the radius to calcualte volume of cylinder:");
		double radius = rad.nextDouble();
		System.out.println("Enter the height to calcuate volume of cylinder");
		double height = rad.nextDouble();
		double vcyl;
		vcyl = pi* (radius*radius)*height;
		System.out.println("The volume of cylinder is " +vcyl);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double vlm;
		volumes vol = new volumes();
		vol.volumes();
		volumes cyl1 = new volumes();
		cyl1.cylindervo(3.14);
		

	}

}
