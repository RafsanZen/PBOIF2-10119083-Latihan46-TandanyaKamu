/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program untuk Tandanya kamu
 */
public class PBOIF210119083Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age umur = new Age();
        
        System.out.printf("Masukkan Tahun Lahir Anda : ");umur.setYearBirth(scanner.nextInt());
        
        System.out.printf("\n======Hasil Perhitungan Umur======\n");
        System.out.printf("Tahun lahir anda : %d\n",umur.getYearBirth());
        umur.Age(Calendar.getInstance().get(Calendar.YEAR));
        System.out.printf("Hari ini tahun : %d\n",umur.getYearNow());
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun\n", umur.hitungUmur());
        System.out.printf("Tandanya Kamu %s\n", umur.tandanyaKamu(umur.hitungUmur()));
        
        System.out.println("==========================================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
