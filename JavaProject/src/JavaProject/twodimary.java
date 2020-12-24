package JavaProject;

import java.util.Scanner;

public class twodimary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multi[][]= new int[5][3];
		Scanner s = new Scanner(System.in);  // Create a Scanner class object
		int total = 0;
		for(int i = 0; i <5; i++)
		{
			for(int j = 0; j<3; j++)
			{ 
				multi[i][j]= s.nextInt();
				System.out.println("multi[" +i +"]["+j+"]"+"="+ multi[i][j]);
				total = total + multi[i][j];
			}
			System.out.println("total of first row is " +total);
			total = 0;
			
		}
		
		

	}

}
