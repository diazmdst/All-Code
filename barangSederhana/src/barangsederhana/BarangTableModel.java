/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tatik
 */
package barangsederhana;


import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tatik
 */
public class BarangTableModel extends AbstractTableModel {
//employee_id, last_name, email, hire_date, job_id, salary, department_id, manager_id
    String columNames[] = {"Kode", "Nama","Harga Beli","Harga Jual", "Jumlah"};
    ArrayList data;

    public BarangTableModel(String keyword) throws SQLException {
        barangSeder r=new barangSeder();
        data = r.searchBarang(keyword);
    }

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return columNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columNames[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        barangSeder temp = (barangSeder) data.get(rowIndex);
        switch (columnIndex) {
                case 0 : return temp.getKode();
                case 1 : return temp.getNama();
                case 2 : return temp.getHbeli();
                case 3 : return temp.getHjual();
                case 4 : return temp.getJumlah();
        }
        return null;
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public static void main(String[] args) throws SQLException {
        BarangTableModel test = new BarangTableModel("");
        for (int i=0;i<test.getRowCount();i++)
            System.out.println("nama :" + test.getValueAt(i, 10));
    }
}

