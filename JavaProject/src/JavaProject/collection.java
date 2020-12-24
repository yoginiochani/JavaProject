package JavaProject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class collection 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet <Double> demo = new HashSet<Double>();
		demo.add(45.25);
		demo.add(85.12);
		demo.add(65.1);
		demo.add(01.2125);
		demo.add(69.36);
		
		Iterator <Double> i =demo.iterator();
				while (i.hasNext())
				{
					System.out.println(i.next());
				}
		
	LinkedHashSet <String> strng = new LinkedHashSet<String>();
	strng.add("one");
	strng.add("two");
	strng.add("three");
	strng.add("four");
	strng.add("four");
	
	Iterator <String> obj = strng.iterator();
	while(obj.hasNext())
	{
		System.out.println(obj.next());
		
	}
	
	SortedSet <String> fruits= new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
	fruits.add("banana");
	fruits.add("apple");
	fruits.add("orange");
	fruits.add("cherry");
	
	System.out.println("Fruits sets:" +fruits); //printing fruits set in one line like array.
	System.out.println();
	
	Iterator <String> obj2 = fruits.iterator(); //printing fruits using while loop
	while(obj2.hasNext())
	{
	System.out.println(obj2.next());
	}
	
	
	ArrayList <String> color = new ArrayList();
	color.add("red");
	color.add("yellow");
	color.add("brown");
	color.add("green");
	color.add("45654");
	
	Iterator<String> printcolor = color.iterator();
	while(printcolor.hasNext())
	System.out.println("The color is: " + printcolor.next());
	
	}
}

	


