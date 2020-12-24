package JavaProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapInterfaceImpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		m.put(12, "Jack");  //key and value are entered in here. key-value pair
		m.put(35,"Ved");
		m.put(5, "Ben");
		m.put(8, "Benny");
		m.put(55, "Benil");
		
		Set s = m.entrySet(); //convert map into set first
		Iterator i = s.iterator(); //now apply set into iterator
		
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey() +"  "+ e.getValue());
			//System.out.println(i.next());
		}

	}

}
