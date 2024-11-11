package jdbc;

import java.sql.*;

public class Deleteprep{
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");

            String query = "DELETE FROM student WHERE id < ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setInt(1, 5);

            int result = preparedStatement.executeUpdate();

            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
}







