package JavaProject;
import java.util.Scanner;

public class whileloopwork {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);  // Create a Scanner class object
	    System.out.println("Enter first number");  //user enters the first number
	    String numberone = myObj.nextLine(); // Read user input
	    System.out.println("Enter second number"); //user enters the second number
	    String numbertwo = myObj.nextLine(); 
	    System.out.println("numberone is: " + numberone);
	    System.out.println("numbertwo is: " + numbertwo); 
	    String swap = null;
	    swap = numberone;   //numbers are being swapped here
	    numberone= numbertwo;
	    numbertwo = swap;
	    System.out.println("After the swap:");
	    System.out.println("Now, the numberone is " +numberone);
	    System.out.println("Now, the numbertwo is " +numbertwo);
	    System.out.println();
	    
	    System.out.println("while loop is being used here to findthe factorial of a number");
		
		int a = 7;
		int b;
		int c = 1;
		while(a>0)
		{
			c = c*a;
			System.out.println(c);
			a--;
		}
		System.out.println("the factorial of a is " +c);
		
		Scanner newobject = new Scanner(System.in);  // Create a Scanner class object
	    System.out.println("Enter the number to see if it's even or odd number.");  //user enters the first number
	    String  firstnum= newobject.nextLine(); // Read user input
	    String secondnum = newobject.nextLine();
	    
	    int j = Integer.parseInt(firstnum);
	    
	    if(j%2 == 0)
	    {
	    	System.out.println("The number " +j + " is even number");
	    }
	    else {
	    	System.out.println("The number "+j+" is odd number");
	    }
	    
	    System.out.println();
	    System.out.println("Multiplication table of 5");
	    int aa = 5;
	    int bb = 1;
	    int cc = 0;
	    while(bb<=10)
	    {
	    	cc = aa *bb;
	    	System.out.println(aa +" * " +bb + "=" +cc);
	        bb++;
	    }   
	    	
	    
	    
	    
	    	
	}

}
