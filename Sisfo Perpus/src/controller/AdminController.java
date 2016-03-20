/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author ASUS
 */
import model.Admin;
import view.AdminView;

public class AdminController {
    private Admin model;
    private AdminView view;
    
    public AdminController(Admin model, AdminView view){
        this.model = model;
        this.view = view;
    }
    
   public void setAdminName(String name){
      model.setNama(name);
   }

   public String getStudentName(){
      return model.getNama();		
   }

    public void setAdminID(String idAdmin){
      model.setId_admin(idAdmin);
   }

   public String getAdminID(){
      return model.getId_admin();
   }
   
   public void updateView(){				
      view.printAdmin(model.getId_admin(), model.getNama());      
   }
}
