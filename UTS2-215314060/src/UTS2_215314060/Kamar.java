/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2_215314060;

/**
 *
 * @author ASUS
 */
public abstract class Kamar {

    private int lamaDenda;
    private int denda = 100000;
    Penyewa[] sewa;

    public int getLamaDenda() {
        return lamaDenda;
    }

    public void setLamaDenda(int lamaDenda) {
        this.lamaDenda = lamaDenda;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public Penyewa[] getSewa() {
        return sewa;
    }

    public void setSewa(Penyewa[] sewa) {
        this.sewa = sewa;
    }

    public double hitung() {
        double hit = 0;
        hit += hitungBiayaKamar();
        return hit;
    }

    public double totalBiaya() {
        double total = hitung() + totalDenda();
        return total;
    }

    public double totalDenda() {
        double totDen = getDenda() * getLamaDenda();
        return totDen;
    }

    abstract String getStatus();

    abstract double hitungBiayaKamar();
}
