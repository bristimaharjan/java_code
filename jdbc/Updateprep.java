package jdbc;
import java.sql.*;

public class Updateprep {


        public static void main(String[] args) {
            try {
                String url = "jdbc:mysql://localhost:3306/STUDENTS";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");

                String query = "UPDATE student SET Semester = ? WHERE Semester = ?";
                PreparedStatement preparedStatement = con.prepareStatement(query);

                preparedStatement.setInt(1, 7);
                preparedStatement.setInt(2, 8);

                int result = preparedStatement.executeUpdate();

                System.out.println("Number of records updated: " + result);

            } catch (Exception e) {
                System.out.println("Error: " + e);
                e.printStackTrace();
            }
        }
    }

