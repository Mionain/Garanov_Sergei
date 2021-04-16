package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.sqlite.*;

public class connection 
{
	public static Connection co;
	public static Statement st;
        public static ResultSet res;
    
       
        
	public static Connection open_base_users()
	{
		try
		{
			Class.forName("org.sqlite.JDBC"); 
                        SQLiteConfig config = new SQLiteConfig();
                        config.setOpenMode(SQLiteOpenMode.NOMUTEX);
			co = DriverManager.getConnection("jdbc:sqlite:users.db", config.toProperties());
			System.out.println("Подключено");
                        st = co.createStatement();
                        
		}
		catch(Exception e)
		{System.out.println(e.getMessage());}
		return co;
	}
        
	public static Connection close_base_users() 
	{
		try
		{co.close();
                 st.close();
                 res.close();
		 System.out.println("Отключено");
		}
		catch(Exception e)
		{System.out.println(e.getMessage());}
		return co;	
	}
        
        public static void refresh() 
        {
             String query = "SELECT * FROM cheta WHERE id_order = "+function.Info_account.id+";";
            try
		{
                          Integer i = 1;
			  res = st.executeQuery(query);
                          while(res.next()){
                             function.Info_account.id_c[i] = res.getInt("id");
                             function.Info_account.id_vid[i] = res.getInt("id_vid");
                             function.Info_account.Sumid_c[i] = res.getInt("SUM");
                             function.Info_account.Lang = i;
                             i++;}     
		}
		catch(Exception e){System.out.println(e.getMessage());}
        }
       	
}