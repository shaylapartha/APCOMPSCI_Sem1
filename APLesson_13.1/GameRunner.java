public class GameRunner
{
	public static void main(String[]args)
	{
		Xbox x = new Xbox("madden");
		System.out.println(x);
		
		PlayStation play = new PlayStation("ps4");
		System.out.println(play);
		
		thePCclass pc = new thePCclass("wizards");
		System.out.println(pc);
	}
}