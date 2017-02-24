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
		
		for(int i = 0; i < toys.size(); i +=1)
		{
			String name = toys.get(i);
			String type = toys.get(i += 1);
			
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
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for(Toy object:ToyList)
		{
			if (max < object.getCount())
			{
				max = object.getCount();
				name = object.getName();
			}
			
		}
		return name;
		
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy object:ToyList)
		{
			if(object.getType().equals("Action Figure"))
			{
				figures += 1;
			}
			if(object.getType().equals("Car"))
			{
				cars += 1;
			}
		}
		
		if(cars > figures)
		{
			return "Cars";
		}
		
		if(cars < figures)
		{
			return "Action Figures";
		}
		
		else
		{
			return "Equal amounts of action figures and cars!!!";
		}
	}
	
	public String toString()
	{
		String result = "";
		for(Toy object:ToyList)
		{
			result += " " + object;
		}
		
		return result;
	}
	
}