package jdbc;
import java.sql.*;
public class DisplayRecords {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id") + " ");
                System.out.print(resultSet.getString("name")+ " " );
                System.out.print(resultSet.getString("email") + " ");
                System.out.print(resultSet.getInt("Semester"));

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

