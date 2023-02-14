/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class no8 {

    /**
     * @param args the command line arguments
     */
    static int siswa;
    static char[] nilaifinal;
    static String[] nim;
    static String[] nama;
    static double[] us1, us2, uas, total;
    static double data3, data4, data5, data6;
    static String data1, data2;
    static char data7;
    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa : ");
        siswa = sc.nextInt();
        nim = new String[siswa];
        nama = new String[siswa];
        us1 = new double[siswa];
        us2 = new double[siswa];
        uas = new double[siswa];
        total = new double[siswa];
        nilaifinal = new char[siswa];

        for (i = 0; i < siswa; i++) {
            System.out.print("Nama\t\t\t\t: ");
            nama[i] = sc.next();
            System.out.print("NIM\t\t\t\t: ");
            nim[i] = sc.next();

            do {
                System.out.print("Nilai Ujian Semester 1\t\t: ");
                us1[i] = sc.nextDouble();
                System.out.print("Nilai Ujian Semester 2\t\t: ");
                us2[i] = sc.nextDouble();
                System.out.print("Nilai Ujian Akhir Semester\t: ");
                uas[i] = sc.nextDouble();
            } while (us1[i] >= 101 || us2[i] >= 101 || uas[i] >= 101);
            total[i] = hitung(us1[i], us2[i], uas[i]);
            huruf();
            System.out.println();
        }
        daftarnilai();
        System.out.println("=================================");
        System.out.println();
        urutnilai();
        System.out.println("=================================");

    }

    static void daftarnilai() {
        System.out.println("Daftar Nilai Mahasiswa TI USD");
        System.out.println("\nNo.\tNIM\tNama\tUS1\tUS2\tUAS\tTotal\tFinal");
        System.out.println("---------------------------------------------");
        for (int j = 0; j < siswa; j++) {
            System.out.println((j + 1) + "\t" + nim[j] + "\t" + nama[j] + "\t" + 
                    us1[j] + "\t" + us2[j] + "\t" + uas[j] + "\t" + total[j] + "\t" + nilaifinal[j]);
        }
    }

    static void urutnilai() {
        iff();
        System.out.println("Daftar Nilai Mahasiswa TI USD Urut Terbaik");
        System.out.println("\nNo.\tNIM\tNama\tUS1\tUS2\tUAS\tTotal\tFinal");
        System.out.println("---------------------------------------------");
        for (int j = 0; j < siswa; j++) {
            System.out.println((j + 1) + "\t" + nim[j] + "\t" + nama[j] + "\t" + 
                    us1[j] + "\t" + us2[j] + "\t" + uas[j] + "\t" + total[j] + "\t" + nilaifinal[j]);
        }
    }

    static void iff() {
        for (int x = 0; x < (siswa - 1); x++) {

            for (int j = 0; j < siswa - x - 1; j++) {

                if (total[j] < total[j + 1]) {

                    data1 = nim[j];
                    nim[j] = nim[j + 1];
                    nim[j + 1] = data1;

                    data2 = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = data2;

                    data3 = us1[j];
                    us1[j] = us1[j + 1];
                    us1[j + 1] = data3;

                    data4 = us2[j];
                    us2[j] = us2[j + 1];
                    us2[j + 1] = data4;

                    data5 = uas[j];
                    uas[j] = uas[j + 1];
                    uas[j + 1] = data5;

                    data6 = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = data6;

                    data7 = nilaifinal[j];
                    nilaifinal[j] = nilaifinal[j + 1];
                    nilaifinal[j + 1] = data7;
                }
            }
        }
    }

    static void huruf() {
        if (total[i] >= 80) {
            nilaifinal[i] = 'A';
        } else if (65 <= total[i] && total[i] < 80) {
            nilaifinal[i] = 'B';
        } else if (55 <= total[i] && total[i] < 65) {
            nilaifinal[i] = 'C';
        } else if (50 <= total[i] && total[i] < 55) {
            nilaifinal[i] = 'D';
        } else if (total[i] < 50) {
            nilaifinal[i] = 'E';
        }
    }

    static double hitung(double n, double nn, double nnn) {
        double jum;
        jum = (0.3 * n) + (0.3 * nn) + (0.4 * nnn);
        return jum;
    }
}

