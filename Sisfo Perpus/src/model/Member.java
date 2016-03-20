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
public class Member {
    private String id_member;    
    private Pengunjung pengunjung;
    
    public Member(){}
    
    public Member(String id_member, String nama, String alamat, String no_telepon){
        this.id_member = id_member;
        this.pengunjung = new Pengunjung();
        pengunjung.setNama(nama);
        pengunjung.setAlamat(alamat);
        pengunjung.setNo_telepon(no_telepon);
    }

    public String getNama() {
        return pengunjung.getNama();
    }
    
    public String getAlamat() {
        return pengunjung.getAlamat();
    }
    
    public String getNoTelepon() {
        return pengunjung.getNo_telepon();
    }
    public void setId_member(String id_member) {
        this.id_member = id_member;
    }   

    public String getId_member() {
        return id_member;
    }
    
    
    public void rateBuku(){
        Scanner input = new Scanner(System.in);
        String[] bukuPilihanArray = new String[2];
        
         for (int i = 0; i < bukuPilihanArray.length; i++)
        {
            System.out.println("Please enter number");
            bukuPilihanArray[i] = input.next();
        }        
    }
    
}
