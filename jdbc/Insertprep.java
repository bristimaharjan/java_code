package jdbc;


import java.sql.*;

public class Insertprep {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");
            String query = "INSERT INTO student (id, name, email, semester) VALUES (?, ?, ?, ?)";


            PreparedStatement preparedStatement = con.prepareStatement(query);


            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Sita");
            preparedStatement.setString(3, "sita@gmail.com");
            preparedStatement.setInt(4, 1);

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Gita");
            preparedStatement.setString(3, "gita@gmail.com");
            preparedStatement.setInt(4, 2);
            preparedStatement.executeUpdate();  // Execute the query for the second record


            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Grace");
            preparedStatement.setString(3, "grace@gmail.com");
            preparedStatement.setInt(4, 7);
            preparedStatement.executeUpdate();  // Execute the query for the third record

            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "Jacob");
            preparedStatement.setString(3, "jacob@gmail.com");
            preparedStatement.setInt(4, 8);
            preparedStatement.executeUpdate();


            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "Manny");
            preparedStatement.setString(3, "manny@gmail.com");
            preparedStatement.setInt(4, 5);
            int result = preparedStatement.executeUpdate(); ;
            System.out.println(result);
            System.out.println("Records inserted successfully.");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
