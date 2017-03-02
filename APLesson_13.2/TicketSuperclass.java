import java.lang.Math.*;
import java.util.ArrayList;
public abstract class TicketSuperclass
{
	private int SerialNo;
	
	public TicketSuperclass()
	{
		SerialNo = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public abstract double getPrice();
	
	public int getSerialNo()
	{
		return SerialNo;
	}
	
	public String toString()
	{
		return "Serial Number: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}