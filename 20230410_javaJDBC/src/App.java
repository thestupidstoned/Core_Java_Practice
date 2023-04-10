import java.util.logging.Logger;

public class App {
    private static final Logger logger = MyLogger.getClassALogger();
    public static void main(String[] args) throws Exception {
        DbConnection db= new DbConnection();
        db.setProperties("config\\dbPropertiesFile.properties");
            DbConnection.connectionStatus(db);
           db.getShowDataFromTable("Customer");
        
    }
}
