/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.item_details;
import view.input_barang;
import view.login_form;

/**
 *
 * @author john_wick
 */
public class Database {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private ResultSet rs_1;
    private ArrayList<Warehouse> warehouse = new ArrayList<>();
    private ArrayList<user_account> account = new ArrayList<>();
    private item_details detail;
    private input_barang message;
    private login_form login;
    
    public void connect(){
    String url = "jdbc:postgresql://localhost:5432/warehouse_database";
    String user = "postgres";
    String passwd = "raehan10";
    try{
        conn = DriverManager.getConnection(url,user,passwd);
        stmt = conn.createStatement();
        System.out.print("database is connected");
    }
    catch (SQLException ex){
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,ex);
    }
    
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void insert_into_database(String item_number,String item_name,String
            item_category,String item_description,String item_quantity,String item_owner
    ,String item_image,String item_category_selection){
    
    String statement = "INSERT INTO warehouse_table VALUES(";
    statement += "'"+item_number+"'"+",";
    statement += "'"+item_name+"'"+",";
    statement += "'"+item_category+"'"+",";
    statement += "'"+item_description+"'"+",";
    statement += "'"+item_quantity+"'"+",";
    statement += "'"+item_owner+"'"+",";
    statement += "'"+item_image+"'"+",";
    statement += "'"+item_category_selection+"'"+")"+";";
    connect();
    try{
    stmt.executeUpdate(statement);
    JOptionPane.showMessageDialog(message,message.Success_message());
    }
    catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(message,message.fail_message());
        }
    disconnect();
    }
    
    public void update_database(String item_number,String item_name,String
            item_category,String item_description,String item_quantity,String item_owner
    ,String item_image,String item_category_selection,String kontol){
        String statement = "UPDATE warehouse_table ";
        statement += "SET item_number = " + "'"+item_number+"'"+",";
        statement += "item_name = " + "'"+item_name+"'"+",";
        statement += "item_category = " + "'"+item_category+"'"+",";
        statement += "item_description = " + "'"+item_description+"'"+",";
        statement += "item_quantity = " + "'"+item_quantity+"'"+",";
        statement += "item_owner = " + "'"+item_owner+"'"+",";
        statement += "item_image = " + "'"+item_image+"'"+",";
        statement += "item_category_selection = " + "'"+item_category_selection+"'";
        statement += "where item_name = " + "'"+kontol+"'"+";";
        connect();
        try{
            stmt.executeUpdate(statement);
    }
    catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    disconnect();
        
    }
    
    public void load_database(){
    connect();
    String query  = "SELECT * FROM warehouse_table";
        try{
        rs =stmt.executeQuery(query);
        while(rs.next()){
        warehouse.add(new Warehouse(
        rs.getString("item_number"),
        rs.getString("item_name"),
        rs.getString("item_category"),
        rs.getString("item_description"),
        rs.getInt("item_quantity"),
        rs.getString("item_owner"),
        rs.getString("item_image"),
        rs.getString("item_category_selection")));
        }
        }
        catch(SQLException ex){
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);        
                }
    disconnect();
    }
    
    public void load_database_user(String user_name){
    connect();
    String query  = "SELECT * FROM warehouse_table where item_owner = ";
    query += "'"+user_name+"' " + ";";
        try{
        rs =stmt.executeQuery(query);
        while(rs.next()){
        warehouse.add(new Warehouse(
        rs.getString("item_number"),
        rs.getString("item_name"),
        rs.getString("item_category"),
        rs.getString("item_description"),
        rs.getInt("item_quantity"),
        rs.getString("item_owner"),
        rs.getString("item_image"),
        rs.getString("item_category_selection")));
        }
        }
        catch(SQLException ex){
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);        
                }
    disconnect();
    }
    
    
    
    public void load_account_database(){
    connect();
    String query = "SELECT * FROM user_table";
    try{ rs_1 = stmt.executeQuery(query);
    while(rs_1.next()){
    account.add(new user_account(
    rs_1.getString("name"),
    rs_1.getString("username"),
    rs_1.getString("password"),
    rs_1.getString("user_type"),
    rs_1.getString("user_image"),
    rs_1.getString("item_user")
    ));
    }
    
    }
     catch(SQLException ex){
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);        
                }
    }
    
    public Database(){
    detail = new item_details();
    //load_database();
    message = new input_barang();
    login = new login_form();
    }
    public void login_user_database(String user_name,String user_password,login_form login){
    connect();
    String statement = "SELECT * from user_table where ";
    statement += "username = " + "'" + user_name+"'"+" AND ";
    statement += "password = " + "'" + user_password+"'" +" ;";
    try{
            rs_1 = stmt.executeQuery(statement);
         while(rs_1.next()){
         account.add(new user_account(
         rs_1.getString("name"),
         rs_1.getString("username"),
         rs_1.getString("password"),
         rs_1.getString("user_type"),
         rs_1.getString("user_image"),
         rs_1.getString("item_user")
         ));
         }
         login.setVisible(false);
     }
    catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    disconnect();
    
    }
    
    public void delete_item(String item_name){
    String statement = "delete from warehouse_table ";
    statement += " where item_name = " + "'" + item_name+"'" + " ;";
    connect();
    try{stmt.executeUpdate(statement);}
    catch(SQLException ex){
    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
    disconnect();
    }
    

    public void create_account_database(String name,String username,String password ,
    String user_type, String user_image , String item_user){
    String statement = "INSERT INTO user_table VALUES(";
    statement += "'"+name+"'"+",";
    statement += "'"+username+"'"+",";
    statement += "'"+password+"'"+",";
    statement += "'"+user_type+"'"+",";
    statement += "'"+user_image+"'"+",";
    statement += "'"+item_user+"'"+")"+";";
    connect();
         try{
            stmt.executeUpdate(statement);
    }
    catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    disconnect();
    }
    
    public ArrayList<Warehouse> getwarehouse(){
    return warehouse;
    }
    
    public ArrayList<user_account> get_account(){
    return account;
    }
    
    
}
