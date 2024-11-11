package jdbc;
import java.sql.*;

public class CreateStudentTable {
    public static void main(String[] args) {
                try{
                    String url = "jdbc:mysql://localhost:3306/STUDENTS";
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");
                    Statement statement = con.createStatement();
        String query = "CREATE TABLE student (ID INT PRIMARY KEY, " +
                "Name VARCHAR(50) NOT NULL," +
                " Email VARCHAR(100), " +
                "Semester INT)";
            statement.executeUpdate(query);
            System.out.println("Student table created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

