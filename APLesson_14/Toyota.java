import java.lang.Math.*;
import java.util.ArrayList;
public class Toyota implements Location
{
	private double[] location = new double[2];
	private int ID;
	
	public Toyota()
	{
		location[0] = 0;
		location[1] = 0;
	}
	
	public Toyota(String hello)
	{
		String[] points = hello.split(", ");
		this.location[0] = Double.parseDouble(points[0]);
		this.location[1] = Double.parseDouble(points[1]);
	}
	
	public double getID()
	{
		ID = (int)(Math.random()*90000) + 100000;
		return ID;
	}
	
	public void move(double x1, double y1)
	{
		location[0] += x1;
		location[1] += y1;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}

