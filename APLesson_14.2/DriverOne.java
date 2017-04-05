import java.util.ArrayList;
public class DriverOne
{
   public static void main(String[]args)
   {
       ArrayList<LocationDos> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new HondaDos(honLoc));
       locate.add(new ToyotaDos("8, 9"));
       locate.add(new GMCDos(3, 8));

       double[] home = {0, 0};
	   
	   String printout = "\n\n" + "==========================" + "\nStarting locations...";

       for (LocationDos l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }
	   
       printout += "\n\n" + "==========================" + "\nDistance from home...";

       for (LocationDos l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
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