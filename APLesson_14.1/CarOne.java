public abstract class CarOne implements LocationOne
{
	public double[] location;
	private int ID;
	
	public CarOne()
	{
		ID = (int)(Math.random() * 1000000) + 1;
		location = new double[2];
	}
	
	public abstract void move(double x, double y);
	
	public double getID()
	{
		return ID;
	}
}
