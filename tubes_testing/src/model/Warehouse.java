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
public class Warehouse {
    private String item_number;
    private String name;
    private String kategori;
    private String description;
    private int quantity;
    private String pemilik;
    private String image_path;
    private String category_selection;

    public Warehouse(String item_number, String name, String kategori, String description, int quantity, String pemilik, String image_path
    ,String category_selection) {
        this.item_number = item_number;
        this.name = name;
        this.kategori = kategori;
        this.description = description;
        this.quantity = quantity;
        this.pemilik = pemilik;
        this.image_path = image_path;
        this.category_selection = category_selection;
    }

    public String getCategory_selection() {
        return category_selection;
    }

    public void setCategory_selection(String category_selection) {
        this.category_selection = category_selection;
    }

    public String getItem_number() {
        return item_number;
    }

    public void setItem_number(String item_number) {
        this.item_number = item_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }
    
    


    

 
    
    
    
}
