import java.util.ArrayList;
public class ToyRunner
{
	public static void main(String[]args)
	{
		ArrayList<Toy>ToyList = new ArrayList<Toy>();
		
		ToyList.add(new Car("Honda"));
		ToyList.add(new AFigure("Superwoman"));
		ToyList.add(new Car("Ferrari"));
		ToyList.add(new AFigure("Wonder Woman"));
		
		for(Toy object : ToyList)
		{
			System.out.println(object);
		}
	}
}

