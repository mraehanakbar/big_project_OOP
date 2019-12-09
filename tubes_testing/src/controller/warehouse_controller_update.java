/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Database;
import view.item_details;
import view.item_list;
import view.update_item;
/**
 *
 * @author john_wick
 */
public class warehouse_controller_update implements ActionListener{
private Database db;
private update_item view_update;
private item_details detail;

public warehouse_controller_update(){
db = new Database();
view_update = new update_item();
detail = new item_details();
view_update.addActionListener(this);
db.connect();
}
    
    
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view_update.getUpload_image_bt_update())){
        view_update.upload_image(ae);
        }
        if(source.equals(view_update.getUpdate_bt())){
            db.update_database(view_update.getItem_numbertf_update(), 
             view_update.getItem_nametf_update(), 
             view_update.getCategory_cmbk_update(), 
             view_update.getDescription_ta_update(), 
             view_update.getQuantityspinner_1_update(), 
             view_update.getPemilik_tf_update(), 
             view_update.getLabel_image_update(), 
             view_update.get_cmbk_choice(),
             detail.getItem_detail_name());
      
        }
        
        
        
        
    }
    
}
