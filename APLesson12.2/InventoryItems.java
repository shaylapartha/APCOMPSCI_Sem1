public class InventoryItems
{
   private String manufacturer;
   private String name;
   private String category;
   private int UPC;
   private double price; 
   
   public InventoryItems(String m, String n)
   {
	   manufacturer = m;
	   name = n;
	   category = "Undefined";
	   UPC = (int)(Math.random() * 1000000) + 1;
   }
   
   public InventoryItems(String m, String n, String c, double p)
   {
	   manufacturer = m;
	   name = n;
	   UPC = (int)(Math.random() * 1000000) + 1;
	   category = c;
	   price = p;
   }
   
   public String toString()
   {
   return "Item Info...\nName: " + name + "\nManufacturer: " + manufacturer + "\nCategory: " + category + "\nPrice: " + price + "\nUPC: " + UPC;
   }
   
}

