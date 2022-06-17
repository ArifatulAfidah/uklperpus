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
public class ListBuku {
    //pemeberian nilai pada array "listBuku" dengan tipe class Buku
    Buku[] listBuku = {
        new Buku(1, "Fisika", 30),
        new Buku(2, "Bahasa", 20),
        new Buku(3, "Sosial", 15),
        new Buku(4, "Pemrograman Web", 10),
    };
    
    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t Stok");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + " \t " +
                    listBuku[i].getJudulBuku() + " \t\t " +
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }
    
}

//length digunakan untuk menggabungkan 2 buah string
//New=keyword
//if yaitu percabangan yng hanya memiliki 1 blok pilihan saat kondisi bernilai benar
//for perulangan
//return digunakan untuk mengembalikan sebuah nilai