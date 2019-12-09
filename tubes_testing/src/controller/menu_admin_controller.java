/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Database;
import model.user_account;
import view.menu_app_admin;

/**
 *
 * @author john_wick
 */
public class menu_admin_controller implements ActionListener{
private Database db;
private menu_app_admin menu_admin;
ArrayList<user_account> account_admin = new ArrayList<>();
public menu_admin_controller(Database db){
    account_admin = new ArrayList();
    menu_admin = new menu_app_admin();
    menu_admin.AddActionListener(this);
    account_admin = db.get_account();
    db.connect();
    menu_admin.setVisible(true);
    menu_admin.setNama_label(account_admin.get(0).getName());
    menu_admin.setUser_name_label(account_admin.get(0).getUsername());
    menu_admin.setLabel_image_update(account_admin.get(0).getUser_image());
    menu_admin.set_image();
}

    public void actionPerformed(ActionEvent ae) {
         Object source = ae.getSource();
    if(source.equals(menu_admin.getAdd_item_button())){
    warehouse_controller_input input_menu = new warehouse_controller_input();
    }
    if(source.equals(menu_admin.getCreate_account_button())){
        create_account_controller create_account = new create_account_controller();
    }
    if(source.equals(menu_admin.getDelete_and_update_button())){
        warehouse_controller_list crud = new warehouse_controller_list();
    }
    
    if(source.equals(menu_admin.getLog_out_button())){
    menu_admin.setVisible(false);
    login_controller login_again = new login_controller();
    }
    
    }
    
}
