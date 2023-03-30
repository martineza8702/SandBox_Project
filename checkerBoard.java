package sandBox;


public class checkerBoard {
	
	 public static void main(String[] args)
	 {
		 String [][] board = new String[8][8];
		 
		 for(int i = 0; i < board.length; i++)
		 {
			 for (int k = 0; k < board[i].length; k++)
			 {
				 board[i][k] = "No piece";
			 }
		 }
		 for(int i = 0; i < board.length; i++)
		 {
			 for(int k = 0; k < board[i].length; k++)
			 {
				System.out.println(board[i][k] + " at " + i + "," + k);
			 }
		 }
	 }
	 
}
	 
	