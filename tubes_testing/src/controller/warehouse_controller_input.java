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
import view.input_barang;
import view.item_list;

/**
 *
 * @author john_wick
 */
public class warehouse_controller_input implements ActionListener{
    private Database db;
    private input_barang view_input;
    private item_list view_list;
    
    public warehouse_controller_input(){
    db = new Database();
    view_input = new input_barang(); 
    view_list = new item_list();
    view_input.addActionListener(this);
    view_input.setItem_number_tf();
    view_input.setVisible(true);
    db.connect();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
         //To change body of generated methods, choose Tools | Templates.
         Object source = ae.getSource();
         if(source.equals(view_input.getUpload_image_bt())){
         view_input.upload_image(ae);
         }
         if(source.equals(view_input.getInput_bt())){
         db.insert_into_database(
         view_input.getItem_number_tf(),
         view_input.getName_tf(),
         view_input.getCategory_cmbk(),
         view_input.getDescription_ta(),
         view_input.getQuantitytf(),
         view_input.getPemilik_tf(),
         view_input.getLabel_image(),
         view_input.get_cmbk_choice()
         );
        }
         if(source.equals(view_input.getBack_button_input())){
             view_input.setVisible(false);
         
         }
         
    }
    
}
