/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class CuaSoChao extends javax.swing.JDialog {

    /**
     * Creates new form CuaSoChao
     */
    public CuaSoChao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImage = new javax.swing.JLabel();
        pgbLoading = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/ManHinhChao.png"))); // NOI18N

        pgbLoading.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pgbLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblImage)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImage;
    private javax.swing.JProgressBar pgbLoading;
    // End of variables declaration//GEN-END:variables


    private void init(){
                setLocationRelativeTo(null);

        //cài đặt thời gian chạy cửa sổ, 10 mili giây
        new Timer(20, new ActionListener() {
            @Override
            //cứ 10 mili giây sẽ gọi hàm actionPerformed 1 lần
            public void actionPerformed(ActionEvent ae) {
               //lấy giá trị của progress    
               int value = pgbLoading.getValue();
               if(value < pgbLoading.getMaximum()){
                   //tang gia tri cura progress bar len
                   pgbLoading.setValue(value + 1);
               }
               else{
                  CuaSoChao.this.dispose();
               }
            }
        }).start();
        
       
        
    }

}
