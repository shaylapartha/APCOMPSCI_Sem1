public class GameSystemClass
{
	private String platform;
	private int SerialNo;
	
	public GameSystemClass()
	{
		this.platform = "";
		this.SerialNo = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public GameSystemClass(String p)
	{
		this.platform = p;
		this.SerialNo = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return SerialNo;
	}
}