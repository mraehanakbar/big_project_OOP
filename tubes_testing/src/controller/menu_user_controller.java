/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Warehouse;
import model.user_account;
import view.item_list;
import view.menu_app_user;

/**
 *
 * @author john_wick
 */
public class menu_user_controller implements ActionListener{
    private Database db;
    private Database db_item;
    private menu_app_user user;
    ArrayList<user_account> account_user = new ArrayList<>();
    private item_list list_user;
    ArrayList<Warehouse> warehouse_user = new ArrayList<>();
    
    public menu_user_controller(Database db){
    account_user = new ArrayList();
    warehouse_user = new ArrayList();
    list_user = new item_list();
    db_item = new Database();
    db_item.connect();
    user = new menu_app_user();
    user.AddActionLIstener(this);
    account_user = db.get_account();
    db.connect();
    user.setVisible(true);
    list_user.addActionListener(this);
    user.setName_tf(account_user.get(0).getName());
    user.setUsername_tf(account_user.get(0).getUsername());
    user.setImage_label_user(account_user.get(0).getUser_image());
    user.set_image();
    db_item.load_database_user(user.getName_tf());
    load_database(warehouse_user);
    }
    
     public void load_database(ArrayList<Warehouse> warehouse_user){
    warehouse_user = db_item.getwarehouse();
    DefaultTableModel model = new DefaultTableModel(new String[]{"item number",
        "item name","item category","item description","item quantity","item owner","item image path"},0); 
    for (Warehouse p :  warehouse_user){
    model.addRow(new Object[]{p.getItem_number(),p.getName(),p.getKategori(),p.getDescription(),p.getQuantity(),p.getPemilik(),p.getImage_path()});
    }
    list_user.setItem_table(model);
    }
    

    
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(user.getLog_out_button())){
            user.setVisible(false);
            login_controller login_again = new login_controller();
        
        }
        
        if(source.equals(user.getView_button())){
        list_user.setVisible(true);
        }
        
        if(source.equals(list_user.getBack_btn())){
            list_user.setVisible(false);
            user.setVisible(true);
        
        }
        
    }
    
}
