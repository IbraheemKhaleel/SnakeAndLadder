package snakeAndLadder;

import java.util.Random;

public class OptionCheckUC3 
{
	public static final int NOPLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int diceRoll = rand.nextInt(6) + 1;
		int options = rand.nextInt(3);
		int position = 0 ;
		int[] board = new int[101];
		for( int index = 0 ; index<board.length ; index++ )
		{
			board[index] = index ;
		}
		if ( options == LADDER )
		{
			position = position + diceRoll ;
		}
		else if ( options == SNAKE )
		{
			position = position - diceRoll ;
		}
		else
		{
			position += 0 ;
		}	
	}
}
