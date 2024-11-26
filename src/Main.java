import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/gym_tracker";
        String user = "root";
        String password = "Basketball3!";

        //Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");
        }
        catch (SQLException e) {
            System.out.println("Failed to Connect");
            e.printStackTrace();
        }
    }
}

