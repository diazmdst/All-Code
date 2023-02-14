/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barangsederhana;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tatik
 */
public class barangSeder {
    private int kode;
    private String nama;
    private int hbeli;
    private int hjual;
    private int jumlah;
    

    /**
     * @return the employee_id
     */
    public barangSeder()
    {
        
    }
    public barangSeder(int kode, String nama, int hbeli, int hjual, int jumlah)
    {
        this.kode=kode;
        this.nama=nama;
        this.hbeli=hbeli;
        this.hjual=hjual;
        this.jumlah=jumlah;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHbeli() {
        return hbeli;
    }

    public void setHbeli(int hbeli) {
        this.hbeli = hbeli;
    }

    public int getHjual() {
        return hjual;
    }

    public void setHjual(int hjual) {
        this.hjual = hjual;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    


    /**
     * @return the telephone
     */
    

    public static ArrayList searchBarang(String keyword) throws SQLException{
        ArrayList result = null;

        DataHandler dataHandler = new DataHandler();
        dataHandler.getDBConnection();
        Connection conn = dataHandler.conn;
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = "select *"
                + "from barangSederhana" ;

        ResultSet rset = stmt.executeQuery(query);
        result = new ArrayList();
        while (rset.next()) {
          barangSeder temp = new barangSeder(rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
          result.add(temp);
        }
        conn.close();
        return result;
    }

    /**
     * @return the phone_number
     */
    
}
