package JavaProject;

public class constructorOverloadMain {

	public static void main(String[] args) {
		constructorOverload cons = new constructorOverload();
		
		constructorOverload cons1 = new constructorOverload(2.2, 12.0);	
		double  volanswer;
		volanswer = cons.volume(2.0,3.0,2.0);
		 System.out.println("volume is " + volanswer);

	}
	
}
