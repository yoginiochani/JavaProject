package JavaProject;

public class exception
{
	int a = 5;
	int b=0;
	void display()
	{
		try
		{
			b = a/0;  //ArithmeticException
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	   int z[] = new int[4];
		try
		{
			z[5] = 34; //ArrayIndexOutOfBondsException
		}
		catch(Exception ee)
		{
			System.out.println("The exception is " +ee);
		}
	    finally
	    {
	    	System.out.println();
	    	System.out.println("catch block is executed");
	    }
		String str = "hello";
		try
		{
		int num = Integer.parseInt(str); //NumberFormatException
		}
		catch (Exception eee)
		{
			System.out.println("The exception is " +eee);
			
		}
		
		String names[] = {"Navya", "Binita", "Yogita", "Charu"};
		try
		{
			System.out.println(names[8]);
		}
		catch(Exception f)
		{   System.out.println("---------------------------------");
			System.out.println("To String  " +f.toString());
			System.out.println("Get Message  " +f.getMessage());
			System.out.println("Get Cause  " +f.getCause());
		}
		for(int i = 0; i< names.length; i++)
		{
			System.out.println(names[i]);
		}
	}
	
	

public static void main(String arg[])
{
	exception ex = new exception();
	ex.display();
}
}