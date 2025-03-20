import java.sql.*;
import java.io.*;

public class practical11 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meet", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int ch;
            do {
                int bookid;
                String author, title;
                float price;
                System.out.println("1. Insert a new record");
                System.out.println("2. Update existing record for given BOOK_ID ");
                System.out.println("3. Delete existing record for given BOOK_ID ");
                System.out.println("4. Search for the record for the given title");
                System.out.println("5. Display records");
                System.out.println("6. Exit");
                System.out.println("Enter your choice: ");
                ch = Integer.parseInt(br.readLine());
                switch (ch) {
                    case 1:
                        System.out.println("Enter book id: ");
                        bookid = Integer.parseInt(br.readLine());
                        System.out.println("Enter title: ");
                        title = br.readLine();
                        System.out.println("Enter author: ");
                        author = br.readLine();
                        System.out.println("Enter price: ");
                        price = Float.parseFloat(br.readLine());
                        stmt.executeUpdate("insert into library values(" + bookid + ",'" + title + "','" + author + "',"
                                + price + ")");
                        System.out.println("Record inserted\n");
                        break;
                    case 2:
                        int up_bookid;
                        int new_id;
                        String new_author, new_title;
                        float new_price;
                        rs = stmt.executeQuery("select * from library");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + rs.getFloat(4));
                            System.out.println("==========================================================");
                        }
                        System.out.println("Enter book id you want to make a update");
                        up_bookid = Integer.parseInt(br.readLine());
                        System.out.println("enter new bookid");
                        new_id = Integer.parseInt(br.readLine());
                        System.out.println("enter new title");
                        new_title = br.readLine();
                        System.out.println("enter new author");
                        new_author = br.readLine();
                        System.out.println("enter new price");
                        new_price = Float.parseFloat(br.readLine());
                        stmt.executeUpdate(
                                "update library set bookid =" + new_id + ",title='" + new_title + "',author ='"
                                        + new_author + "',price=" + new_price + " where bookid=" + up_bookid);
                        System.out.println("record updated");
                        break;
                    case 3:
                        int del_id;
                        System.out.println("enter book id you want to delete : ");
                        del_id = Integer.parseInt(br.readLine());
                        stmt.executeUpdate("delete from library where bookid=" + del_id);
                        System.out.println("Record deleted");
                        break;
                    case 4:
                        String search;
                        System.out.println("enter book title : ");
                        search = br.readLine();
                        rs = stmt.executeQuery("select * from library where title='" + search + "'");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
                                    + rs.getFloat(4));
                            System.out.println("==========================================================");
                        }
                        break;
                    case 5:
                        rs = stmt.executeQuery("select * from library");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
                                    + rs.getFloat(4));
                            System.out.println("==========================================================");
                        }
                        break;
                    case 6:
                        break;
                }
            } while (ch != 6);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


