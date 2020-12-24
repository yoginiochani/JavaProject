package JavaProject;

public class studentdemo {
String name,grade,school;  //global variables
double marks1, marks2;   //globak variables

studentdemo()
{
	name = "Vedika";
	grade = "5th Grade";
	school = "Martin Luther King Jr";
}

studentdemo(String name2, String grade2, String schl)
{
	name = name2;
	grade = grade2;
    school = schl;	
}
public void displaymarks()
{
	marks1 = 95.0;
	System.out.println("The name of the student is "+name);
	System.out.println("She goes to school named " +school);
	System.out.println(name+ " is in "+grade+ " .");
	System.out.println("The marks she/he has received is " +marks1);
	
}

}
