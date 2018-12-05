import java.sql.SQLException;

public class GetDataFromTestDd {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectMySql.connectDb();
        System.out.println("DB Connected");

    }
}
