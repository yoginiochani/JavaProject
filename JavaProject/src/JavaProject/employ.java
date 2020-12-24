package JavaProject;

public class employ extends inheritencemanager {  //employ class is sub class which is inheriting all the property of super class manager.

	public void rate(double hourly)   //created method in sub class
	{
		System.out.println("The hourly rate of " +mname + " is " + hourly +" per hour");
	}
	
	public static void main(String[] args) {
		
		employ emp = new employ();  //object of this class is created
		emp.employee(); //employee method is called using object of this class
		emp.rate(50.0);
		emp.salary();    //salary method is called using object of this class

	}

}
