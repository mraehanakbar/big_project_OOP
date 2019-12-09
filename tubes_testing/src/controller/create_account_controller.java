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
import view.create_account_form;
/**
 *
 * @author john_wick
 */
public class create_account_controller implements ActionListener {
    private Database db;
    private create_account_form account;

    public create_account_controller(){
    db = new Database();
    account = new create_account_form();
    account.addActionListener(this);
    account.setVisible(true);
    db.connect();
    }
    public void actionPerformed(ActionEvent ae) {
         //To change body of generated methods, choose Tools | Templates.
         Object source = ae.getSource();
         if(source.equals((account.getUpload_image_bt_create_account()))){
         account.upload_image(ae);
         }
         
         if(source.equals(account.getCreate_account_bt())){
         db.create_account_database(
                 account.getName_tf_create_account(), 
                 account.getUsername_tf_create_account(), 
                 account.getPassword_tf_create_account(), 
                 account.account_type_selection(), 
                 account.get_image_user(),
                 account.getName_tf_create_account());
        JOptionPane.showMessageDialog(account, account.Success_message());
         }
         
         if(source.equals(account.getBack_button())){
         account.setVisible(false);
         }
    }
    
}
