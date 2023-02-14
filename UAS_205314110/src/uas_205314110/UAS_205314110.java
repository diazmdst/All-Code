package uas_205314110;

/**
 *
 * @author LENOVO Titus
 */
public class UAS_205314110 {
    
    /**Titus
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[] jmlPasienDaerah = { 4, 48, 35, 86, 9, 23, 59, 8, 40, 100 };
        tampilkanData(jmlPasienDaerah);
    }

    static String checkZona(int data) {
        if (data >= 0 && data <= 10)
            return "Hijau";
        else if (data > 10 && data <= 50)
            return "Orange";
        else if (data > 50)
            return "Merah";
        else
            return "Tidak ada Data";
    }

    static int jumlahTotal(int[] data) {
        int jumlah = 0;
        for (int i : data) {
            jumlah += i;
        }
        return jumlah;
    }

    static double rataRata(int[] data) {
        int panjangData = data.length;
        int jumlahTotal = jumlahTotal(data);
        return (double) jumlahTotal / panjangData;
    }

    static int max(int[] data) {
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            if (i == 0)
                max = data[i];
            else if (i > 0 && max < data[i])
                max = data[i];
        }
        return max;
    }

    static int min(int[] data) {
        int min = 0;
        for (int i = 0; i < data.length; i++) {
            if (i == 0)
                min = data[i];
            else if (i > 0 && min > data[i])
                min = data[i];
        }
        return min;
    }

    static int jmlHijau(int[] data) {
        int jml = 0;
        String cek;
        for (int i : data) {
            cek = checkZona(i);
            if (cek.equalsIgnoreCase("hijau"))
                jml++;
        }
        return jml;
    }

    static int jmlOrange(int[] data) {
        int jml = 0;
        String cek;
        for (int i : data) {
            cek = checkZona(i);
            if (cek.equalsIgnoreCase("orange"))
                jml++;
        }
        return jml;
    }

    static int jmlMerah(int[] data) {
        int jml = 0;
        String cek;
        for (int i : data) {
            cek = checkZona(i);
            if (cek.equalsIgnoreCase("merah"))
                jml++;
        }
        return jml;
    }

    static void tampilkanData(int[] jmlPasien) {
        System.out.println("No. \t Jml Pasien \t Kategori");
        System.out.println("============================");
        for (int i = 0; i < jmlPasien.length; i++) {
            System.out.println(i + " \t " + jmlPasien[i] + " \t " + checkZona(jmlPasien[i]));

        }
        System.out.println("============================");
        System.out.println("Total pasien = " + jumlahTotal(jmlPasien));
        System.out.println("Rata - rata jumlah pasien = " + rataRata(jmlPasien));
        System.out.println("\nJumlah pasien terbanyak = " + max(jmlPasien));
        System.out.println("Jumlah pasien paling sedikit = " + min(jmlPasien));
        System.out.println("Jumlah daerah zona hijau = " + jmlHijau(jmlPasien));
        System.out.println("Jumlah daerah zona orange = " + jmlOrange(jmlPasien));
        System.out.println("Jumlah daerah zona merah = " + jmlMerah(jmlPasien));

    }
}

    
    
