/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import entities.Member;
import entities.Music;
import entities.Playlist;
import entities_DAO.MemberDAO;
import entities_DAO.MusicDAO;
import entities_DAO.PlaylistDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author t00178760
 */
public class SeeLibrary extends javax.swing.JPanel {

    /**
     * Creates new form SeeLibrary
     */
    MemberDAO memberDAO = new MemberDAO();
    Member member = new Member();
    PlaylistDAO playlistDAO = new PlaylistDAO();
    List<Playlist> playlists = new ArrayList();
    
    String tnumber ="";
    String nickname = "";
    
    public SeeLibrary() {
        initComponents();
        playlists = playlistDAO.findByMember(tnumber);
        this.setPreferredSize(new Dimension(700, 700));
        this.setBackground(Color.LIGHT_GRAY);
        
        playlists = playlistDAO.findByMember(tnumber);
        String[] listPlaylist = new String[playlists.size()];
        int i=0;
        for (Playlist playlist : playlists) {
            listPlaylist[i]=playlist.getName();
            i++;
        }
        
        
        comboBox.setModel(new javax.swing.DefaultComboBoxModel(listPlaylist));

    }
    
    public void setTnumber(String tnumberToGet){
        tnumber =tnumberToGet;
        member = memberDAO.findByTnumber(tnumber);
        nickname=member.getNickname();
        
        user_tnumber.setText(tnumber);
        username.setText(nickname);
    }
    

    
    private ComboBoxModel getComboBoxModel(){
        playlists = playlistDAO.findByMember(tnumber);
        String[] listPlaylist = new String[playlists.size()];
        int i=0;
        for (Playlist playlist : playlists) {
            listPlaylist[i]=playlist.getName();
            comboBox.addItem(listPlaylist[i]);
            i++;
        }
        
        return new DefaultComboBoxModel(listPlaylist);
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
        username = new javax.swing.JLabel();
        user_tnumber = new javax.swing.JLabel();
        libraryLabel = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        b_disconnect1 = new javax.swing.JButton();
        l_follow = new javax.swing.JLabel();
        l_nbfollow = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        b_seefollowlist = new javax.swing.JButton();
        l_followers = new javax.swing.JLabel();
        l_nbfollowers = new javax.swing.JLabel();
        b_seefollowerslist = new javax.swing.JButton();
        b_seeprofile = new javax.swing.JButton();
        b_seerecommend = new javax.swing.JButton();
        b_seelibrary = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNames = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTrack = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listArtist = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        listAlbumTitle = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listType = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        listDate = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setText("User Name");

        user_tnumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_tnumber.setText("T00000000");

        libraryLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        libraryLabel.setText("Library");

        comboBox.setModel(getComboBoxModel());
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Playlists");

        b_disconnect1.setText("Disconnect");
        b_disconnect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_disconnect1ActionPerformed(evt);
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

        jScrollPane1.setViewportView(listNames);

        jScrollPane2.setViewportView(listTrack);

        jScrollPane3.setViewportView(listArtist);

        jScrollPane4.setViewportView(listAlbumTitle);

        jLabel2.setText("Music Name");

        jLabel3.setText("Track Number");

        jLabel4.setText("Artist");

        jLabel5.setText("Album Title");

        jScrollPane6.setViewportView(listType);

        jScrollPane7.setViewportView(listDate);

        jLabel7.setText("Type Music");

        jLabel8.setText("Release date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(user_tnumber))
                            .addComponent(username)
                            .addComponent(jSeparator2)
                            .addComponent(b_seefollowerslist)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_follow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l_nbfollow))
                            .addComponent(b_disconnect1)
                            .addComponent(b_seerecommend)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l_followers)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l_nbfollowers))
                                .addComponent(b_seefollowlist))
                            .addComponent(b_seelibrary)
                            .addComponent(b_seeprofile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 159, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l_title)
                                            .addComponent(libraryLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_tnumber)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(libraryLabel))
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_seeprofile)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(b_seelibrary)
                            .addGap(11, 11, 11)
                            .addComponent(b_seerecommend)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b_disconnect1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_follow)
                    .addComponent(l_nbfollow)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_seefollowlist)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_followers)
                            .addComponent(l_nbfollowers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seefollowerslist))
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane6))
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_disconnect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_disconnect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_disconnect1ActionPerformed

    private void b_seefollowlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seefollowlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seefollowlistActionPerformed

    private void b_seefollowerslistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seefollowerslistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seefollowerslistActionPerformed

    private void b_seeprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seeprofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seeprofileActionPerformed

    private void b_seerecommendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seerecommendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seerecommendActionPerformed

    private void b_seelibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seelibraryActionPerformed
        PlaylistDAO playlistDAO = new PlaylistDAO();
        
        
        playlists = playlistDAO.findByMember(tnumber);
        String[] listPlaylist = new String[playlists.size()];
        int j=0;
        for (Playlist playlist : playlists) {
            listPlaylist[j]=playlist.getName();
            comboBox.addItem(listPlaylist[j]);
            j++;
        }
        
        comboBox.setVisible(true);
        
        /*
        List<Playlist> listPlaylists = new ArrayList<Playlist>();
        
        if (playlistDAO.findByMember(this.tnumber) != null) {
            listPlaylists = playlistDAO.findByMember(this.tnumber);
        }
        
        String[] listIDPlaylist = new String[listPlaylists.size()];
        String[] listNames = new String[listPlaylists.size()];
        String[] listDateCreation = new String[listPlaylists.size()];
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String[] listHiddens = new String[listPlaylists.size()];

        int i = 0;
        for (Playlist playlist : listPlaylists) {
            listIDPlaylist[i] = playlist.getIDPlaylist();
            listNames[i] = playlist.getName();
            Date date = playlist.getCreationDate();
            listDateCreation[i] = df.format(date);
            listHiddens[i] = Boolean.toString(playlist.isHidden());
            i++;
        }
        
        listIDs.setListData(listIDPlaylist);
        listName.setListData(listNames);
        listCreationDate.setListData(listDateCreation);
        listHidden.setListData(listHiddens);
        */
                
        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seelibraryActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
         MusicDAO musicDAO = new MusicDAO();
        
        List<Music> listMusic = new ArrayList<Music>();
        
        System.out.println("Selected Combobox\n\n");
        
        if (musicDAO.findByPlaylistID((String) comboBox.getSelectedItem()) != null) {
            listMusic = musicDAO.findByPlaylistID((String) comboBox.getSelectedItem());
        }
        
        String[] listMusicNames = new String[listMusic.size()];
        String[] listTracks = new String[listMusic.size()];
        String[] listArtists = new String[listMusic.size()];
        String[] listAlbumTitles = new String[listMusic.size()];
        String[] listTypes = new String[listMusic.size()];

        int i = 0;
        for (Music music : listMusic) {
            listMusicNames[i] = music.getTitle();
            listTracks[i] = music.getIDTrack();
            listArtists[i] = music.getArtist();
            listAlbumTitles[i] = music.getAlbumTitle();
            listTypes[i] = music.getTypeMusic();
            i++;
        }
        
        listNames.setListData(listMusicNames);
        listTrack.setListData(listTracks);
        listArtist.setListData(listArtists);
        listAlbumTitle.setListData(listAlbumTitles);
        listType.setListData(listTypes);
    }//GEN-LAST:event_comboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_disconnect1;
    public javax.swing.JButton b_seefollowerslist;
    public javax.swing.JButton b_seefollowlist;
    public javax.swing.JButton b_seelibrary;
    public javax.swing.JButton b_seeprofile;
    public javax.swing.JButton b_seerecommend;
    private javax.swing.JComboBox comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l_follow;
    private javax.swing.JLabel l_followers;
    public javax.swing.JLabel l_nbfollow;
    public javax.swing.JLabel l_nbfollowers;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JList listAlbumTitle;
    private javax.swing.JList listArtist;
    private javax.swing.JList listDate;
    private javax.swing.JList listNames;
    private javax.swing.JList listTrack;
    private javax.swing.JList listType;
    public javax.swing.JLabel user_tnumber;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
