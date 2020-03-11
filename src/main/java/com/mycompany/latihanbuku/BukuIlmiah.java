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
public class BukuIlmiah extends Buku{


    public BukuIlmiah(String judul, String namaPenulis, int jumlahHalaman, String namaPemilik, String namaInstansi) {
        super(judul, namaPenulis, jumlahHalaman, namaPemilik, namaInstansi);
    }

    @Override
    public String toString() {
        return "BukuIlmiah{" + "judul=" + getJudul() + ", namaPenulis=" + getNamaPenulis() + ", jumlahHalaman=" + getJumlahHalaman()
                + ", namaPemilik=" + getNamaPemilik() + ", namaInstansi=" + getNamaInstansi() + '}';
    }
    
    
}
