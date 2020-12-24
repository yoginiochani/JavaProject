package JavaProject;

public class studentdemomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdemo a = new studentdemo();  //this line calls the studentdemo constructor in other class and collects the values
		                                     //assigned to variables.
		a.displaymarks();
		
		studentdemo a1 = new studentdemo("Janak", "8th grade", "Academy One"); //this constructor is passing 3 parameters
		a1.displaymarks();
		
	}

}
