package jdbc;
import java.sql.*;

public class Dispprep {


        public static void main(String[] args) {
            try {
                String url = "jdbc:mysql://localhost:3306/STUDENTS";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");

                String query = "SELECT * FROM student";
                PreparedStatement preparedStatement = con.prepareStatement(query);

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("id") + " ");
                    System.out.print(resultSet.getString("name") + " ");
                    System.out.print(resultSet.getString("email") + " ");
                    System.out.print(resultSet.getInt("Semester") + " ");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
                e.printStackTrace();
            }
        }
    }


