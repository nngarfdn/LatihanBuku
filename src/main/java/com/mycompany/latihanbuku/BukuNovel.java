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
public class BukuNovel extends Buku{

    String judul;
    int jumlahHalaman; 
    String namaPenulis; 
    String namaPenerbit;
    
    public BukuNovel(String judul, int jumlahHalaman, String namaPenulis, String namaPenerbit) {
        super(judul, jumlahHalaman, namaPenulis, namaPenerbit);
    }

    @Override
    public String toString() {
        return "BukuNovel{" + "judul=" + getJudul() + ", jumlahHalaman=" + getJumlahHalaman()+ ", namaPenulis=" + getNamaPenulis() + ", namaPenerbit=" + getNamaPenerbit() + '}';
    }

    
}
