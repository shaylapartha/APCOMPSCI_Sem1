public class GameSystemClass
{
	private String platform;
	private int SerialNo;
	
	public GameSystemClass()
	{
		this.platform = "";
		this.SerialNo = 1234567;
	}
	
	public GameSystemClass(String p)
	{
		this.platform = p;
		this.SerialNo = 1234567;
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