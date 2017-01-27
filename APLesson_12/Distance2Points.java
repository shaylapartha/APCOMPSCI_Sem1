import java.lang.Math.*;
public class Distance2Points
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance2Points()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0.0;
	}
	
	public Distance2Points(int xUno, int yUno, int xDos, int yDos)
	{
		xOne = xUno;
		yOne = yUno;
		xTwo = xDos;
		yTwo = yDos;
		distance = 0.0;
	}
	
	public void setValues(int xUno, int yUno, int xDos, int yDos)
	{
		xOne = xUno;
		yOne = yUno;
		xTwo = xDos;
		yTwo = yDos;
		distance = 0.0;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
	
	public int getxOne()
	{
		return xOne;
	}
	
	public int getyOne()
	{
		return yOne;
	}
	
	public int getxTwo()
	{
		return xTwo;
	}
	
	public int getyTwo()
	{
		return yTwo;
	}
}