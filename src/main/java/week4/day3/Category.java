package week4.day3;

import com.sun.mail.imap.Rights;

import java.sql.*;
import java.util.Scanner;
import java.*;
/**
 * Created by Superduo on 8/3/16.
 */
public class Category {
    private Scanner scanner = new Scanner(System.in);
 private String categoryName;
    private String categoryColor;
    private String categoryDescription;

    private String postitTitle;
    private String postitContent;
    private int postitDescription;

    public static void main(String[] args) {
        Category postitNote2 = new Category();
//        postitNote2.checkTable();

        try {
            postitNote2.readAllRecords(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        // ask questions

    public void addtocategorytable() {
        System.out.println("What is the name of your category?");
        String categoryName = scanner.nextLine();
        System.out.println("What is the color of your category?");
        String categoryColor = scanner.nextLine();
        System.out.println("please describe your category");
        String categoryDescription = scanner.nextLine();
        //postitNote2.insertRecord(categoryName, categoryColor, categoryDescription);

    }
    public void addtopostittable() {

        System.out.println("What would you like to title your postit note?");
        String postitTitle = scanner.nextLine();
        System.out.println("please add your content");
        String postitContent = scanner.nextLine();
        System.out.println("please describe your category");
        String categoryDescription = scanner.nextLine();
        //.insertRecord(postitTitle, postitContent, categoryDescription);
    }

    public void createcategoryTable() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:categories", "sa", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE category_table ( id INTEGER IDENTITY, categoryName VARCHAR(256),categoryColor VARCHAR(256), categoryDescription VARCHAR(256))");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Table Already Exists");
//            e.printStackTrace();
        }

    }
    public void createpostitTable() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postit", "sa", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE postit_table ( id INTEGER IDENTITY, postitTitle VARCHAR(256),postitContent VARCHAR(256), postitDescription VARCHAR(256))");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Table Already Exists");
//            e.printStackTrace();
        }

    }

//    public void checkTables() {
//        try {
//            readAllRecords(false);
//        } catch (Exception e) {
//            // e.printStackTrace();
//            createcategoryTable();
//            createpostitTable();




    public void readAllRecords(boolean printMe) throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:categories", "sa", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT Category.categoryName, PostitNote.postitTitle, Category.color" +
                "FROM Category RIGHT JOIN PostitNote"+
                " ON Category.categoryDescription=Postitnote.categoryDescription");
        while (rs.next()) {
            String rowResults = rs.getInt("id") + " -- " + rs.getString("categoryName") + " -- " + rs.getString("categoryColor") + " -- " + rs.getString("categoryDescription");

            if (printMe) {
                System.out.println(rowResults);
            }
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    public void insertcategoryRecord(String categoryName, String categoryColor, String categoryDescription) {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:categories", "sa", "");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO category_table (categoryName, categoryColor,categoryDescription) VALUES (?,?,?);");
            stmt.setString(1, categoryName);
            stmt.setString(2, categoryColor);
            stmt.setString(3, categoryDescription);

            stmt.executeUpdate();
//                    "SELECT Category.categoryName, PostitNote.postitTitle, Category.color FROM Category INNER JOIN PostitNote ON Category.categoryDescription=Postitnote.categoryDescription");

            stmt.close();
            conn.close();


            System.out.println("NOTE: Finished category Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertpostitRecord(String postitTitle, String postitContent, String postitDescription) {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postit", "sa", "");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO postit_table (postitTitle, postitContent,postitDescription) VALUES (?,?,?);");
            stmt.setString(1, postitTitle);
            stmt.setString(2, postitContent);
            stmt.setString(3, postitDescription);

            stmt.executeUpdate();

            stmt.close();
            conn.close();


            System.out.println("NOTE: Finished Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void join() throws ClassNotFoundException, SQLException {

        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:categories", "sa", "");
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("SELECT Category.categoryName, PostitNote.postitTitle, Category.color FROM Category LEFT JOIN PostitNote ON Category.categoryDescription=Postitnote.categoryDescription");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


