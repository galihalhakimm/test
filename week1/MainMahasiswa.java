/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa pr = new Mahasiswa();
        
        System.out.print("Masukkan Nama : ");
        Scanner input = new Scanner(System.in);
        String Mahasiswa_Nama = input.next();
        
        System.out.print("Masukkan Alamat : ");
        String Mahasiswa_Alamat = input.next();
        
        System.out.print("Masukkan Nrp : ");
        String Mahasiswa_Nrp = input.next();
        
        System.out.print("Masukkan Umur : ");
        int Mahasiswa_Umur = input.nextInt();
        
        pr.setNama(Mahasiswa_Nama);
        pr.setAlamat(Mahasiswa_Alamat);
        pr.setNrp(Mahasiswa_Nrp);
        pr.setUmur(Mahasiswa_Umur);
        System.out.println(pr.toString());
        
        
        
    }
    
}
