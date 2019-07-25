import java.util.*;
public class RandomNo {
   public static void main(String[] args) {
	Random ran = new Random();
	  for(int i=0;i<10;i++)
	  {
		  System.out.println(ran.nextInt(10000)+10000);
		//  System.out.println(ran.);
	 
	

		   String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
		         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
		         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
		         "Mar", "Luk" };
		   String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
		         "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
		         "marac", "zoir", "slamar", "salmar", "urak" };
		   String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
		         "tron", "med", "ure", "zur", "cred", "mur" };
		   
		   Random rand = new Random();

		   

		      System.out.println(Beginning[rand.nextInt(Beginning.length)] + 
		            Middle[rand.nextInt(Middle.length)]+
		            End[rand.nextInt(End.length)]);

	  }

		

   }
}
