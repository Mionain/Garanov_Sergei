package function;

import java.sql.*;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteOpenMode;


/**
 *
 * @author yasup
 */
public class Update_User implements Runnable{
    
    private String query;
    
    public Update_User(String query)
    {
    this.query = query;
   
    }
    
    public void run()
    {
        Connection co;
	Statement st;
        
        try
	{
            System.out.println("UPDATE поток");
            Class.forName("org.sqlite.JDBC");
            SQLiteConfig config = new SQLiteConfig();
            config.setOpenMode(SQLiteOpenMode.NOMUTEX);
            co = DriverManager.getConnection("jdbc:sqlite:users.db", config.toProperties());
            System.out.println("Подключено");
            st = co.createStatement();
            st.executeUpdate(query);
            co.close();
            st.close();
            
        }catch(Exception e){System.out.println(e.getMessage());}
		
        
        
    }
}
