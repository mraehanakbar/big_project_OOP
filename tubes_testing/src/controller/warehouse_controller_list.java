/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Warehouse;
import view.input_barang;
import view.item_details;
import view.item_list;
import view.update_item;

/**
 *
 * @author john_wick
 */
public class warehouse_controller_list extends MouseAdapter implements ActionListener{
    private Database db;
    private item_list view_list;
    private item_details detail;
    private update_item update;
    ArrayList<Warehouse> warehouse = new ArrayList<>();
    
    public warehouse_controller_list(){
        warehouse = new ArrayList();
        db = new Database();
        update = new update_item();
        view_list = new item_list();
        detail = new item_details();
        view_list.addActionListener(this);
        view_list.addMouseAdapter(this);
        view_list.setVisible(true);
        detail.addActionListener(this);
        update.addActionListener(this);
        db.connect();
        db.load_database();
        load_database(warehouse);
    }
    
    public void load_database(ArrayList<Warehouse> warehouse){
    warehouse = db.getwarehouse();
    DefaultTableModel model = new DefaultTableModel(new String[]{"item number",
        "item name","item category","item description","item quantity","item owner","item image path"},0); 
    for (Warehouse p :  warehouse){
    model.addRow(new Object[]{p.getItem_number(),p.getName(),p.getKategori(),p.getDescription(),p.getQuantity(),p.getPemilik(),p.getImage_path()});
    }
    view_list.setItem_table(model);
    }
    
    public void mousePressed(MouseEvent me){
    Object source = me.getSource();
    warehouse = db.getwarehouse();
    if(source.equals(view_list.getItem_table())){
    int i = view_list.getSelecteditem();
    Warehouse p = warehouse.get(i);
    detail.setItem_details_number(p.getItem_number());
    detail.setItem_detail_name(p.getName());
    detail.setItem_detail_category(p.getKategori());
    detail.setItem_detail_description(p.getDescription());
    detail.setItem_detail_quantity(p.getQuantity());
    detail.setItem_detail_owner(p.getPemilik());
    detail.setItem_detail_image(p.getImage_path());
    detail.set_image();
    update.setCategory_cmbk_update(Integer.valueOf(p.getCategory_selection()));
    update.setDescription_ta_update(p.getDescription());
    update.setItem_numbertf_update(p.getItem_number());
    update.setItem_nametf_update(p.getName());
    update.setPemilik_tf_update(p.getPemilik());
    update.setLabel_image_update(p.getImage_path());
    update.setQuantityspinner_1_update(p.getQuantity());
    detail.setVisible(true);
    view_list.setVisible(false);
    }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
     if(source.equals(detail.getBack_button())){
    detail.setVisible(false);
    view_list.setVisible(true);
    } //To change body of generated methods, choose Tools | Templates.
     if(source.equals(detail.getUpdate_button())){
     update.set_image();
     update.setVisible(true);
     view_list.setVisible(false);
     }
     if(source.equals(update.getUpload_image_bt_update())){
     update.upload_image(ae);
     }
     if(source.equals(update.getUpdate_bt())){
     db.update_database(update.getItem_numbertf_update(), 
             update.getItem_nametf_update(), 
             update.getCategory_cmbk_update(), 
             update.getDescription_ta_update(), 
             update.getQuantityspinner_1_update(), 
             update.getPemilik_tf_update(), 
             update.getLabel_image_update(), 
             update.get_cmbk_choice(),
             detail.getItem_detail_name());
     update.setVisible(false);
     detail.setVisible(false);
     
     }
     
     if(source.equals(view_list.getBack_btn())){
     view_list.setVisible(false);
     }
     
     if (source.equals(detail.getDelete_button())){
     db.delete_item(detail.getItem_detail_name());
     detail.setVisible(false);
     view_list.setVisible(false);
     }
     
     if(source.equals(update.getBack_button_update())){
         update.setVisible(false);
       
     }
     
    }
    
    }
