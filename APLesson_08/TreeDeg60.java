import java.util.Scanner;
public class TreeDeg60
{
	static String word;
	static int stop;
	static int start = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		word = kb.next();
		stop = word.length();
		
		tree(word, 0, word.length());
	}
	public static void tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%20s\n", word.substring(0, start));
			start ++;
			tree(word, start, stop);
		}
	}
}