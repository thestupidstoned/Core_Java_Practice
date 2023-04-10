import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbConnection {
    String hostname;
    String user;
    String password;
    String port;
    String database;
    Properties props;

    Connection conn;
    private static final Logger logger = MyLogger.getClassBLogger();
    DbConnection() {
        logger.info("Constructor Invoked");
    }

    public void setProperties(String propetiesFile) throws IOException {
        System.out.println("i'm inside setProperties function()");
        File f = new File(propetiesFile);
        FileReader fr = new FileReader(f);
        Properties props = new Properties();
        props.load(fr);
        hostname = props.getProperty("hostname");
        user = props.getProperty("user");
        password = props.getProperty("password");
        port = props.getProperty("port");
        database = props.getProperty("database");
        System.out.println(
                hostname + " - " + hostname + " - " + user + " - " + password + " - " + port + " - " + database);

    }

    public static void connectionStatus(DbConnection db) throws ClassNotFoundException, SQLException
    {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Driver name
        String dbURL = "jdbc:sqlserver://DEL-H0SD2B3:1433;user=chuck;password=Anuj@1009;encrypt=true;trustServerCertificate=true;";
        Connection conn = DriverManager.getConnection(dbURL);
        if (conn != null) {
           logger.info("Conectioon Established - " + conn);
           db.conn= conn;    

        
        }
        else{
            logger.severe("Conectioon Not Established");
        }
    }

    public  void getShowDataFromTable(String TableName) throws SQLException{

        Statement stmt=conn.createStatement();  
  
        
        ResultSet result=stmt.executeQuery("SELECT COUNT(*) as count FROM AdventureWorksLT2019.SalesLT.Customer");  
        result.next();
        int count=result.getInt("count");
        System.out.println("Table count: "+ count);
            
        };

    }


