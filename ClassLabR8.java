package sandBox;

import java.util.Random;

public class ClassLabR8 {

	public static void main(String[] args)
	{
		 int a[] = new int[10];
		 
		   Random r = new Random();
		   
		   for(int i = 0; i < a.length; i++)
		   {

		       a[i] = r.nextInt(100)+1;
		   }
	}
}
