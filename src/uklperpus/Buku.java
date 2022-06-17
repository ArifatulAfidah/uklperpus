/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpus;

/**
 *
 * @author WINDOWS 10
 */
public class Buku {
    private int idBuku;
    private int stok;
    private String judulBuku;

    Buku(int i, String sosial, int i0, String ale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Buku(int idBuku, String judulBuku, int stok) {
        this.idBuku = idBuku;
        this.stok = stok;
        this.judulBuku = judulBuku;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idBuku"
    public int getIdBuku() {
        return idBuku;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok"
    public int getStok() {
        return stok;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku" 
    public String getJudulBuku() {
        return judulBuku;
    }
    
    // method untuk mengurangi stok sejumlah 1
    public void kurangiStok(){
        this.stok--;
    }
    public void tambahStock(){
        this.stok++;
    }
    
}

//return digunakan untuk mengembalikan sebuah nilai
//void tipe method
//this digunakan untuk menghindari kesalahan akses antara property dan argument method yng memiliki nama sama
//private yaitu pengaksesan suatu variabel instan atau method hanya dpt dilakukan dlm kls itu sj,tdk bisa diakses diluar kls
//Enkapsulasi adalah penyembunyian data data privat dari suatu objek sehingga tdk dapat diakses oleh objek lain
//polimorphism yaitu sebuah konsep OOP dimana class memiliki banyak  bentuk method yang berbeda meskipun namanya sama
//privet modifayer/enkap
//enkap=menyembunyikan, inhe=pewarisan, poli=banyak bentuk serta tahapan

//throw digunakan untuk konsep Exception Handling
    //this inherintance,return enkap
//if yaitu percabangan yng hanya memiliki 1 blok pilihan saat kondisi bernilai benar

