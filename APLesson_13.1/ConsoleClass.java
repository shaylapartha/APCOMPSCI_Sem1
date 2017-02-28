public abstract class ConsoleClass extends GameSystemClass
{
	private String Controller;
	
	public ConsoleClass()
	{
		super();
	}
	
	public ConsoleClass(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial Number: " + getSerialNo() + "\nController: " + getController() + "\n";
	}
}