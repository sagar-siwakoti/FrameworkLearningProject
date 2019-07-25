import java.sql.*;
import java.util.*;
public class RandomDataInDatabase {


String driverClass="com.mysql.cj.jdbc.Driver";
String databaseUrl="jdbc:mysql://localhost:3306/atm";
String username="root";
String password="";

public void Random1() throws Exception{
	Class.forName(driverClass);
	Connection cn =DriverManager.getConnection(databaseUrl,username,password);
	Statement stat = cn.createStatement();
//	String query="select id from information where pin="+pin+"";
	//ResultSet rs=stat.executeQuery(query);
	Random rd=new Random();
	int number = 0;
	
	for(int i=0;i<5;i++)
	{	number=rd.nextInt(10000000)+1000000;
	
	 String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
	         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
	         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
	         "Mar", "Luk" };
	   String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
	         "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
	         "marac", "zoir", "slamar", "salmar", "urak" };
	   String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
	         "tron", "med", "ure", "zur", "cred", "mur" };
	  // String strArray[] = str.split(" ");
	String name =(Beginning[rd.nextInt(Beginning.length)] + 
            Middle[rd.nextInt(Middle.length)]+
            End[rd.nextInt(End.length)]);
	String query="insert into information(id,name) values  ("+number+",'"+name+"')";
	stat.execute(query); 
	cn.close();
	}
	}
	
}