package sandBox;

public class sandBox { 
	 public static void main(String[] args) 
	 {  
		 int[] a;
		 a = new int [1000];  
		 a[0] = 0;
		 
	 for (int i = 0; i < a.length; i++) 
	 {           
		 a[i] = i + 1;
		 
		 System.out.println(a[i]); 
		 }  
	 char[] b; 
	 
	 b = new char [1000]; 
	 
	 b[0] = '!'; 
	 
	 for (int i = 0; i < b.length; i++) 
		 
	 {             
		 b[i] = (char) (i + 1);
		 
	 System.out.println(b[i]);
	 } 
	 }  
	}


