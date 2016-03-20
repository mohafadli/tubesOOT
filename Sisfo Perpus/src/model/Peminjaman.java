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
public class Peminjaman {
    private String id_anggota;
    private String id_buku;
    private int tgl_pinjam;
    private int tgl_kembali;

    public void setId_anggota(String id_anggota) {
        this.id_anggota = id_anggota;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public void setTgl_pinjam(int tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public void setTgl_kembali(int tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public String getId_buku() {
        return id_buku;
    }

    public int getTgl_pinjam() {
        return tgl_pinjam;
    }

    public int getTgl_kembali() {
        return tgl_kembali;
    }
    
    
}
