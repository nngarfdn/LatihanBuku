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
public class BukuTulis extends Buku{

    public BukuTulis(int jumlahHalaman, String merk) {
        super(jumlahHalaman, merk);
    }

    @Override
    public String toString() {
        return "BukuTulis{" + "jumlahHalaman=" + getJumlahHalaman() + ", merk=" + getMerk() + '}';
    }
    
    
}
