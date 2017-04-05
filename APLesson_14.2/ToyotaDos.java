import java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;
public class ToyotaDos extends CarDos
{
	private double x2, y2;
	
	public ToyotaDos(String hello)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(hello.split(", ")));
		Double hello1 = Double.parseDouble(position.get(0));
		Double hello2 = Double.parseDouble(position.get(1));
		move(hello1, hello2);
	}
}