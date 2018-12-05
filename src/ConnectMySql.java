import java.sql.*;
import static java.lang.Class.forName;
public class ConnectMySql {

    /*
     * 1. import
     * 2. load and register driver
     * 3.. Create Connection
     * 4. Create Statement
     * 5. Execute Query
     * 6. Process the result
     * 7. Close
     * */

        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
            String userName = "root";
            String password = "rootuser";
            String query = "select name from students ";
            // Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish Connection
            Connection connection = DriverManager.getConnection(url, userName, password);
            //Create Statement
            Statement statement = connection.createStatement();
            // Execute Query
            ResultSet resultSet = statement.executeQuery(query);
            // Process results
            resultSet.next();
               String name = resultSet.getString("name");
               System.out.println(name);
            //Close
            statement.close();
            connection.close();

        }
        public static void connectDb() throws ClassNotFoundException, SQLException {
            String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
            String userName = "root";
            String password = "rootuser";
            String query = "select name from students ";
            // Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish Connection
            Connection connection = DriverManager.getConnection(url, userName, password);
        }
    }
