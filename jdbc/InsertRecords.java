package jdbc;
import java.sql.*;

public class InsertRecords {
        public static void main(String[] args) {
            try{
                String url = "jdbc:mysql://localhost:3306/STUDENTS";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");
                Statement statement = con.createStatement();
                String query = "INSERT INTO student (id, name, email, semester) VALUES "
                        + "(1, 'Sita', 'sita@gmail.com', 1), "
                        + "(2, 'Gita', 'gita@gmail.com', 2), "
                        + "(3, 'Grace', 'grace@gmail.com', 7), "
                        + "(4, 'Jacob', 'jacob@gmail.com', 8), "
                        + "(5, 'Manny', 'manny@gmail.com', 5);";

                int result = statement.executeUpdate(query);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Error" + e);
            }

        }
    }

