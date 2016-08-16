package week4.day3;


import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
/**
 * Created by Superduo on 8/3/16.
 */
public class PostitNote {




    public static void main(String[] args) {
        PostitNote postitNote = new PostitNote();
        postitNote.checkTable();
        try {
            postitNote.readAllRecords(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // ask questions
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to title your postit note?");
        String postitTitle = scanner.nextLine();
        System.out.println("please add your content");
        String postitContent = scanner.nextLine();
        System.out.println("please describe your category");
        String categoryDescription = scanner.nextLine();
        postitNote.insertRecord(postitTitle, postitContent, categoryDescription);

    }



    public void createTable() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postit", "sa", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE postit_table ( id INTEGER IDENTITY, postitTitle VARCHAR(256),postitContent VARCHAR(256), categoryDescription VARCHAR(256))");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Table Already Exists");
//            e.printStackTrace();
        }

    }

    public void checkTable() {
        try {
            readAllRecords(false);
        } catch (Exception e) {
            // e.printStackTrace();
            createTable();

        }
    }

    public void readAllRecords(boolean printMe) throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:postit", "sa", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id,postitTitle,postitContent,categoryDescription FROM postit_table");
        while (rs.next()) {
            String rowResults = rs.getInt("id") + " -- " + rs.getString("postitTitle") + " -- " + rs.getString("postitContent") + " -- " + rs.getString("categoryDescription");

            if (printMe) {
                System.out.println(rowResults);
            }
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    public void insertRecord(String postitTitle, String postitContent, String categoryDescription) {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postit", "sa", "");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO postit_table (postitTitle, postitContent,categoryDescription) VALUES (?,?,?);");
            stmt.setString(1, postitTitle);
            stmt.setString(2, postitContent);
            stmt.setString(3, categoryDescription);

            stmt.executeUpdate();

            stmt.close();
            conn.close();


            System.out.println("NOTE: Finished Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
