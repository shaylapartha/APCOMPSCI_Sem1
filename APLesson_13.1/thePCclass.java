public class thePCclass extends GameSystemClass
{
	private String controller;
	
	public thePCclass()
	{
		super();
	}
	
	public thePCclass(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String getPlatform()
	{
		return "Platform: " + getPlatform() + "\nSerial Number: " + getSerialNo() + "\nSystem Input: " + systemInput() + "\n";
	}
}