/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Panel;

import entities.Member;
import entities_DAO.FollowDAO;
import entities_DAO.FollowersDAO;
import entities_DAO.MemberDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author t00178764
 */
public class UserConnected extends javax.swing.JPanel {

    /**
     * Creates new form UserConnected
     */
    MemberDAO memberDAO = new MemberDAO();
    Member member = new Member();
    
    FollowDAO followDAO = new FollowDAO();
    FollowersDAO followersDAO = new FollowersDAO();
    
    String tnumber = "";
    String nickname="";
    int nbfollowers=0;
    int nbfollow=0;
    
    public UserConnected() {
        initComponents();
        this.setPreferredSize(new Dimension(700,700));
        this.setBackground(Color.LIGHT_GRAY);
        
        // ========== FOR THE IMAGE =============
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src/Ressources/rsz_profile_image.png"));
        } catch (IOException ex) {
            Logger.getLogger(UserConnected.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon icon = new ImageIcon(img);
        JLabel label = new JLabel(icon);

        label.setBounds(-5, -5, 233, 216);
        this.add(label);
        
             tf_search.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tf_search.setText("");
            }
        });
    }
    
    public void setTnumber(String tnumberToCreate){
                
        tnumber = tnumberToCreate;
        member = memberDAO.findByTnumber(tnumber);
        nickname=member.getNickname();
        nbfollowers=followersDAO.count(tnumber);
        nbfollow=followDAO.count(tnumber);
        
        l_tnumber1.setText(tnumber);
        l_nickname.setText(nickname);
        l_nbfollowers.setText(String.valueOf(nbfollowers));
        l_nbfollow.setText(String.valueOf(nbfollow));
        
        
    }
    
    public void reinitUser(){
        member = null;
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
        tf_search = new javax.swing.JTextField();
        b_search = new javax.swing.JButton();
        l_news = new javax.swing.JLabel();
        l_nickname = new javax.swing.JLabel();
        l_tnumber1 = new javax.swing.JLabel();
        b_seeprofile = new javax.swing.JButton();
        b_seerecommend = new javax.swing.JButton();
        b_seelibrary = new javax.swing.JButton();
        b_disconnect = new javax.swing.JButton();
        l_follow = new javax.swing.JLabel();
        l_nbfollow = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        b_seefollowlist = new javax.swing.JButton();
        l_followers = new javax.swing.JLabel();
        l_nbfollowers = new javax.swing.JLabel();
        b_seefollowerslist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_newsFeed = new javax.swing.JTextArea();

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        tf_search.setText("Enter an artist, a music, an album...");
        tf_search.setToolTipText("");
        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });

        b_search.setText("Search");

        l_news.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_news.setText("News Feed");

        l_nickname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_nickname.setText("Nick name");

        l_tnumber1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_tnumber1.setText("T00000000");

        b_seeprofile.setText("See my profile");
        b_seeprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seeprofileActionPerformed(evt);
            }
        });

        b_seerecommend.setText("See my recommendations");
        b_seerecommend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seerecommendActionPerformed(evt);
            }
        });

        b_seelibrary.setText("See my library");
        b_seelibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seelibraryActionPerformed(evt);
            }
        });

        b_disconnect.setText("Disconnect");
        b_disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_disconnectActionPerformed(evt);
            }
        });

        l_follow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_follow.setText("Your follow list");

        l_nbfollow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_nbfollow.setText("0");

        b_seefollowlist.setText("See My Follow List");
        b_seefollowlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seefollowlistActionPerformed(evt);
            }
        });

        l_followers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_followers.setText("Followers");

        l_nbfollowers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_nbfollowers.setText("0");

        b_seefollowerslist.setText("See My Followers");
        b_seefollowerslist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seefollowerslistActionPerformed(evt);
            }
        });

        jt_newsFeed.setEditable(false);
        jt_newsFeed.setColumns(20);
        jt_newsFeed.setRows(5);
        jScrollPane1.setViewportView(jt_newsFeed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(l_tnumber1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_news)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(l_title)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b_search)
                                    .addGap(26, 26, 26)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b_seefollowerslist)
                                            .addComponent(b_disconnect)
                                            .addComponent(b_seerecommend)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(l_followers, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(b_seefollowlist))
                                            .addComponent(b_seelibrary)
                                            .addComponent(b_seeprofile)
                                            .addComponent(l_nickname))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(l_nbfollowers))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l_follow)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(l_nbfollow)))
                                .addGap(38, 38, 38)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_title)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_search))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_news)
                    .addComponent(l_tnumber1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_nickname)
                        .addGap(18, 18, 18)
                        .addComponent(b_seeprofile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seelibrary)
                        .addGap(11, 11, 11)
                        .addComponent(b_seerecommend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_disconnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_follow)
                            .addComponent(l_nbfollow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seefollowlist)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_followers)
                            .addComponent(l_nbfollowers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seefollowerslist))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_searchActionPerformed

    private void b_seeprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seeprofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seeprofileActionPerformed

    private void b_seelibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seelibraryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seelibraryActionPerformed

    private void b_seerecommendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seerecommendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seerecommendActionPerformed

    private void b_disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_disconnectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_disconnectActionPerformed

    private void b_seefollowlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seefollowlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seefollowlistActionPerformed

    private void b_seefollowerslistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seefollowerslistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seefollowerslistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_disconnect;
    public javax.swing.JButton b_search;
    public javax.swing.JButton b_seefollowerslist;
    public javax.swing.JButton b_seefollowlist;
    public javax.swing.JButton b_seelibrary;
    public javax.swing.JButton b_seeprofile;
    public javax.swing.JButton b_seerecommend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jt_newsFeed;
    private javax.swing.JLabel l_follow;
    private javax.swing.JLabel l_followers;
    public javax.swing.JLabel l_nbfollow;
    public javax.swing.JLabel l_nbfollowers;
    private javax.swing.JLabel l_news;
    public javax.swing.JLabel l_nickname;
    private javax.swing.JLabel l_title;
    public javax.swing.JLabel l_tnumber1;
    public javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
