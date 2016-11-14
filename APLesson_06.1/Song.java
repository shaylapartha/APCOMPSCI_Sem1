public class Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String lyric, int howMany)
	{
		for(int i = 1; i <= howMany; i++)
			System.out.print(lyric + " ");
			System.out.print("\n");
	}
}