package JavaProject;

import java.util.Scanner;

public class inheritencemanager {   //this is super class

	String mname = "Yogini";
	int id=13;
	String department = "IT department";
	
	public void employee()
	{
		System.out.println("The name of the manager is "+ mname);
		System.out.println("The id of the manager is "+id);
		System.out.println("The department is  "+department);
	}
	public void salary()
	{
		Scanner s = new Scanner(System.in);  // Create a Scanner class object
	    System.out.println("Enter the salary of the " + mname);  //user enters the first number
	    double slry = s.nextDouble();
	    System.out.println("The salary of "+mname +" is " +slry);
	    
	}
	
}
