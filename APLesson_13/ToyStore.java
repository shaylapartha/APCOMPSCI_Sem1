import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ToyStore
{
	public ArrayList<Toy>ToyList;
	
	public ToyStore()
	{
		ToyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String TS)
	{
		loadToys(TS);
	}
	
	public void loadToys(String TS)
	{
		ToyList = new ArrayList<Toy>();
		
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(TS.split(", ")));
		
		for(int i = 0; i < toys.size(); i +=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			Toy object = getThatToy(name);
			if(object == null)
			{
				if(type.equals("Car"))
				{
					ToyList.add(new Car(name));
				}
				else if(type.equals("AF"))
				{
					ToyList.add(new AFigure(name));
				}
			}
			else
			{
				object.setCount(object.getCount()+1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy object:ToyList)
		{
			if(object.getName().equals(nm))
			{
				return object;
			}
		}
		return null;
	}
}