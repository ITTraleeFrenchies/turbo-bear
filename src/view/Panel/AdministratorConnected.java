/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import entities.Administrator;
import entities.Blocked;
import entities.Library;
import entities.Like_Music;
import entities.Like_Playlist;
import entities.Member;
import entities.Music;
import entities.Playlist;
import entities.Follow;
import entities.RecommendationMusic;
import entities.RecommendationPlaylist;
import entities_DAO.AdministratorDAO;
import entities_DAO.BlockedDAO;
import entities_DAO.FollowDAO;
import entities_DAO.FollowersDAO;
import entities_DAO.LibraryDAO;
import entities_DAO.Like_MusicDAO;
import entities_DAO.Like_PlaylistDAO;
import entities_DAO.MemberDAO;
import entities_DAO.MusicDAO;
import entities_DAO.PlaylistDAO;
import entities_DAO.RecommendationMusicDAO;
import entities_DAO.RecommendationPlaylistDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;

/**
 *
 * @author t00178764
 */
public class AdministratorConnected extends javax.swing.JPanel {

    /**
     * Creates new form AdministratorConnected
     */
    AdministratorDAO adminDAO = new AdministratorDAO();
    Administrator admin = new Administrator();
    String tnumber = "";
    String nickname = "";

    public AdministratorConnected() {
        initComponents();
        this.setPreferredSize(new Dimension(700, 700));
        this.setBackground(Color.LIGHT_GRAY);
        this.l_view.setVisible(false);
        this.jScrollPane1.setVisible(false);
        this.jScrollPane3.setVisible(false);
        this.jScrollPane4.setVisible(false);
        this.jScrollPane5.setVisible(false);
        this.jScrollPane6.setVisible(false);

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



    }

    public void setTnumberAdmin(String tnumberAdmin) {

        tnumber = tnumberAdmin;
        admin = adminDAO.findByTnumber(tnumber);
        nickname = admin.getNickname();

        l_tnumber.setText(tnumber);
        l_username.setText(nickname);
    }

