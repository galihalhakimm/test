/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    
    private String nama;
    private String alamat;
    private String nrp;
    private int umur;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String alamat, String nrp, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.nrp = nrp;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + ", alamat=" + alamat + ", nrp=" + nrp + ", umur=" + umur + '}';
    }
    
    
}
