package sandBox;

public class ClasslabR10 {
	
	public static void main(String[] args)
	{
		
	
	
	a. int[] values = new int[10];
	for (int i = 1; i <= 10; i++)
	{
	 values[i] = i * i;
	}
	
/*For above code since you have allocated 10 elements 
 * memory elements will start at indexing 0 not 1 so 
 * you will be accessing value[10] with above code 
 * which is invalid.
 */

		
	b. int[] values;
	for (int i = 0; i < values.length; i++)
	{
	 values[i] = i * i;
	 
	 
	}
	
	/*With the above code the problem is you haven't 
	 * initialize the the variable value. Due to which 
	 * when you will access it you will get the error 
	 * saying please initialize value variable.
	 */
	
	}

}