    public void reinitUser() {
        admin = null;
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
        b_seemusiclikes = new javax.swing.JButton();
        b_seerecommendsmusic = new javax.swing.JButton();
        b_seefollowlists = new javax.swing.JButton();
        l_view = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl1 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl2 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl3 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl4 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl5 = new javax.swing.JList();
        b_seeplaylistlikes = new javax.swing.JButton();
        b_seerecommendsplaylist = new javax.swing.JButton();

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        l_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_username.setText("User Name");

        l_tnumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_tnumber.setText("T00000000");

        b_disconnect.setText("Disconnect");

        tf_search.setText("Enter an artist, a music, an album...");
        tf_search.setToolTipText("");
        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });

        b_search.setText("Search");

        b_seemembers.setText("Members");
        b_seemembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seemembersActionPerformed(evt);
            }
        });

        b_seeblocked.setText("See Blocked Students");
        b_seeblocked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seeblockedActionPerformed(evt);
            }
        });

        b_seelibraries.setText("Libraries");
        b_seelibraries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seelibrariesActionPerformed(evt);
            }
        });

        b_seeplaylists.setText("Playlists");
        b_seeplaylists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seeplaylistsActionPerformed(evt);
            }
        });

        b_seemusics.setText("Musics");
        b_seemusics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seemusicsActionPerformed(evt);
            }
        });

        b_seemusiclikes.setText("Music Likes");
        b_seemusiclikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seemusiclikesActionPerformed(evt);
            }
        });

        b_seerecommendsmusic.setText("Recommendations Music");
        b_seerecommendsmusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seerecommendsmusicActionPerformed(evt);
            }
        });

        b_seefollowlists.setText("See Follow Lists");
        b_seefollowlists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seefollowlistsActionPerformed(evt);
            }
        });

        l_view.setText("jLabel1");

        jScrollPane1.setViewportView(jl1);

        jScrollPane3.setViewportView(jl2);

        jScrollPane4.setViewportView(jl3);

        jScrollPane5.setViewportView(jl4);

        jScrollPane6.setViewportView(jl5);

        b_seeplaylistlikes.setText("Playlist Likes");
        b_seeplaylistlikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seeplaylistlikesActionPerformed(evt);
            }
        });

        b_seerecommendsplaylist.setText("Recommendations Playlist");
        b_seerecommendsplaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seerecommendsplaylistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(280, Short.MAX_VALUE)
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
                            .addComponent(b_seemusiclikes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seerecommendsmusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seefollowlists, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seeplaylistlikes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_seerecommendsplaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_view)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_tnumber)
                    .addComponent(l_view))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_disconnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(b_seemusiclikes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seeplaylistlikes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seerecommendsmusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seerecommendsplaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seefollowlists)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_seeblocked)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_seemembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seemembersActionPerformed
        l_view.setText("Members");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        MemberDAO memberDAO = new MemberDAO();
        List<Member> listMembers = null;
        if (memberDAO.findAll() != null) {
            listMembers = memberDAO.findAll();
        }
        /*    String Newligne = System.getProperty("line.separator");
         String allContent = "";
         allContent += "TNUMBER" + " - " + "PASSWORD" + " - " + "NICKNAME" + " - " + "EMAIL" + " - " + "FIRSTNAME"
         + " - " + "SURNAME" + " - " + "STREET" + " - " + "CITY";
         allContent += Newligne;*/
        String[] listTnumbers = new String[listMembers.size()];
        String[] listPassword = new String[listMembers.size()];
        String[] listNickname = new String[listMembers.size()];
        String[] listEmail = new String[listMembers.size()];
        String[] listFirstname = new String[listMembers.size()];

        int i = 0;
        for (Member member : listMembers) {
            listTnumbers[i] = member.getTnumber();
            listPassword[i] = member.getPassword();
            listNickname[i] = member.getNickname();
            listEmail[i] = member.getEmail_addr();
            listFirstname[i] = member.getFirstname();

            /* allContent += member.getTnumber() + " - " + member.getPassword() + " - " + member.getNickname() + " - " + member.getEmail_addr();
             allContent += " - " + member.getFirstname() + " - " + member.getSurname() + " - " + member.getStreet() + " - " + member.getCity();
             allContent += Newligne;*/
            i++;
        }
        /* l1.setText("TNUMBER");
         l2.setText("PASSWORD");
         l3.setText("NICKNAME");
         l4.setText("EMAIL");
         l5.setText("FIRST NAME");
        
         this.l1.setVisible(true);
         this.l2.setVisible(true);
         this.l3.setVisible(true);
         this.l4.setVisible(true);
         this.l5.setVisible(true);*/

        jl1.setListData(listTnumbers);
        jl2.setListData(listPassword);
        jl3.setListData(listNickname);
        jl4.setListData(listEmail);
        jl5.setListData(listFirstname);


        //  jt_content.append(allContent + "\n");
      /*  jt_content.setVisible(false);
         jt_content.validate();
         jt_content.updateUI();
         */
        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seemembersActionPerformed

    private void b_seelibrariesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seelibrariesActionPerformed
        l_view.setText("Libraries");
        l_view.setVisible(true);
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        LibraryDAO libraryDAO = new LibraryDAO();
        List<Library> listLibrary = null;
        if (libraryDAO.findAll() != null) {
            listLibrary = libraryDAO.findAll();
        }

        String[] listIDLibrary = new String[listLibrary.size()];
        String[] listMember = new String[listLibrary.size()];
        String[] listName = new String[listLibrary.size()];

        int i = 0;
        for (Library library : listLibrary) {
            listIDLibrary[i] = String.valueOf(library.getId_library());
            listMember[i] = library.getMember();
            listName[i] = library.getName();

            i++;
        }
        jl1.setListData(listIDLibrary);
        jl2.setListData(listMember);
        jl3.setListData(listName);
        this.jScrollPane5.setVisible(false);
        this.jScrollPane6.setVisible(false);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seelibrariesActionPerformed

    private void b_seeplaylistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seeplaylistsActionPerformed
        l_view.setText("Playlists");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        PlaylistDAO playlistDAO = new PlaylistDAO();
        List<Playlist> listPlaylist = null;
        if (playlistDAO.findAll() != null) {
            listPlaylist = playlistDAO.findAll();
        }

        String[] listIDPlaylist = new String[listPlaylist.size()];
        String[] listIDLibrary = new String[listPlaylist.size()];
        String[] listName = new String[listPlaylist.size()];
        String[] listDateCreation = new String[listPlaylist.size()];
        String[] listHidden = new String[listPlaylist.size()];

        int i = 0;
        for (Playlist playlist : listPlaylist) {
            listIDPlaylist[i] = playlist.getIDPlaylist();
            listIDLibrary[i] = String.valueOf(playlist.getIDLibrary());
            listName[i] = playlist.getName();
            listDateCreation[i] = String.valueOf(playlist.getCreationDate());
            listHidden[i] = String.valueOf(playlist.isHidden());

            i++;
        }
        jl1.setListData(listIDPlaylist);
        jl2.setListData(listIDLibrary);
        jl3.setListData(listName);
        jl4.setListData(listDateCreation);
        jl5.setListData(listHidden);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seeplaylistsActionPerformed

    private void b_seemusicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seemusicsActionPerformed
        l_view.setText("Musics");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        MusicDAO musicDAO = new MusicDAO();
        List<Music> listMusic = null;
        if (musicDAO.findAll() != null) {
            listMusic = musicDAO.findAll();
        }

        String[] listIDTrack = new String[listMusic.size()];
        String[] listIDPlaylist = new String[listMusic.size()];
        String[] listTitle = new String[listMusic.size()];
        String[] listTrackNumber = new String[listMusic.size()];
        String[] listArtist = new String[listMusic.size()];

        int i = 0;
        for (Music music : listMusic) {
            listIDTrack[i] = String.valueOf(music.getIDTrack());
            listIDPlaylist[i] = music.getIDPlaylist();
            listTitle[i] = music.getTitle();
            listTrackNumber[i] = String.valueOf(music.getTrackNumber());
            listArtist[i] = music.getArtist();

            i++;
        }
        jl1.setListData(listIDTrack);
        jl2.setListData(listIDPlaylist);
        jl3.setListData(listTitle);
        jl4.setListData(listTrackNumber);
        jl5.setListData(listArtist);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seemusicsActionPerformed

    private void b_seemusiclikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seemusiclikesActionPerformed
        l_view.setText("Music Likes");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        Like_MusicDAO like_musicDAO = new Like_MusicDAO();
        List<Like_Music> listLike_Music = null;
        if (like_musicDAO.findAll() != null) {
            listLike_Music = like_musicDAO.findAll();
        }

        String[] listIDLikelist = new String[listLike_Music.size()];
        String[] listTnumber = new String[listLike_Music.size()];
        String[] listIDMusic = new String[listLike_Music.size()];
        String[] listDateCreation = new String[listLike_Music.size()];

        int i = 0;
        for (Like_Music like_Music : listLike_Music) {
            listIDLikelist[i] = String.valueOf(like_Music.getId_likelist());
            listTnumber[i] = like_Music.getTNumber();
            listIDMusic[i] = like_Music.getId_music();
            listDateCreation[i] = String.valueOf(like_Music.getDate_creation());

            i++;
        }
        jl1.setListData(listIDLikelist);
        jl2.setListData(listTnumber);
        jl3.setListData(listIDMusic);
        jl4.setListData(listDateCreation);
        this.jScrollPane6.setVisible(false);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seemusiclikesActionPerformed

    private void b_seeplaylistlikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seeplaylistlikesActionPerformed
        l_view.setText("Playlist Likes");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        Like_PlaylistDAO like_playlistDAO = new Like_PlaylistDAO();
        List<Like_Playlist> listLike_Playlist = null;
        if (like_playlistDAO.findAll() != null) {
            listLike_Playlist = like_playlistDAO.findAll();
        }

        String[] listIDLikelist = new String[listLike_Playlist.size()];
        String[] listTnumber = new String[listLike_Playlist.size()];
        String[] listIDPlaylist = new String[listLike_Playlist.size()];
        String[] listDateCreation = new String[listLike_Playlist.size()];

        int i = 0;
        for (Like_Playlist like_Playlist : listLike_Playlist) {
            listIDLikelist[i] = String.valueOf(like_Playlist.getId_likelist());
            listTnumber[i] = like_Playlist.getTNumber();
            listIDPlaylist[i] = like_Playlist.getId_playlist();
            listDateCreation[i] = String.valueOf(like_Playlist.getDate_creation());

            i++;
        }
        jl1.setListData(listIDLikelist);
        jl2.setListData(listTnumber);
        jl3.setListData(listIDPlaylist);
        jl4.setListData(listDateCreation);
        this.jScrollPane6.setVisible(false);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seeplaylistlikesActionPerformed

    private void b_seerecommendsmusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seerecommendsmusicActionPerformed
        l_view.setText("Recommendations music");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        RecommendationMusicDAO recommendationMusicDAO = new RecommendationMusicDAO();
        List<RecommendationMusic> listRecommendationMusic = null;
        if (recommendationMusicDAO.findAll() != null) {
            listRecommendationMusic = recommendationMusicDAO.findAll();
        }

        String[] listIDRecommend = new String[listRecommendationMusic.size()];
        String[] listIDMusic = new String[listRecommendationMusic.size()];
        String[] listDateRecommend = new String[listRecommendationMusic.size()];

        int i = 0;
        for (RecommendationMusic recommendationMusic : listRecommendationMusic) {
            listIDRecommend[i] = String.valueOf(recommendationMusic.getIDRecommendation());
            listIDMusic[i] = recommendationMusic.getIDMusic();
            listDateRecommend[i] = String.valueOf(recommendationMusic.getDateRecommend());

            i++;
        }
        jl1.setListData(listIDRecommend);
        jl2.setListData(listIDMusic);
        jl3.setListData(listDateRecommend);
        this.jScrollPane5.setVisible(false);
        this.jScrollPane6.setVisible(false);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seerecommendsmusicActionPerformed

    private void b_seerecommendsplaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seerecommendsplaylistActionPerformed
        l_view.setText("Recommendation playlist");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);


        RecommendationPlaylistDAO recommendationPlaylistDAO = new RecommendationPlaylistDAO();
        List<RecommendationPlaylist> listRecommendationPlaylist = null;
        if (recommendationPlaylistDAO.findAll() != null) {
            listRecommendationPlaylist = recommendationPlaylistDAO.findAll();
        }

        String[] listIDRecommend = new String[listRecommendationPlaylist.size()];
        String[] listIDPlaylist = new String[listRecommendationPlaylist.size()];
        String[] listDateRecommend = new String[listRecommendationPlaylist.size()];

        int i = 0;
        for (RecommendationPlaylist recommendationPlaylist : listRecommendationPlaylist) {
            listIDRecommend[i] = String.valueOf(recommendationPlaylist.getIDRecommendation());
            listIDPlaylist[i] = recommendationPlaylist.getIDPlaylist();
            listDateRecommend[i] = String.valueOf(recommendationPlaylist.getDateRecommend());

            i++;
        }
        jl1.setListData(listIDRecommend);
        jl2.setListData(listIDPlaylist);
        jl3.setListData(listDateRecommend);
        this.jScrollPane5.setVisible(false);
        this.jScrollPane6.setVisible(false);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seerecommendsplaylistActionPerformed

    private void b_seefollowlistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seefollowlistsActionPerformed
        l_view.setText("Follow Lists");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        FollowDAO followDAO = new FollowDAO();
        List<Follow> listFollow = null;
        if (followDAO.findAll() != null) {
            listFollow = followDAO.findAll();
        }

        String[] listIDFollowList = new String[listFollow.size()];
        String[] listTnumber = new String[listFollow.size()];
        String[] listNicknameFollowed = new String[listFollow.size()];

        int i = 0;
        for (Follow follow : listFollow) {
            listIDFollowList[i] = String.valueOf(follow.getIDFollowlist());
            listTnumber[i] = follow.getTnumber();
            listNicknameFollowed[i] = follow.getNicknameFollowed();

            i++;
        }
        jl1.setListData(listIDFollowList);
        jl2.setListData(listTnumber);
        jl3.setListData(listNicknameFollowed);
        this.jScrollPane5.setVisible(false);
        this.jScrollPane6.setVisible(false);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seefollowlistsActionPerformed

    private void b_seeblockedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seeblockedActionPerformed
        l_view.setText("Users blocked");
        l_view.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(true);
        jScrollPane6.setVisible(true);

        BlockedDAO blockedDAO = new BlockedDAO();
        List<Blocked> listBlocked = null;
        if (blockedDAO.findAll() != null) {
            listBlocked = blockedDAO.findAll();
        }

        String[] listIDBlocked = new String[listBlocked.size()];
        String[] listTnumber_admin = new String[listBlocked.size()];
        String[] listTnumber_user = new String[listBlocked.size()];

        int i = 0;
        for (Blocked blocked : listBlocked) {
            listIDBlocked[i] = String.valueOf(blocked.get_id_blocked());
            listTnumber_admin[i] = blocked.get_tNumber_admin();
            System.out.println(blocked.get_tNumber_user());
            listTnumber_user[i] = blocked.get_tNumber_user();
            System.out.println(blocked.get_tNumber_user());
            i++;
        }
        jl1.setListData(listIDBlocked);
        jl2.setListData(listTnumber_admin);
        jl3.setListData(listTnumber_user);
        this.jScrollPane5.setVisible(false);
        this.jScrollPane6.setVisible(false);

        this.invalidate();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_b_seeblockedActionPerformed

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed
        tf_search.setText("");
    }//GEN-LAST:event_tf_searchActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_disconnect;
    public javax.swing.JButton b_search;
    public javax.swing.JButton b_seeblocked;
    public javax.swing.JButton b_seefollowlists;
    public javax.swing.JButton b_seelibraries;
    public javax.swing.JButton b_seemembers;
    public javax.swing.JButton b_seemusiclikes;
    public javax.swing.JButton b_seemusics;
    public javax.swing.JButton b_seeplaylistlikes;
    public javax.swing.JButton b_seeplaylists;
    public javax.swing.JButton b_seerecommendsmusic;
    public javax.swing.JButton b_seerecommendsplaylist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JList jl1;
    public javax.swing.JList jl2;
    public javax.swing.JList jl3;
    public javax.swing.JList jl4;
    public javax.swing.JList jl5;
    private javax.swing.JLabel l_title;
    public javax.swing.JLabel l_tnumber;
    public javax.swing.JLabel l_username;
    public javax.swing.JLabel l_view;
    public javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
