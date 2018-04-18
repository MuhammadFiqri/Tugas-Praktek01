/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikfiqri;

/**
 *
 * @author Fiqri
 */
public class helmaksi {
    public static void main(String[] args) {
    helm dian = new helm();
    helm rio = new helm();
    helm tomi = new helm();
        
        rio.ukuran = "l";
        rio.warna = "hitam";
        rio.merk = "nhk";
        rio.harga = "200";
        rio.jenis = "double visior";
        
        dian.ukuran = "m";
        dian.warna = "Pink";
        dian.merk = "gm";
        dian.harga = "100";
        dian.jenis = "kaca cembung";
        
        tomi.ukuran = "s";
        tomi.warna = "merah";
        tomi.merk = "ink";
        tomi.harga = "250";
        tomi.jenis = "kaca bening";
        
        rio.cetakInfo();
        dian.cetakInfo();
        tomi.cetakInfo();
    }    
}
