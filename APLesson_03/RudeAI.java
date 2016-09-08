import java.util.Scanner; //immport Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name?");
		String name = keyboard.next();
		
		//print the results...
		System.out.println(name + "?!!! Why would anyone name a baby that? How old are you, " + name + "?");
		
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println("Oooooo!!! " + age + " is getting up there. What do you do for fun, " + name + "?");
		
		System.out.println("What do you do for fun?");
		String fun = keyboard.next();
		System.out.println ("I though only nerds like to " + fun + "?");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println("Booooo!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + "?" + " Wow, I hope the rest of your family is better looking.");
		
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.next();
		System.out.println("I think you have to be smarter to be a " + job + ".");
		System.out.println("So" + name + "you're " + age + "...");
		System.out.println("You like to " + fun + "and listen to " + music + "...");
		System.out.println("Good luck becoming a " + job + ".");
		System.out.println("I'm only kiddin' " + name + ".");
		
		
		
		
	}
}