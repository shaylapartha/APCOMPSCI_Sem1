public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore thestore = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(thestore);
		
		System.out.println(thestore.getMostFrequentToy());
		System.out.println(thestore.getMostFrequentType());
	}
}