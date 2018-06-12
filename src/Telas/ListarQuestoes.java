/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import bancodequestoes2.DataQuestions;
import bancodequestoes2.DAOFactory;
import bancodequestoes2.InfoSoftware;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Carlos
 */
public class ListarQuestoes extends javax.swing.JFrame {
        
    /**
     * Creates new form Arquivo
     */
    public ListarQuestoes(String pesquisa) {
        initComponents();
        JTableHeader header = jTblInfoQuestoes.getTableHeader();
        header.setBackground(new Color(45,118,232));
        header.setForeground(new Color(45,118,232));
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jCampoPesquisa.setText(pesquisa);
        jLabel5.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLblPesquisar = new javax.swing.JLabel();
        jCampoPesquisa = new javax.swing.JTextField();
        jBtnProva = new javax.swing.JButton();
        jPnlBar = new javax.swing.JPanel();
        jLblexit = new javax.swing.JLabel();
        jLblVoltar = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLblResetarPesquisa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblInfoQuestoes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arquivo");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1040, 680));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1040, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1040, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 640));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(45, 118, 232));
        jSeparator1.setForeground(new java.awt.Color(45, 118, 232));

        jLblPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jLblPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_26px.png"))); // NOI18N
        jLblPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblPesquisarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblPesquisarMousePressed(evt);
            }
        });

        jCampoPesquisa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCampoPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        jCampoPesquisa.setText("Digite");
        jCampoPesquisa.setToolTipText("");
        jCampoPesquisa.setBorder(null);
        jCampoPesquisa.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jCampoPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCampoPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCampoPesquisaFocusLost(evt);
            }
        });
        jCampoPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCampoPesquisaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCampoPesquisaMouseExited(evt);
            }
        });
        jCampoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoPesquisaActionPerformed(evt);
            }
        });
        jCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCampoPesquisaKeyPressed(evt);
            }
        });

        jBtnProva.setBackground(new java.awt.Color(45, 118, 232));
        jBtnProva.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBtnProva.setForeground(new java.awt.Color(255, 0, 0));
        jBtnProva.setText("Prova");
        jBtnProva.setAlignmentX(0.5F);
        jBtnProva.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(45, 118, 232)));
        jBtnProva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProvaActionPerformed(evt);
            }
        });

        jPnlBar.setBackground(new java.awt.Color(45, 118, 232));
        jPnlBar.setPreferredSize(new java.awt.Dimension(67, 26));
        jPnlBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPnlBarMouseDragged(evt);
            }
        });
        jPnlBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlBarMousePressed(evt);
            }
        });
        jPnlBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblexit.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLblexit.setForeground(new java.awt.Color(255, 255, 255));
        jLblexit.setText("-");
        jLblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblexitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblexitMousePressed(evt);
            }
        });
        jPnlBar.add(jLblexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 20));

        jLblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_Arrow_32px.png"))); // NOI18N
        jLblVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblVoltarMouseClicked(evt);
            }
        });
        jPnlBar.add(jLblVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        exit.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPnlBar.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 0, 30, -1));

        jLblResetarPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblResetarPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_26px.png"))); // NOI18N
        jLblResetarPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblResetarPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblResetarPesquisaMousePressed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);

        jTblInfoQuestoes.setForeground(new java.awt.Color(45, 118, 232));
        jTblInfoQuestoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Disciplina", "Enunciado", "Tipo", "Tema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblInfoQuestoes.setGridColor(new java.awt.Color(255, 255, 255));
        jTblInfoQuestoes.setSelectionBackground(new java.awt.Color(45, 118, 232));
        jTblInfoQuestoes.setShowHorizontalLines(false);
        jTblInfoQuestoes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTblInfoQuestoes);
        if (jTblInfoQuestoes.getColumnModel().getColumnCount() > 0) {
            jTblInfoQuestoes.getColumnModel().getColumn(0).setMinWidth(0);
            jTblInfoQuestoes.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTblInfoQuestoes.getColumnModel().getColumn(0).setMaxWidth(0);
            jTblInfoQuestoes.getColumnModel().getColumn(1).setMinWidth(200);
            jTblInfoQuestoes.getColumnModel().getColumn(1).setMaxWidth(200);
            jTblInfoQuestoes.getColumnModel().getColumn(3).setMinWidth(150);
            jTblInfoQuestoes.getColumnModel().getColumn(3).setMaxWidth(150);
            jTblInfoQuestoes.getColumnModel().getColumn(4).setMinWidth(150);
            jTblInfoQuestoes.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 118, 232));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Plus_Math_26px.png"))); // NOI18N
        jLabel4.setText("Adicionar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Edit_26px_2.png"))); // NOI18N
        jLabel5.setText("Editar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 118, 232));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_26px.png"))); // NOI18N
        jLabel8.setText("Remover");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(45, 118, 232));
        jButton2.setText("Temas");
        jButton2.setEnabled(false);

        jButton3.setBackground(new java.awt.Color(45, 118, 232));
        jButton3.setText("Disciplinas");
        jButton3.setEnabled(false);

        jButton4.setBackground(new java.awt.Color(45, 118, 232));
        jButton4.setText("Tipo");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(45, 118, 232));
        jButton6.setText("Mais Filtros");
        jButton6.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBtnProva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLblResetarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLblPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(658, 658, 658)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPnlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblResetarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLblPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnProva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton6)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCampoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoPesquisaActionPerformed

    private void jCampoPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCampoPesquisaMouseClicked
        jCampoPesquisa.setText("");
    }//GEN-LAST:event_jCampoPesquisaMouseClicked

    private void jCampoPesquisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCampoPesquisaMouseExited
        
    }//GEN-LAST:event_jCampoPesquisaMouseExited

    private void jBtnProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProvaActionPerformed
        // TODO add your handling code here:
        if(!InfoSoftware.questoesProvas.isEmpty()){
            try {//Tempo para abrir
                Thread.sleep(500); //1 s
            } catch (InterruptedException ex) {
            }
            ProvaAtual bd = new ProvaAtual();
           bd.setVisible(true);
           bd.pack();
           bd.setLocationRelativeTo(null);
           bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma questão foi adicionada à prova!");
        }
    }//GEN-LAST:event_jBtnProvaActionPerformed

    private void jCampoPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCampoPesquisaFocusGained
        jCampoPesquisa.setText(""); 
    }//GEN-LAST:event_jCampoPesquisaFocusGained

    private void jCampoPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCampoPesquisaFocusLost
         jCampoPesquisa.setText("Digite");
    }//GEN-LAST:event_jCampoPesquisaFocusLost

    private void jLblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblVoltarMouseClicked
        //Retornar ao menu principal
        Principal pp = new Principal();
        pp.setVisible(true);
        pp.pack();
        pp.setLocationRelativeTo(null);
        pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLblVoltarMouseClicked

    private void jLblexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblexitMousePressed
        this.setState(Frame.ICONIFIED);//MINIMIZANDO TELA PRINCIPAL
    }//GEN-LAST:event_jLblexitMousePressed

    private void jLblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblexitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLblexitMouseClicked
    int xx,xy;
    private void jPnlBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlBarMousePressed
      xx = evt.getX();
      xy = evt.getY();
    }//GEN-LAST:event_jPnlBarMousePressed

    private void jPnlBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlBarMouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x-xx,y-xy);      
    }//GEN-LAST:event_jPnlBarMouseDragged

    private void jLblResetarPesquisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblResetarPesquisaMousePressed
        // TODO add your handling code here:
        if(jCampoPesquisa.getText() != "Digite" || jCampoPesquisa.getText() != ""){
            jCampoPesquisa.setText("");
        }
    }//GEN-LAST:event_jLblResetarPesquisaMousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLblPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblPesquisarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLblPesquisarMouseClicked

    private void jLblPesquisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblPesquisarMousePressed
        // TODO add your handling code here:
        pesquisar();
    }//GEN-LAST:event_jLblPesquisarMousePressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyTyped
    
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        int[] linhas = jTblInfoQuestoes.getSelectedRows();
        if(linhas.length != 0){
            for(int i = 0; i < linhas.length; i++){
                if(!InfoSoftware.questoesProvas.contains(jTblInfoQuestoes.getValueAt(linhas[i], 0)))
                    InfoSoftware.questoesProvas.add((Integer) jTblInfoQuestoes.getValueAt(linhas[i], 0));
            }
            
            JOptionPane.showMessageDialog(null, "Questões adicionadas com sucesso!");
            InfoSoftware.salvou = false;
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma questão foi selecionada!");
        }
        for (Integer questoesProva : InfoSoftware.questoesProvas) {
            System.out.println(questoesProva);
        }
    }//GEN-LAST:event_jLabel4MousePressed
    ArrayList<Integer> questoesRemover = new ArrayList();
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        int[] linhas = jTblInfoQuestoes.getSelectedRows();
        if(linhas.length != 0){
            int continuar = 1;
            continuar = JOptionPane.showConfirmDialog(null, "Essa ação irá deletar permanentemente os dados selecionados do banco!\nTem certeza que deseja continuar?");
            if(continuar == 0){
                for(int i = 0; i < linhas.length; i++){
                    if(!questoesRemover.contains(jTblInfoQuestoes.getValueAt(linhas[i], 0)))
                        questoesRemover.add((Integer) jTblInfoQuestoes.getValueAt(linhas[i], 0));
                }
                for(int i = 0; i < questoesRemover.size(); i++){
                    DAOFactory.deleteAlternativas("alternativa1", questoesRemover.get(i));
                    DAOFactory.deleteAlternativas("alternativa2", questoesRemover.get(i));
                    DAOFactory.deleteAlternativas("alternativa3", questoesRemover.get(i));
                    DAOFactory.deleteAlternativas("alternativa4", questoesRemover.get(i));
                    DAOFactory.deleteAlternativas("alternativa5", questoesRemover.get(i));
                    DAOFactory.deleteAlternativas("discursiva", questoesRemover.get(i));
                    DAOFactory.deleteQuestion(questoesRemover.get(i));
                    if(InfoSoftware.questoesProvas.contains(questoesRemover.get(i))){
                        for(int j = 0; j <InfoSoftware.questoesProvas.size(); j++){
                            if(InfoSoftware.questoesProvas.get(j).equals(questoesRemover.get(i)))
                                InfoSoftware.questoesProvas.remove(j);
                        }
                    }
                }
                pesquisar();
                
                JOptionPane.showMessageDialog(null, "Questões deletadas com sucesso!");
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma questão foi selecionada!");
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        
        DataQuestions questaoEditar = new DataQuestions();
            int linha = jTblInfoQuestoes.getSelectedRow();
            if(linha != -1){
            questaoEditar = DAOFactory.getQuestao((int)jTblInfoQuestoes.getValueAt(linha, 0));
           Cadastra cd = new Cadastra();
           questaoEditar.show();
           cd.editandoQuestao(questaoEditar);
           cd.setVisible(true);
           cd.pack();
           cd.setLocationRelativeTo(null);
           cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma Questão foi selecionada!");
        }
    }//GEN-LAST:event_jLabel5MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JPanel painel = new JPanel();
        painel.setSize(jBtnProva.getWidth()*2, JFrame.HEIGHT/10);
        painel.setLocation(jButton2.getLocation());
        painel.setBackground(new Color(0, 0, 0, 0));
        jPanel1.add(painel);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        int continuar = 1;
            continuar = JOptionPane.showConfirmDialog(null,"Tem Certeza que deseja fechar o programa?");
            if(continuar == 0){
                System.exit(0);
            }
    }//GEN-LAST:event_exitMousePressed

    private void jCampoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCampoPesquisaKeyPressed
        // TODO add your handling code here:
        System.out.println("foi");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("entrou");
            pesquisar();
        }
    }//GEN-LAST:event_jCampoPesquisaKeyPressed
     
    public void pesquisar(){
        try {
                DAOFactory.abrirConexão();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar ao Banco de Dados!", "Erro!", JOptionPane.ERROR_MESSAGE);
          }
        
        if(jCampoPesquisa.getText().equals("") || jCampoPesquisa.getText().equals("Digite")){
            ArrayList<DataQuestions> dataQ = new ArrayList();
            DefaultTableModel modelo = (DefaultTableModel) jTblInfoQuestoes.getModel();
            while (jTblInfoQuestoes.getModel().getRowCount() > 0) {  
                    ((DefaultTableModel) jTblInfoQuestoes.getModel()).removeRow(0);  
             } 
            dataQ = DAOFactory.getQuestoes("");
            if(!dataQ.isEmpty()){
                for(int i = 0; i < dataQ.size(); i++){
                    DataQuestions ques = dataQ.get(i);

                    modelo.addRow(new Object[]{
                        ques.idQuestao,
                        ques.disciplina,
                        ques.enunciado,
                        ques.tipo,
                        ques.tema
                    });
                    jTblInfoQuestoes.setRowHeight(40);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Banco de Questões está vazio!");
            }
        }else{
            while (jTblInfoQuestoes.getModel().getRowCount() > 0) {  
                    ((DefaultTableModel) jTblInfoQuestoes.getModel()).removeRow(0);  
             } 
            String incremento = "";
           incremento = DAOFactory.incrementQuery("clausa", "none");
            incremento += DAOFactory.incrementQuery("pesquisa", "%" + jCampoPesquisa.getText() + "%");
             ArrayList<DataQuestions> dataQ = new ArrayList();
            DefaultTableModel modelo = (DefaultTableModel) jTblInfoQuestoes.getModel();
            dataQ = DAOFactory.getQuestoes(incremento);
            if(!dataQ.isEmpty()){
                for(int i = 0; i < dataQ.size(); i++){
                DataQuestions ques = dataQ.get(i);

                    modelo.addRow(new Object[]{
                        ques.idQuestao,
                        ques.disciplina,
                        ques.enunciado,
                        ques.tipo,
                        ques.tema
                    });
                    jTblInfoQuestoes.setRowHeight(40);
                 }
            }else{
                JOptionPane.showMessageDialog(null, "Não há resultados para sua pesquisa!");
            }
        try{
                DAOFactory.fecharConexão(DAOFactory.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
            }
        
         }
    }
    
    public void setColor(JPanel panel){
         panel.setBackground(new java.awt.Color(195,195,195
         ));
    }
       public void resetColor(JPanel panel){
         panel.setBackground(new java.awt.Color(240, 240, 240));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarQuestoes("Digite").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JButton jBtnProva;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jCampoPesquisa;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblPesquisar;
    private javax.swing.JLabel jLblResetarPesquisa;
    private javax.swing.JLabel jLblVoltar;
    private javax.swing.JLabel jLblexit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnlBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTblInfoQuestoes;
    // End of variables declaration//GEN-END:variables
}
