public class UserClass
{
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
   
   public UserClass(String fN, String lN)
   {
	   firstName = fN;
	   lastName = lN;
	   avatar = "Undefined";
	   userID = (int)(Math.random() * 1000000) + 1;
   }
   
   public UserClass(String fN, String lN, String ava)
   {
	   firstName = fN;
	   lastName = lN;
	   avatar = ava;
	   userID = (int)(Math.random() * 1000000) + 1;
   }
   
   public String toString()
   {
   return "Customer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
   }
}

