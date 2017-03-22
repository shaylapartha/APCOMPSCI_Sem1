import java.lang.Math.*;
import java.util.ArrayList;
public class Honda implements Location
{
	private double[] location = new double[2];
	private int ID;
	
	public Honda()
	{
		location = new double[2];
	}
	
	public Honda(double[] loc)
	{
		location = loc;
	}
	
	public double getID()
	{
		ID = (int)(Math.random()*90000) + 100000;
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] = x;
		location[1] = y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}