package sandBox;

import java.util.Random;

public class ClasslabR9 {
	
	public static void main(String[] args)
	
	{
	   int a[] = new int[10];
	   
	   Random r = new Random();
	   
	   for(int i=0;i<a.length; i++)
	   {
		   
	       a[i] = r.nextInt(100)+1;
	   }
	   
	   int max = a[0];
	   
	   int min = a[0];
	   
	   for(int i=0;i<a.length; i++)
	   {
	       if(max < a[i]) {
	           max = a[i];
	      }
	       if(min > a[i]) {
	           min = a[i];
	       }
	   }
	System.out.println("Max: "+max);
	   System.out.println("Min: "+min);
	}
	}


