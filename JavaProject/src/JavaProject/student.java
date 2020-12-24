package JavaProject;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st = new student(); //object created
		st.display();
		double avemark;
		avemark = st.ave(30,20, 24);
		System.out.println("average mark is " +avemark);
		st.extracurri();
		st.books();

	}
	public void display()
	{
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner class object
	    System.out.println("Enter your name");  //user enters the first number
	    String name = myObj.nextLine(); 
		System.out.println("The name of the student is "+name);
		System.out.println("Enter your room number");
		int room = myObj.nextInt();
		System.out.println("The room number of student is " +room);		
	}
	public double ave(int p, int q, int r)
	{
	  double result;
	  result = (p+q+r)/3;
	  return result;
	}
	public void extracurri()
	{
		@SuppressWarnings("resource")
		Scanner myact= new Scanner(System.in);
		System.out.println("Enter your activites separated by commas");
		String myactname = myact.nextLine();
	
		System.out.println("My extra activities are " + myactname);
	}
@SuppressWarnings("resource")
public void books()
{
	Scanner books= new Scanner(System.in);
	System.out.println("Enter the names of the books you like ");
	String booksname = books.nextLine();

	System.out.println("I like to read books");
	System.out.println("I like to read " + booksname);
	
}
}
