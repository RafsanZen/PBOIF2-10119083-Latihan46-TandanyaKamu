/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan46.tandanyakamu;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program untuk Usia
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red = "\u001B[31m";
    
    public void Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String pesan = "";
        
        if(0 <= umur && umur <= 5) {
            pesan = "LAGI LUCU-LUCUNYA";
        }
        else if(5 < umur && umur <= 10) {
            pesan = "MASIH ANAK-ANAK";
        }
        else if(10 < umur && umur <= 13) {
            pesan = "MASIH REMADJA";
        }
        else if(13 < umur && umur <= 19) {
            pesan = "ALAY";
        }
        else if(19 < umur && umur <= 29) {
            pesan = "LAGI GALAU NYARI JODOH";
        }
        else if(29 < umur && umur <= 35) {
            pesan = "LAGI SIBUK NYARI UANG";
        }
        else if(35 < umur && umur <= 150) {
            pesan = "SUDAH TUA";
        }
        else{
            pesan = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        return red + pesan;
    }
}
