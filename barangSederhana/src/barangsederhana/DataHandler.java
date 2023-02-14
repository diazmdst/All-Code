/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barangsederhana;

/**
 *
 * @author Tatik
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

    // string alamat nomor IP silahkan dig anti dengan ‘localhost’ atau IP server 
    // yang digunakan; demikian juga userid dan password nya. Silahkan diganti
    // denken yang digunakan sebenarnya
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid = "hr";
    String password = "SYSTEM";

    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;

    public DataHandler() {
    }

    public void getDBConnection() {
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Koneksi berhasil");
        } catch (SQLException ex) {
            System.out.println("Masih belum konek");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Tidak bisa tutup koneksi");
        }
    }


    public ResultSet getAllBarang() throws SQLException {
        getDBConnection();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query = "select *"
                + "from barangSederhana";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
        return rset;
    }

}
