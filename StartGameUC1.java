package snakeAndLadder;

public class StartGameUC1 
{
	public static void main(String[] args) 
	{
		int position = 0 ;
		int[] board = new int[101];
		for( int index = 0 ; index<board.length ; index++ )
		{
			board[index] = index ;
		}
	}
}
