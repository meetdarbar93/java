import java.io.*;
import java.sql.*;

public class practical8 {
    public static void main(String[] args) {
        String sql;
        int ch;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meet", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("1. Insert data");
                System.out.println("2. Select data");
                System.out.println("3. Update data");
                System.out.println("4. Delete data");
                System.out.println("5. Exit");
                System.out.println("Enter your choice : ");
                ch = Integer.parseInt(br.readLine());
                switch (ch) {
                    case 1:
                        int eid, salary;
                        String e_name, desig, joining;
                        System.out.println("Enter employee Id : ");
                        eid = Integer.parseInt(br.readLine());
                        System.out.println("Enter employee name : ");
                        e_name = br.readLine();
                        System.out.println("Enter employee designation : ");
                        desig = br.readLine();
                        System.out.println("Enter date of joining : ");
                        joining = br.readLine();
                        System.out.println("Enter salary");
                        salary = Integer.parseInt(br.readLine());
                        sql = "insert into employee values(" + eid + ",'" + e_name + "','" + desig + "','" + joining
                                + "',"
                                + salary + ")";
                        stmt.executeUpdate(sql);
                        System.out.println("Record inserted");
                        break;
                    case 2:
                        sql = "select * from employee";
                        rs = stmt.executeQuery(sql);
                        System.out.println(" ");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
                                    + rs.getString(4) + " " + rs.getInt(5));
                            System.out.println("==========================================================");
                        }
                        break;
                    case 3:
                        int change_eid, change_salary;
                        System.out.println("Enter the employee eid you want make change : ");
                        change_eid = Integer.parseInt(br.readLine());
                        System.out.println("Enter salary you want to set : ");
                        change_salary = Integer.parseInt(br.readLine());
                        sql = "update employee set salary =" + change_salary + " where empid =" + change_eid;
                        stmt.executeUpdate(sql);
                        System.out.println("Record updated");
                        break;
                    case 4:
                        int delete_eid;
                        sql = "select * from employee";
                        rs = stmt.executeQuery(sql);
                        System.out.println(" ");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
                                    + rs.getString(4) + " " + rs.getInt(5));
                            System.out.println(" ");
                        }
                        System.out.println("Enter employee id you want to delete");
                        delete_eid = Integer.parseInt(br.readLine());
                        sql = "delete from employee where empid =" + delete_eid;
                        stmt.executeUpdate(sql);
                        System.out.println("Record deleted");
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } while (ch != 5);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


