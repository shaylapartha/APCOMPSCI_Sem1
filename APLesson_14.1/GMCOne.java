import java.lang.Math.*;
import java.util.ArrayList;
public class GMCOne extends CarOne
{
	private double x2, y2;
	
	public GMCOne(double x, double y)
	{
		super();
		move(x, y);
	}
	
	public void move(double x, double y)
	{
		this.x2 += x;
		this.y2 += y;
	}
	
	public double[] getLoc()
	{
		double[] location = {x2, y2};
		return location;
	}
}