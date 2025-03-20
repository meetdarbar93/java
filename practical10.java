import java.io.*;
import java.sql.*;

public class practical10 {
    public static void main(String[] args) {
        String name, pwd;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meet", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter user name : ");
            name = br.readLine();
            System.out.println("Enter password : ");
            pwd = br.readLine();
            stmt.executeQuery("select * from user where userName ='" + name + "' and password ='" + pwd + "'");
            rs = stmt.executeQuery("select * from user where userName ='" + name + "' and password ='" + pwd + "'");
            if (rs.next()) {
                System.out.println("Login Successful\nWelcome user " + name);
            } else {
                System.out.println("Incorrect user name or password");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
