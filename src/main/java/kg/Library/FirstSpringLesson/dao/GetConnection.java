package kg.Library.FirstSpringLesson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetConnection {
    public Connection getConn(){
        String userLogin = "postgres";
        String userPassword = "postgres";
        String url = "jdbc:postgresql://localhost:5432/Library";

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, userLogin, userPassword);
            Statement statement = connection.createStatement();
            String qr = "SELECT email FROM Library";
            ResultSet rs = statement.executeQuery(qr);
            while (rs.next()){
                String email = rs.getNString("email");
                System.out.println(email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
