import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/gym_tracker";
        String user = "root";
        String password = "Basketball3!";

        //Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");
            Gui.launch(Gui.class, args);

            String sql = "SELECT * FROM exercises";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("exercise_name");
                String description = resultSet.getString("exercises_description");

                System.out.println("ID: " + id + "\nName: " + name + "\nDescription: " + description);
            }

        }
        catch (SQLException e) {
            System.out.println("Failed to Connect");
            e.printStackTrace();
        }
    }
}

