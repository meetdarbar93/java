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
                    System.out.println("Enter roll no : ");
                        int disp_rno = Integer.parseInt(br.readLine());
                        sql = "select * from student2 where rno = " + disp_rno;
                        rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            System.out.println("=====================================================");
                            System.out.println("\tName :\t" + rs.getString(2) + "\t\tRoll No. :  " + rs.getInt(1));
                            System.out.println("=====================================================");
                            System.out.println("\t\tMarks of subject 1 : \t" + rs.getInt(3));
                            System.out.println("\t\tMarks of subject 2 : \t" + rs.getInt(4));
                            System.out.println("\t\tMarks of subject 3 : \t" + rs.getInt(5));
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tPercentages : " + rs.getInt(7) + "\tTotal : " + rs.getInt(6));
                            System.out.println("======================================================");
                        }
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
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

