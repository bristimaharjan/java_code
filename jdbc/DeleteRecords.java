package jdbc;

import java.sql.*;

public class DeleteRecords {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");
            Statement statement = con.createStatement();
            String query = "Delete from  student where id < 5";

            int result = statement.executeUpdate(query);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
}
