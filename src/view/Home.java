/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author t00178747
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setPreferredSize(new Dimension(700, 700));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
/*        g.setColor(Color.CYAN);
        g.fillOval(0, 0, 30, 30);
        g.drawOval(0, 50, 30, 30);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_title = new javax.swing.JLabel();
        l_tnumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b_login = new javax.swing.JButton();
        t_tnumber = new javax.swing.JTextField();
        t_password = new javax.swing.JTextField();
        l_noAccount = new javax.swing.JLabel();
        l_forgot = new javax.swing.JLabel();
        b_subscribe = new javax.swing.JButton();
        b_retrieve = new javax.swing.JButton();

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        l_tnumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tnumber.setText("Login(T-Number :) ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Password : ");

        b_login.setText("Log in");

        l_noAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_noAccount.setText("No account yet ?");

        l_forgot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_forgot.setText("Forgot password ?");

        b_subscribe.setText("susbscribe");
        b_subscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_subscribeActionPerformed(evt);
            }
        });

        b_retrieve.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_tnumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_tnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_noAccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_subscribe))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_forgot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_retrieve))))
                    .addComponent(l_title))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_login)
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(l_title)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_tnumber)
                    .addComponent(t_tnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_noAccount)
                    .addComponent(b_subscribe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_forgot)
                    .addComponent(b_retrieve))
                .addGap(3, 3, 3)
                .addComponent(b_login)
                .addContainerGap(372, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_subscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_subscribeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_subscribeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_login;
    private javax.swing.JButton b_retrieve;
    private javax.swing.JButton b_subscribe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l_forgot;
    private javax.swing.JLabel l_noAccount;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel l_tnumber;
    private javax.swing.JTextField t_password;
    private javax.swing.JTextField t_tnumber;
    // End of variables declaration//GEN-END:variables
}
