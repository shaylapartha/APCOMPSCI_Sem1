import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Paint color?: ");
		String p = kb.next();
		System.out.print("Interior?: ");
		String i = kb.next();
		System.out.print("Engine?: ");
		String e = kb.next();
		System.out.print("Tires?: ");
		String t = kb.next();
		
		CarClass object = new CarClass(p, i, e, t);
		
		System.out.println("Your vehicle is ready... \n Paint: " + object.getPaint() + "\n Interior: " +  object.getInterior() + "\n Engine: " + object.getEngine() + "\n Tires: " + object.getTires() + "\n");

		object.setCustom("blue", "brown", "5 litre", "priellis");
		
		System.out.println("Your vehicle is ready... \n Paint: " + object.getPaint() + "\n Interior: " +  object.getInterior() + "\n Engine: " + object.getEngine() + "\n Tires: " + object.getTires() + "\n");
		
	}
}