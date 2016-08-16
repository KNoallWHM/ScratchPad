package week4.day3;

import java.sql.*;

/**
 * Created by Superduo on 8/3/16.
 */
public class PostitTable {
    public static void main(String[] args) {
        Category postitNote2 = new Category();
        //postitNote2.checkTable();
        try {
            postitNote2.readAllRecords(true);
        } catch (Exception e) {
            e.printStackTrace();
        }}





    public void createpostitTable() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnote", "sa", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE postit_table ( id INTEGER IDENTITY, notetitle VARCHAR(256), notecontent VARCHAR(256))");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            //System.out.println("Table Already Exists");
            e.printStackTrace();
        }
    }

    public void checkTable2() {
        try {
            readAllRecords2(false);
        } catch (Exception e) {
            e.printStackTrace();
            //createpostitTable();
        }
    }

    public void readAllRecords2(boolean printMe) throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnote", "sa", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id,notetitle,notecontent FROM postit_table");
        while (rs.next()) {
            String rowResults = rs.getInt("id") + " -- " + rs.getString("notetitle") + " -- " + rs.getString("notecontent");

            if (printMe) {
                System.out.println(rowResults);
            }
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    public void insertRecord2(String notetitle, String notecontent) {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:categories", "sa", "");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO postit_table (notetitle, notecontent) VALUES (?,?);");
            stmt.setString(1, notetitle);
            stmt.setString(2, notecontent);

            stmt.executeUpdate();

            stmt.close();
            conn.close();


            System.out.println("NOTE: Finished Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





