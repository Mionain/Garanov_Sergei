
package function;

import java.sql.*;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteOpenMode;
 
public class trans_history implements Runnable{
private String query;
    private Integer num;
    
    public trans_history(String query)
    {
    this.query = query;
    this.num = num;
    }
    
    public void run()
    {
        System.out.println(num);
        Connection co;
	Statement st;
        
        try
	{
            System.out.println("№3 - поток");
            Class.forName("org.sqlite.JDBC");
            SQLiteConfig config = new SQLiteConfig();
            config.setOpenMode(SQLiteOpenMode.NOMUTEX);
            co = DriverManager.getConnection("jdbc:sqlite:users.db", config.toProperties());
            System.out.println("Подключено");
            st = co.createStatement();
            st.execute(query);
            co.close();
            st.close();
            
        }catch(Exception e){System.out.println(e.getMessage());}
		
        
        
    }  
}
