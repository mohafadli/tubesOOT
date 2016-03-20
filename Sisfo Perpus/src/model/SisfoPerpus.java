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

public class SisfoPerpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin admin = new Admin();
        Buku buku = new Buku();
        Kategori katalog = new Kategori();
        Member member = new Member();
        Peminjaman peminjaman = new Peminjaman();
        Pengunjung pengunjung = new Pengunjung();
        
        member.rateBuku();
    }
    
}
