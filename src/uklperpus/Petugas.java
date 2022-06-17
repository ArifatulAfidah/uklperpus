/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpus;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class Petugas {
     private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Petugas(){
        this.namaPetugas.add("Guru 1");
        this.alamat.add("Sawojajar");
        this.telepon.add("089**");
        this.jabatan.add(1);
        
        
        this.namaPetugas.add("Guru 2");
        this.alamat.add("Kepanjen");
        this.telepon.add("081***");
        this.jabatan.add(2);
    }

    //Override 
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    //Override=inheritance
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    //Override dan overloading untuk konsep enkap
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    //Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    //Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    //@Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Jabatan = "+getJabatan(i));
        }
    }

    //Override
    public void setJabatan(Integer jabatan) {
        this.jabatan.add(jabatan);
    }

    //Override
    public Integer getJabatan(int id) {
        return this.jabatan.get(id);
    }
    }
//scanner berfungsi sebagai kelas untuk melakukan masukan keyboard brbasis DOS
//assert digunakn untuk memeriksa keadaan objek, pada awal metode,setelah pemanggilan metode
//private modifayer/enkap
//for perulangan
//this=enkap
//override method sama implementasi beda
//overloading method sama fungsi beda