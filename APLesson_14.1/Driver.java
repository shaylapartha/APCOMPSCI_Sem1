import java.util.ArrayList;
public class Driver
{
   public static void main(String[]args)
   {
       ArrayList<LocationOne> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new HondaOne(honLoc));
       locate.add(new ToyotaOne("8, 9"));
       locate.add(new GMCOne(3, 8));

       double[] home = {0, 0};
	   
	   String printout = "\n\n" + "==========================" + "\nStarting locations...";

       for (LocationOne l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }
	   
       printout += "\n\n" + "==========================" + "\nDistance from home...";

       for (LocationOne l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

       printout += "\n\n" + "==========================";
	   
	   for (LocationOne l : locate)
	   {
		   double xnew = Math.round((1 + (Math.random() * 100)) * 100.00)/100.00;
		   double ynew = Math.round((1 + (Math.random() * 100)) * 100.00)/100.00;
		   printout += "\nAfter " + l.getID() + " Moved (" + xnew + ", " + ynew + ")";
		   ((CarOne)l).move(xnew,2*ynew);
		   printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n";
	   }
	   
	   printout += "\n\n" + "==========================" + "\nDistance from home...";
		
	   for (LocationOne l : locate)
	   {
			printout += "\n\tDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")"; 
	   }
		
		System.out.println(printout);
   }

   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}