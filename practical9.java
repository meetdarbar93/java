import java.io.*;
import java.sql.*;

public class practical9 {
    public static void main(String[] args) {
        int ch;
        System.out.println("1.New student entry");
        System.out.println("2.Calculate student result");
        System.out.println("3.Display formeted marksheet");
        System.out.println("4.Delete student entry");
        System.out.println("5.Modify student informations");
        System.out.println("6.Exit");
        System.out.println("Enter you choice : ");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meet", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    int rno, m1, m2, m3;
                    String sname;
                    System.out.println("Enter roll number : ");
                    rno = Integer.parseInt(br.readLine());
                    System.out.println("Enter name : ");
                    sname = br.readLine();
                    System.out.println("Enter marks 1 : ");
                    m1 = Integer.parseInt(br.readLine());
                    System.out.println("Enter marks 2 : ");
                    m2 = Integer.parseInt(br.readLine());
                    System.out.println("Enter marks 3 : ");
                    m3 = Integer.parseInt(br.readLine());
                    stmt.executeUpdate(
                            "insert into student values(" + rno + ",'" + sname + "'," + m1 + "," + m2 + "," + m3
                                    + ",0,0)");
                    System.out.println("Record inserted");
                    break;
                case 2:
                    stmt.executeUpdate("update student set total=sub1+sub2+sub3,per=total/3");
                    System.out.println("Record updated");
                    rs = stmt.executeQuery("select * from student");
                    System.out.println(" ");
                    while (rs.next()) {
                        System.out.println(
                                rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4) + " "
                                        + rs.getInt(5) + " " + rs.getInt(6) + " " + rs.getFloat(7));
                    }
                    break;
                case 3:
                    int roll_no;
                    System.out.println("Enter roll no  : ");
                    roll_no = Integer.parseInt(br.readLine());
                    rs = stmt.executeQuery("select * from student where rno =" + roll_no);
                    System.out.println(" ");
                    System.out.println("\t\tMarksheet");
                    if (rs.next()) {
                        System.out.println("\n");
                        System.out.println("Roll No : " + rs.getInt(1));
                        System.out.println("Name : " + rs.getString(2));
                        System.out.println("Marks of 1 : " + rs.getInt(3));
                        System.out.println("Marks of 2 : " + rs.getInt(4));
                        System.out.println("Marks of 3 : " + rs.getInt(5));
                        System.out.println("Total : " + rs.getInt(6));
                        System.out.println("Percentahes : " + rs.getInt(7));
                        System.out.println(" ");
                    } else {
                        System.out.println("The marksheet doesn't exsist");
                    }
                    break;
                case 4:
                    System.out.println("enter roll number : ");
                    roll_no = Integer.parseInt(br.readLine());
                    stmt.executeUpdate("delete from student where rno =" + roll_no);
                    System.out.println("record deleted");
                    break;
                case 5:
                    System.out.println("Enter roll number");
                    roll_no = Integer.parseInt(br.readLine());
                    System.out.println("enter marks 1: ");
                    m1 = Integer.parseInt(br.readLine());
                    System.out.println("enter marks 2: ");
                    m2 = Integer.parseInt(br.readLine());
                    System.out.println("enter marks 3: ");
                    m3 = Integer.parseInt(br.readLine());
                    stmt.executeUpdate("update student set sub1=" + m1 + ",sub2=" + m2 + ",sub3=" + m3
                            + " where rno =" + roll_no);
                    stmt.executeUpdate("update student set total = sub1+sub2+sub3 where rno =" + roll_no);
                    stmt.executeUpdate("update student set per=total/3 where rno =" + roll_no);
                    System.out.println("Record Updated");
                    break;
                case 6:
                    break;
                default:
                    break;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

