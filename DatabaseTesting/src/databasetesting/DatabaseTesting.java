
package databasetesting;
import java.sql.*;  
import com.microsoft.sqlserver.jdbc.*;  
      

public class DatabaseTesting {

    
    public static void main(String[] args) {
    String connectionString = "jdbc:sqlserver://apple.database.windows.net:1433;database=appleGeet;user=adminabc@apple;password=abc123@;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;" ;
                    
              
                // Declare the JDBC objects.  
                Connection connection = null;  
                Statement statement = null;   
                ResultSet resultSet = null;  
                PreparedStatement prepsCreateProduct = null;              
                try {  
                    connection = DriverManager.getConnection(connectionString);  
      
                    // Create and execute a SELECT SQL statement.  
                    String CreateSql = "CREATE TABLE Persons(PersonID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255));";  
                    prepsCreateProduct = connection.prepareStatement(  
                        CreateSql,  
                        Statement.RETURN_GENERATED_KEYS);  
                    prepsCreateProduct.execute();  
                      
                    // Retrieve the generated key from the insert.  
                    resultSet = prepsCreateProduct.getGeneratedKeys();  
                      
                    // Print the ID of the inserted row.  
                    while (resultSet.next()) {  
                        System.out.println("Generated: " + resultSet.getString(1));  
                    }  
                }  
                catch (Exception e) {  
                    e.printStackTrace();  
                }  
                finally {  
                    // Close the connections after the data has been handled.  
                    if (prepsCreateProduct != null) try { prepsCreateProduct.close(); } catch(Exception e) {}  
                    if (resultSet != null) try { resultSet.close(); } catch(Exception e) {}  
                    if (statement != null) try { statement.close(); } catch(Exception e) {}  
                    if (connection != null) try { connection.close(); } catch(Exception e) {}  
                }  
            }  
}
