package snakeAndLadder;

import java.util.Random;

public class MultiplayerUC7
{
	public static final int NOPLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;
	public static final int WIN = 100 ;
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int position = 0 ;
		int position2 = 0 ;
		int count = 0 ;
		int[] board = new int[101];
		for( int index = 0 ; index<board.length ; index++ )
		{
			board[index] = index ;
		}
		while ( position < 100 && position >= 0  && position2 < 100 && position2 >=0)
		{
			int diceRollPlayer1 = rand.nextInt(6) + 1;
			int diceRollPlayer2 = rand.nextInt(6) + 1;
			int options = rand.nextInt(3);
			count++ ;
			if ( options == LADDER )
			{
				position = position + diceRollPlayer1 ;
				position2 = position2 + diceRollPlayer2 ;
				if ( position > 100 )
				{
					position = position - diceRollPlayer1 ;
				}
				if ( position2 > 100 )
				{
					position2 = position2 - diceRollPlayer2 ;
				}
			}
			else if ( options == SNAKE )
			{
				position = position - diceRollPlayer1 ;
				position2 = position2 - diceRollPlayer2 ;
				if ( position < 0 )
				{
					position = 0 ;
				}
				if ( position2 < 0 )
				{
					position2 = 0 ;
				}
			}
			else
			{
				position += 0 ;
				position2 += 0 ;
			}
			System.out.println(" position of first player is " + position);
			System.out.println(" position of second player is " + position2);
		}
		if ( position == WIN )
		{
			System.out.println(" First player won ");
		}
		else if ( position2 == WIN )
		{
			System.out.println(" Second Player won ");
		}
		System.out.println(" number of times both player rolled dice is " + count);
	}
}
