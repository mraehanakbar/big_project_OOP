/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author john_wick
 */
public class menu_app_admin extends javax.swing.JFrame {

    /**
     * Creates new form menu_app_admin
     */
    public menu_app_admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        admin_label = new javax.swing.JLabel();
        label_image_update = new javax.swing.JLabel();
        log_out_button = new javax.swing.JButton();
        add_item_button = new javax.swing.JButton();
        delete_and_update_button = new javax.swing.JButton();
        nama_label = new javax.swing.JLabel();
        user_name_label = new javax.swing.JLabel();
        create_account_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Username:");

        jLabel5.setText("Account Type: ");

        admin_label.setText("Admin");

        label_image_update.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        log_out_button.setText("Log Out");

        add_item_button.setText("Add Item");

        delete_and_update_button.setText("Delete And Update Item");

        nama_label.setText("jLabel7");

        user_name_label.setText("jLabel8");

        create_account_button.setText("Create Account");
        create_account_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_account_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(log_out_button, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add_item_button, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(delete_and_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_name_label)
                                    .addComponent(nama_label)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(admin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(create_account_button, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_image_update, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_image_update, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nama_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(user_name_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(admin_label))
                        .addGap(56, 56, 56)
                        .addComponent(create_account_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_out_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_item_button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_and_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_account_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_create_account_buttonActionPerformed

    /**
     * @param args the command line arguments
     */

    public void setNama_label(String nama_label) {
        this.nama_label.setText(nama_label);
    }

    public JButton getAdd_item_button() {
        return add_item_button;
    }

    public JButton getCreate_account_button() {
        return create_account_button;
    }

    public JButton getDelete_and_update_button() {
        return delete_and_update_button;
    }

    public JButton getLog_out_button() {
        return log_out_button;
    }

    /**
     * @param args the command line arguments
     */
    public void setUser_name_label(String user_name_label) {
        this.user_name_label.setText(user_name_label);
    }

    public void setLabel_image_update(String label_image_update) {
        this.label_image_update.setText(label_image_update);
    }
    
    public void AddActionListener(ActionListener e){
    log_out_button.addActionListener(e);
    create_account_button.addActionListener(e);
    delete_and_update_button.addActionListener(e);
    add_item_button.addActionListener(e);
    }
    
    
     public void set_image(){
        String path = label_image_update.getText();
        label_image_update.setIcon(ResizeImage(path));
    
    }

    public void setLabel_image_update(JLabel label_image_update) {
        this.label_image_update = label_image_update;
    }
    
      public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label_image_update.getWidth(), label_image_update.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
        
      }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_item_button;
    private javax.swing.JLabel admin_label;
    private javax.swing.JButton create_account_button;
    private javax.swing.JButton delete_and_update_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_image_update;
    private javax.swing.JButton log_out_button;
    private javax.swing.JLabel nama_label;
    private javax.swing.JLabel user_name_label;
    // End of variables declaration//GEN-END:variables
}