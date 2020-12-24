package JavaProject;

public class stringFunctions
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String homework = "Kids have lots of homework to complete today.";
		int count = homework.length();
		System.out.println("The totl length of the string is " +count +" character long");
		
		int first = homework.indexOf('h');
		System.out.println("The first character h is located in position " + first+".");
		
		int last = homework.lastIndexOf('h');
		System.out.println("The first character h is located in position " + last+".");
		
		String middletoend = homework.substring(10);
		System.out.println("The string is printing from charater position 10 which is:   " +middletoend);
		
		String betweentwo = homework.substring(2,15);
		System.out.println("The string is printing from between two charaters position:   " +betweentwo);
		
		String fname = "Yogini";
		String lname = " Patel Ochani";
		String combined;
		combined = fname.concat(lname);
		System.out.println(combined);
		System.out.println(fname.equals(lname)); //this line prints if the two strings are equal(characters in string) or not and return true or false output
		System.out.println();  
		
		System.out.println(fname.contentEquals(lname));
		System.out.println(fname.compareTo(lname));
		if(fname.compareTo(lname)<0) //this lines compares each char of two strings and tells which string comes first alphabetically.
		{
			System.out.println("String 1 comes before second string."); 
		}
		else
			System.out.println("String 1 comes after second string."); //Y comes after P, so it will print this line
		
		System.out.println("----------------------");
		if("welcome world".startsWith("come"))  //this if statement checks if the string "welcome world starts with "come"
				{
				System.out.println("true"); //
				}
		else
			{
			System.out.println("False"); //false will print because it doesn't start with "come"
			}
		
		
		if("I am done with study".endsWith("study"))
			{
			System.out.println("I am ending with word study.");
			}
			else
			{
			System.out.println("I am not ending with the word study");
			}
		
		String sentence = "learning string function is very pasy";
		String newsentence, newsentence2;
		newsentence= sentence.replace('p', 'e');
		System.out.println(newsentence);
		newsentence2 = sentence.replaceAll("pasy", "hard");
		System.out.println(newsentence2);
		
	}
}


