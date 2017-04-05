import java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;
public class ToyotaOne extends CarOne
{
	private double x2, y2;
	
	public ToyotaOne(String hello)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(hello.split(", ")));
		Double hello1 = Double.parseDouble(position.get(0));
		Double hello2 = Double.parseDouble(position.get(1));
		move(hello1, hello2);
	}
	
	public void move(double x, double y)
	{
		this.x2 += x;
		this.y2 += y;
	}
	
	public double[] getLoc()
	{
		double[] location = {x2,y2};
		return location;
	}
}