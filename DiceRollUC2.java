package snakeAndLadder;

import java.util.Random;

public class DiceRollUC2
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int diceRoll = rand.nextInt(6) + 1;
		int position = 0 ;
		int[] board = new int[101];
		for( int index = 0 ; index<board.length ; index++ )
		{
			board[index] = index ;
		}
	}
}
