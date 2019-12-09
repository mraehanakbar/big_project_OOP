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
import view.login_form;
import view.menu_app_admin;
import view.create_account_form;
import view.menu_app_user;
import java.lang.IndexOutOfBoundsException;
import view.input_barang;
import javax.swing.JOptionPane;
/**
 *
 * @author john_wick
 */
public class login_controller implements ActionListener{
    private Database db;
    private input_barang message;
    private login_form login;
    private menu_app_admin admin;
    private menu_app_user user;
    ArrayList<user_account> account = new ArrayList<>();
    
    
    public login_controller(){
    account = new ArrayList();
    message = new input_barang();
    db = new Database();
    login = new login_form();
    admin = new menu_app_admin();
    user =  new menu_app_user();
    login.AddActionListener(this);
    login.setVisible(true);
    account = db.get_account();
    db.connect();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source =  ae.getSource();
        if(source.equals(login.getLogin_bt())){
        db.login_user_database(login.getUser_name_tf_login(),login.getPassword_tf_login(),login);
        }
        try{
        if(account.get(0).getUser_type().equals("Admin")){
        menu_admin_controller admin_menu = new menu_admin_controller(db);
        }
        
        if(account.get(0).getUser_type().equals("User")){
        menu_user_controller user_menu = new menu_user_controller(db);
        }
        JOptionPane.showMessageDialog(message,message.login_success_message());
        }
        
        catch(IndexOutOfBoundsException e){
        login.setVisible(true);
        JOptionPane.showMessageDialog(message,message.login_fail_message());
        }
        
       
    }
    
}
