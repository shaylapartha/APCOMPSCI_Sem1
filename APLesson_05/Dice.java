import java.util.Random;
public class Dice
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int yourRoll = rand.nextInt(6)+1;
		int compRoll = rand.nextInt(6)+1;
		System.out.println("You rolled a " + yourRoll);
		System.out.println("Computer rolled a " + compRoll);
	

		
		if(yourRoll > compRoll)
		{
			System.out.println("The winner is you!");
		}
		
		if(compRoll > yourRoll)
		{
			System.out.println("Sorry, the winner is the computer.");
		}
	}
	
	public static boolean rollDice(int yourRoll, int compRoll)
	{
		return yourRoll > compRoll;
	}
}
