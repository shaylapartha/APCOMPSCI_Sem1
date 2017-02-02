import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Hair color?: ");
		String h = kb.next();
		System.out.print("Eye color?: ");
		String e = kb.next();
		System.out.print("Skin color?: ");
		String s = kb.next();
		
		HumanClass object = new HumanClass(h, e, s);
		
		System.out.println("Your information .... \n Hair: " + object.getHair() + "\n Eyes: " +  object.getEyes() + "\n Skin: " + object.getSkin() + "\n");

		object.setHES("black", "green", "tan");
		
		System.out.println("My information.... \n Hair: " + object.getHair() + "\n Eyes: " +  object.getEyes() + "\n Skin: " + object.getSkin() + "\n");
		
	}
}