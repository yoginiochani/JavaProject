package JavaProject;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  // Create a Scanner class object
	    System.out.println("Enter the length of array:");  //user enters the first number
	    int j = s.nextInt();  //this line is to enter the digit in output		
	    int c[]=new int[j]; //array c[] is created and length of it entered as j value.
	    
	    for(int i =0; i<c.length; i++)
	    {    System.out.println("Enter the value");
	    	c[i] = s.nextInt();// get the digit entered by user and store it in array c[] until the array length is reached
	   
	    }
	    for(int k = 0; k < c.length; k++)//this for loop is to print the value of array of c[]
	    {
	    System.out.println("The user has entered the length of array:" +c[k]); //values of array c[] is being printed here
	    }
	    
		double secndaray[] = new double[5]; //array with length
		secndaray[0] = 15.2;  ; //assigning value to each array variable
		secndaray[1] = 2.2;
		secndaray[2] = 3.3;
		secndaray[3]= 2.89;
		secndaray[4]= 9.8;
		for(int i =0; i<secndaray.length; i++)  //printing the array secndaray[]
		{
			System.out.println(secndaray[i]);
		}
		
	}

}
