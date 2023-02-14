/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2_215314060;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainKost {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("\t\t\t\tRUMAH KOST D'KOST\n");
        System.out.print("Jumlah Penyewa\t: ");
        int jumSew = x.nextInt();
        Penyewa[] sewa = new Penyewa[jumSew];
        Kamar[] kmr = new Kamar[jumSew];
        for (int i = 0; i < sewa.length; i++) {
            sewa[i] = new Penyewa();
            System.out.println("\nPenyewa " + (i + 1));
            System.out.print("Masukkan Nama\t\t: ");
            String nama = x.next();
            System.out.print("Masukkan NIK\t\t: ");
            String nik = x.next();
            System.out.print("Masukkan Asal\t\t: ");
            String asal = x.next();
            System.out.print("Masukkan Pekerjaan\t: ");
            String pekerjaan = x.next();
            String status;
            sewa[i].setNama(nama);
            sewa[i].setNik(nik);
            sewa[i].setAsal(asal);
            sewa[i].setPekerjaan(pekerjaan);
            do {
                System.out.print("Status\t\t\t: Kamar ");
                status = x.next();
            } while (!status.equals("Kosongan") && !status.equals("Isian"));

            switch (status) {
                case "Kosongan":
                    kmr[i] = new KamarKosongan();
                    if (kmr[i] instanceof KamarKosongan) {
                        KamarKosongan kos1;
                        kos1 = (KamarKosongan) kmr[i];
                        System.out.print("Harga Sewa Per Bulan\t: Rp ");
                        double kosongan = x.nextDouble();
                        kos1.setBiayaKosong(kosongan);
                        System.out.print("Lama Sewa (Bulan)\t: ");
                        double lamSewKos = x.nextDouble();
                        kos1.setLamaSewaKosong(lamSewKos);
                        System.out.println("Biaya Sewa Kamar\t: Rp " + kos1.hitungBiayaKamar());
                    }
                    break;
                case "Isian":
                    kmr[i] = new KamarIsian();
                    if (kmr[i] instanceof KamarIsian) {
                        KamarIsian kos1;
                        kos1 = (KamarIsian) kmr[i];
                        System.out.print("Harga Sewa Per Bulan\t: Rp ");
                        double isian = x.nextDouble();
                        kos1.setBiayaIsian(isian);
                        System.out.print("Lama Sewa (Bulan)\t: ");
                        double lamSewKos = x.nextDouble();
                        kos1.setLamaSewaIsian(lamSewKos);
                        System.out.println("Biaya Sewa Kamar\t: Rp " + kos1.hitungBiayaKamar());
                    }
                    break;
            }
            System.out.print("Terlambat Bayar (Y/N)\t: ");
            String telaatt = x.next();
            switch (telaatt) {
                case "Y":
                    System.out.print("Berapa Kali Terlambat\t: ");
                    int kaliTelat = x.nextInt();
                    kmr[i].setLamaDenda(kaliTelat);
                    break;
                case "N":
                    System.out.println("Lanjut lah");
                    break;
            }
            kmr[i].setSewa(sewa);
        }
        System.out.println();
        System.out.println("\t\t\tData Penyewa");
        for (int i = 0; i < sewa.length; i++) {
            Penyewa[] List = kmr[i].getSewa();
            System.out.println("Nama\t\t\t\t: "+List[i].getNama()+"\nNIK\t\t\t\t: "+List[i].getNik()
                    +"\nAsal\t\t\t\t: "+List[i].getAsal()+"\nPekerjaan\t\t\t: "+List[i].getPekerjaan()
                    +"\nKamar yang Disewa\t\t: "+kmr[i].getStatus()+"\nTotal Denda\t\t\t: Rp "
                    +kmr[i].totalDenda()+"\nTotal yang Harus Dibayar\t: Rp "+kmr[i].totalBiaya());
            System.out.println();
            
        }
    }
}
