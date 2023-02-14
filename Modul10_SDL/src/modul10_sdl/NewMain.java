/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10_sdl;

/**
 *
 * @author ASUS
 */
public class NewMain {
public static void main(String[] args) {

        Mahasiswa mhs[] = new Mahasiswa[4];
        mhs[0] = new Mahasiswa();
        mhs[1] = new Mahasiswa();
        mhs[2] = new Mahasiswa();
        mhs[3] = new Mahasiswa();
        mhs[0].setNama("Yosef");
        mhs[0].setNim(215314045);
        mhs[1].setNama("Diaz");
        mhs[1].setNim(215314060);
        mhs[2].setNama("Valen");
        mhs[2].setNim(215314032);
        mhs[3].setNama("Andin");
        mhs[3].setNim(215314031);

        Mahasiswa cariMhs = new Mahasiswa();
        cariMhs.setNim(52);

        larik.cetak(mhs);
        System.out.println("");

        System.out.println("");
        larik.cetak(mhs);
    }

    public static void hasilSequential(Object[] mhs, Object cariMhs) {
        int hasilSequential = larik.cetakSequential(mhs, cariMhs);
        if (hasilSequential == -1) {
            System.out.println("Kosong");
        } else {
            System.out.println("Index ke - " + hasilSequential);
        }
    }

    public static void hasilBinary(Object[] mhs, Object cariMhs, int x) {
        int hasilBinary = larik.cetakBinary(mhs, cariMhs, 0, x);
        if (hasilBinary == -1) {
            System.out.println("Kosong");
        } else {
            System.out.println("Index ke - " + hasilBinary);
        }
    }

}