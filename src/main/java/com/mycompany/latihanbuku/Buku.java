/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanbuku;

/**
 *
 * @author praktikan
 */
public class Buku {
    private int jumlahHalaman;
    private String namaPemilik;
    private String judul;
    private String namaPenerbit;
    private String namaPenulis;
    private String merk;
    private String namaInstansi;
    private String namaPembimbing;
    private int harga;

    public Buku( String judul,int jumlahHalaman, String namaPenulis, String namaPenerbit) {
        this.jumlahHalaman = jumlahHalaman;
        this.judul = judul;
        this.namaPenerbit = namaPenerbit;
        this.namaPenulis = namaPenulis;
        this.namaPemilik = null ;
        
    }

    public Buku(int jumlahHalaman, String merk) {
        this.jumlahHalaman = jumlahHalaman;
        this.merk = merk;
        this.namaPemilik = null ;
    }
    

    public Buku(String judul, String namaPenulis, int jumlahHalaman, String namaPemilik,  String namaInstansi, String namaPembimbing) {
        this.jumlahHalaman = jumlahHalaman;
        this.namaPemilik = namaPemilik;
        this.judul = judul;
        this.namaPenulis = namaPenulis;
        this.namaInstansi = namaInstansi;
        this.namaPembimbing = namaPembimbing;
    }

    public Buku(int jumlahHalaman, String namaPemilik, String merk, int harga) {
        this.jumlahHalaman = jumlahHalaman;
        this.namaPemilik = namaPemilik;
        this.merk = merk;
        this.harga = harga;
    }

    public Buku(String judul,String namaPenulis,int jumlahHalaman, String namaPemilik,   String namaInstansi) {
        this.jumlahHalaman = jumlahHalaman;
        this.namaPemilik = namaPemilik;
        this.judul = judul;
        this.namaPenulis = namaPenulis;
        this.namaInstansi = namaInstansi;
    }
    
    

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNamaInstansi() {
        return namaInstansi;
    }

    public void setNamaInstansi(String namaInstansi) {
        this.namaInstansi = namaInstansi;
    }

    public String getNamaPembimbing() {
        return namaPembimbing;
    }

    public void setNamaPembimbing(String namaPembimbing) {
        this.namaPembimbing = namaPembimbing;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
