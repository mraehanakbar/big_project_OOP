/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author john_wick
 */
public class update_item extends javax.swing.JFrame {

    /**
     * Creates new form update_item
     */
    public update_item() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        item_numbertf_update = new javax.swing.JTextField();
        item_nametf_update = new javax.swing.JTextField();
        category_cmbk_update = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_ta_update = new javax.swing.JTextArea();
        pemilik_tf_update = new javax.swing.JTextField();
        label_image_update = new javax.swing.JLabel();
        upload_image_bt_update = new javax.swing.JButton();
        update_bt = new javax.swing.JButton();
        quantityspinner_1_update = new javax.swing.JSpinner();
        back_button_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("item Number");

        jLabel2.setText("Name");

        jLabel3.setText("Category");

        jLabel4.setText("Description");

        jLabel5.setText("Quantity");

        jLabel6.setText("Pemilik");

        category_cmbk_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Handphone", "Laptop", "Mesin Cuci", "Kulkas", "TV" }));

        description_ta_update.setColumns(20);
        description_ta_update.setRows(5);
        jScrollPane1.setViewportView(description_ta_update);

        label_image_update.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        upload_image_bt_update.setText("Upload image");
        upload_image_bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_image_bt_updateActionPerformed(evt);
            }
        });

        update_bt.setText("Update");

        back_button_update.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(item_numbertf_update)
                            .addComponent(item_nametf_update)
                            .addComponent(jScrollPane1)
                            .addComponent(category_cmbk_update, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pemilik_tf_update))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_image_update, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(back_button_update, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(upload_image_bt_update)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quantityspinner_1_update, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(item_numbertf_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(item_nametf_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category_cmbk_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(label_image_update, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(upload_image_bt_update)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(quantityspinner_1_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pemilik_tf_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_bt)
                    .addComponent(back_button_update))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upload_image_bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_image_bt_updateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_upload_image_bt_updateActionPerformed

    public JButton getUpload_image_bt_update() {
        return upload_image_bt_update;
    }

    /**
     * @param args the command line arguments
     */

    public void setCategory_cmbk_update(int category_cmbk_update) {
        this.category_cmbk_update.setSelectedIndex(category_cmbk_update);
    }

    public void setDescription_ta_update(String description_ta_update) {
        this.description_ta_update.setText(description_ta_update);
    }

    public void setItem_nametf_update(String item_nametf_update) {
        this.item_nametf_update.setText(item_nametf_update);
    }

    public void setItem_numbertf_update(String item_numbertf_update) {
        this.item_numbertf_update.setText(item_numbertf_update);
    }

    public void setLabel_image_update(String label_image_update) {
        this.label_image_update.setText(label_image_update);
    }

    public void setPemilik_tf_update(String pemilik_tf_update) {
        this.pemilik_tf_update.setText(pemilik_tf_update);
    }
    
    public void addActionListener(ActionListener e){
    update_bt.addActionListener(e);
    upload_image_bt_update.addActionListener(e);
    back_button_update.addActionListener(e);
    }

    public JButton getUpdate_bt() {
        return update_bt;
    }

    public String getCategory_cmbk_update() {
        int i = category_cmbk_update.getSelectedIndex();
        return category_cmbk_update.getItemAt(i);
    }

    public String getDescription_ta_update() {
        return description_ta_update.getText();
    }

    public String getItem_nametf_update() {
        return item_nametf_update.getText();
    }

    public String getItem_numbertf_update() {
        return item_numbertf_update.getText();
    }

    public String getLabel_image_update() {
        return label_image_update.getText();
    }

    public String getPemilik_tf_update() {
        return pemilik_tf_update.getText();
    }

    public void setQuantityspinner_1_update(int quantityspinner_1_update) {
        this.quantityspinner_1_update.setValue(quantityspinner_1_update);
    }

    public String getQuantityspinner_1_update() {
        return quantityspinner_1_update.getValue().toString();
    }

    public JButton getBack_button_update() {
        return back_button_update;
    }

    /**
     * @param args the command line arguments
     */
    
     public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label_image_update.getWidth(), label_image_update.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
     
     public String get_cmbk_choice() {
        int i = category_cmbk_update.getSelectedIndex();
        return Integer.toString(i);
    }
     
     public void set_image(){
     String path = label_image_update.getText();
     label_image_update.setIcon(ResizeImage(path));
     }
     
    public void upload_image(java.awt.event.ActionEvent evt){
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION){
        File selectedFile = file.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        label_image_update.setIcon(ResizeImage(path));
        String message = new String(); 
        label_image_update.setText(path);
        System.out.print(label_image_update.getText());
        }
        
        else if(result == JFileChooser.CANCEL_OPTION){
        System.out.println("no file selected");
        }
    
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button_update;
    private javax.swing.JComboBox<String> category_cmbk_update;
    private javax.swing.JTextArea description_ta_update;
    private javax.swing.JTextField item_nametf_update;
    private javax.swing.JTextField item_numbertf_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_image_update;
    private javax.swing.JTextField pemilik_tf_update;
    private javax.swing.JSpinner quantityspinner_1_update;
    private javax.swing.JButton update_bt;
    public javax.swing.JButton upload_image_bt_update;
    // End of variables declaration//GEN-END:variables
}