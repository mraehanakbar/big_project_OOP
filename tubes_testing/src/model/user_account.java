/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author john_wick
 */
public class user_account {
    private String name;
    private String username;
    private String password;
    private String user_type;
    private String user_image;
    private String user_item;

    public user_account(String name, String username, String password, String user_type, String user_image, String user_item) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.user_type = user_type;
        this.user_image = user_image;
        this.user_item = user_item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getUser_item() {
        return user_item;
    }

    public void setUser_item(String user_item) {
        this.user_item = user_item;
    }

  
    
    
}
