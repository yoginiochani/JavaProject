package JavaProject;

public class twodimarray {

	public static void main(String[] args) {
		int twoarray[][] = new int[3][2];
		int p = 5; 
		int total = 0;
		for(int i =0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{			
				twoarray[i][j]=p;
				p--;
				System.out.println(twoarray[i][j]);
				total = total + twoarray[i][j];
				System.out.println(total);
			}
		}
		
		int multi[][] = new int[5][11];
		for(int x = 1; x<=3; x++)
		{
			for(int y = 1; y<11; y++)
			{
				multi[x][y]= x*y;
				System.out.println( x+ "x" +y +" = "+ multi[x][y]); 
			}
			
		}
		

	}

}
