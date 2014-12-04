/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author t00178764
 */
public class AdministratorConnected extends javax.swing.JPanel {

    /**
     * Creates new form AdministratorConnected
     */
    public AdministratorConnected() {
        initComponents();
        this.setPreferredSize(new Dimension(700,700));
        this.setBackground(Color.LIGHT_GRAY);
        this.l_view.setVisible(false);
        this.ta_view.setVisible(false);
        
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
        
                b_seemembers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Members");
               l_view.setVisible(true);
            }
    });
        b_seelibraries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Libraries");
               l_view.setVisible(true);
            }
    });
        b_seeplaylists.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Playlists");
               l_view.setVisible(true);
            }
    }); 
        b_seemusics.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Musics");
               l_view.setVisible(true);
            }
    });  
        b_seelikes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Likes");
               l_view.setVisible(true);
            }
    });  
        b_seerecommends.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Recommendations");
               l_view.setVisible(true);
            }
    });
        b_seefollowlists.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Follow Lists");
               l_view.setVisible(true);
            }
    });  
        b_seeblocked.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               l_view.setText("Users blocked");
               l_view.setVisible(true);
            }
    }); 
        
                tf_search.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tf_search.setText("");
            }
        });
        
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
        l_username = new javax.swing.JLabel();
        l_tnumber = new javax.swing.JLabel();
        b_disconnect = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        b_search = new javax.swing.JButton();
        b_seemembers = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        b_seeblocked = new javax.swing.JButton();
        b_seelibraries = new javax.swing.JButton();
        b_seeplaylists = new javax.swing.JButton();
        b_seemusics = new javax.swing.JButton();
        b_seelikes = new javax.swing.JButton();
        b_seerecommends = new javax.swing.JButton();
        b_seefollowlists = new javax.swing.JButton();
        l_view = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_view = new javax.swing.JTextArea();

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        l_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_username.setText("User Name");

        l_tnumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_tnumber.setText("T00000000");

        b_disconnect.setText("Disconnect");

        tf_search.setText("Enter an artist, a music, an album...");
        tf_search.setToolTipText("");

        b_search.setText("Search");

        b_seemembers.setText("See Members");

        b_seeblocked.setText("See Blocked Students");

        b_seelibraries.setText("See Libraries");

        b_seeplaylists.setText("See Playlists");

        b_seemusics.setText("See Musics");

        b_seelikes.setText("See Likes");

        b_seerecommends.setText("See Recommendations");

        b_seefollowlists.setText("See Follow Lists");

        l_view.setText("jLabel1");

        ta_view.setColumns(20);
        ta_view.setRows(5);
        jScrollPane2.setViewportView(ta_view);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(271, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_title, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_search))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_seemusics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seemembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_disconnect)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(l_tnumber))
                            .addComponent(l_username)
                            .addComponent(jSeparator1)
                            .addComponent(b_seeplaylists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seelibraries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seeblocked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seelikes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seerecommends, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seefollowlists, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_view)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_title)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_search))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_tnumber)
                        .addGap(18, 18, 18)
                        .addComponent(l_username)
                        .addGap(18, 18, 18)
                        .addComponent(b_disconnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_seemembers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seelibraries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seeplaylists)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seemusics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seelikes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seerecommends)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seefollowlists)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seeblocked))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_disconnect;
    public javax.swing.JButton b_search;
    public javax.swing.JButton b_seeblocked;
    public javax.swing.JButton b_seefollowlists;
    public javax.swing.JButton b_seelibraries;
    public javax.swing.JButton b_seelikes;
    public javax.swing.JButton b_seemembers;
    public javax.swing.JButton b_seemusics;
    public javax.swing.JButton b_seeplaylists;
    public javax.swing.JButton b_seerecommends;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l_title;
    public javax.swing.JLabel l_tnumber;
    public javax.swing.JLabel l_username;
    public javax.swing.JLabel l_view;
    public javax.swing.JTextArea ta_view;
    public javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
