package JavaProject;

/*not able to write code for assending number in order
 * 
 */
public class assendingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int assendarray[] = {85,8,4,9,10,14,11,2,55};
 
 for(int i = 0; i < assendarray.length; i++)
 {
	 for(int j =0; i< assendarray.length; i++)
	 {
		 if(assendarray[i]<assendarray[j+1])
			
			 assendarray[j+1] = assendarray[i];
	 }
	 
	 System.out.println(assendarray[i]);
	 
 }
 
 
}
}
