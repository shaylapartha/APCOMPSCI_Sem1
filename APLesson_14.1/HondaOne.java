import java.lang.Math.*;
import java.util.ArrayList;
public class HondaOne extends CarOne
{
	private double x2, y2;
	
	public HondaOne(double[] hello)
	{
		super();
		move(hello[0], hello[1]);
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