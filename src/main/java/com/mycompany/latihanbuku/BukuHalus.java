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
public class BukuHalus extends Buku{

    
    public BukuHalus(int jumlahHalaman, String namaPemilik, String merk, int harga) {
        super(jumlahHalaman, namaPemilik, merk, harga);
    }

    @Override
    public String toString() {
        return "BukuHalus{" + "jumlahHalaman=" + getJumlahHalaman() + ", namaPemilik=" + getNamaPemilik() 
                + ", merk=" + getMerk() + ", harga=" + getHarga() + '}';
    }
    
    
}
