import java.lang.Math.*;
import java.util.ArrayList;
public class GMC implements Location
{
	private double x, y;
	private int ID;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public double getID()
	{
		ID = (int)(Math.random()*90000) + 100000;
		return ID;
	}
	
	public void move(double x2, double y2)
	{
		x += x2;
		y += y2;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}