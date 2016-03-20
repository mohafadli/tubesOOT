/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Buku {
    private String id_buku;
    private String judul;
    private String jenis;
    private String penerbit;
    private String tahun;
    private String pengarang;
    private String kategori;

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getId_buku() {
        return id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public String getJenis() {
        return jenis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getKategori() {
        return kategori;
    }
    
    public void ratingBuku(){
        
        
    }
    
}
