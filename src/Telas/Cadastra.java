/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import bancodequestoes2.AnswerData;
import bancodequestoes2.DataQuestions;
import bancodequestoes2.DAOFactory;
import bancodequestoes2.DisciplinaKey;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Carlos
 */
public class Cadastra extends javax.swing.JFrame {

     public Cadastra() {
        initComponents();
    }
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        exit1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLblEnunciado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextoEnunciado = new javax.swing.JTextArea();
        jTipoQuestao = new javax.swing.JComboBox<>();
        jLblTipoQuestao = new javax.swing.JLabel();
        jQuantidadeQuestao = new javax.swing.JComboBox<>();
        jLblQuantidadeQuestao = new javax.swing.JLabel();
        jLblDescAlternativas = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextoAlt1 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextoAlt2 = new javax.swing.JTextField();
        jTextoAlt3 = new javax.swing.JTextField();
        jTextoAlt4 = new javax.swing.JTextField();
        jTextoAlt5 = new javax.swing.JTextField();
        jBotaoSalvar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextoJustificativa = new javax.swing.JTextArea();
        jTemaQuestao = new javax.swing.JComboBox<>();
        jLblTemaQuestao = new javax.swing.JLabel();
        jLblIcon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLblMark2 = new javax.swing.JLabel();
        jLblMark3 = new javax.swing.JLabel();
        jLblMark5 = new javax.swing.JLabel();
        jLblMark1 = new javax.swing.JLabel();
        jLblDisciplina = new javax.swing.JLabel();
        jDisciplinas = new javax.swing.JComboBox<>();
        jLblMark6 = new javax.swing.JLabel();
        jLblNota = new javax.swing.JLabel();
        jTxtNota = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1040, 680));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(45, 118, 232));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit1.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setText("-");
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
            }
        });
        jPanel3.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 30, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_Arrow_32px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

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
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 30, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(44, 62, 80));
        jPanel1.setMaximumSize(new java.awt.Dimension(1040, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 640));

        jLblEnunciado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblEnunciado.setForeground(new java.awt.Color(45, 118, 232));
        jLblEnunciado.setText("Enunciado");

        jTextoEnunciado.setColumns(20);
        jTextoEnunciado.setRows(5);
        jTextoEnunciado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jTextoEnunciado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextoEnunciado);

        jTipoQuestao.setForeground(new java.awt.Color(51, 51, 51));
        jTipoQuestao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alternativa", "Verdadeiro e Falso", "Discursiva" }));
        jTipoQuestao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jTipoQuestao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTipoQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipoQuestaoActionPerformed(evt);
            }
        });

        jLblTipoQuestao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblTipoQuestao.setForeground(new java.awt.Color(45, 118, 232));
        jLblTipoQuestao.setText("Tipo da Questão");

        jQuantidadeQuestao.setForeground(new java.awt.Color(51, 51, 51));
        jQuantidadeQuestao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "5", "4", "3", "2" }));
        jQuantidadeQuestao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jQuantidadeQuestao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jQuantidadeQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuantidadeQuestaoActionPerformed(evt);
            }
        });

        jLblQuantidadeQuestao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblQuantidadeQuestao.setForeground(new java.awt.Color(45, 118, 232));
        jLblQuantidadeQuestao.setText("Quantidade de Alternativas");

        jLblDescAlternativas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblDescAlternativas.setForeground(new java.awt.Color(45, 118, 232));
        jLblDescAlternativas.setText("Selecione a Alternativa Correta");

        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextoAlt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jTextoAlt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));

        jTextoAlt3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jTextoAlt4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jTextoAlt5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jBotaoSalvar.setBackground(new java.awt.Color(45, 118, 232));
        jBotaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBotaoSalvar.setText("Salvar Questão");
        jBotaoSalvar.setToolTipText("");
        jBotaoSalvar.setBorder(null);
        jBotaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSalvarActionPerformed(evt);
            }
        });

        jTextoJustificativa.setColumns(20);
        jTextoJustificativa.setRows(5);
        jTextoJustificativa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jScrollPane3.setViewportView(jTextoJustificativa);

        jTemaQuestao.setForeground(new java.awt.Color(51, 51, 51));
        jTemaQuestao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jTemaQuestao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jTemaQuestao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTemaQuestao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTemaQuestaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTemaQuestaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTemaQuestaoMouseExited(evt);
            }
        });
        jTemaQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTemaQuestaoActionPerformed(evt);
            }
        });

        jLblTemaQuestao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblTemaQuestao.setForeground(new java.awt.Color(45, 118, 232));
        jLblTemaQuestao.setText("Tema Questão");

        jLblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblIcon.setText("Imagem");
        jLblIcon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jLblIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblIconMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 118, 232));
        jLabel8.setText("Ilustração");

        jLblMark2.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark2.setText("*");

        jLblMark3.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark3.setText("*");

        jLblMark5.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark5.setText("*");

        jLblMark1.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark1.setText("*");

        jLblDisciplina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblDisciplina.setForeground(new java.awt.Color(45, 118, 232));
        jLblDisciplina.setText("Disciplina");

        jDisciplinas.setForeground(new java.awt.Color(51, 51, 51));
        jDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jDisciplinas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jDisciplinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDisciplinasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDisciplinasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDisciplinasMouseExited(evt);
            }
        });
        jDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisciplinasActionPerformed(evt);
            }
        });

        jLblMark6.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark6.setText("*");

        jLblNota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblNota.setForeground(new java.awt.Color(45, 118, 232));
        jLblNota.setText("Nota");

        jTxtNota.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        try {
            jTxtNota.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLblEnunciado)
                        .addGap(6, 6, 6)
                        .addComponent(jLblMark1)
                        .addGap(797, 797, 797)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLblTipoQuestao)
                                .addGap(10, 10, 10)
                                .addComponent(jLblMark2))
                            .addComponent(jTipoQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLblQuantidadeQuestao)
                                .addGap(2, 2, 2)
                                .addComponent(jLblMark3))
                            .addComponent(jQuantidadeQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblTemaQuestao)
                            .addComponent(jTemaQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLblDisciplina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblMark6))
                            .addComponent(jDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblNota)
                            .addComponent(jTxtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLblDescAlternativas)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLblMark5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextoAlt1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox2)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextoAlt2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox3)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextoAlt3, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox4)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextoAlt4, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox5)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextoAlt5, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jBotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblEnunciado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLblMark1))
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblTipoQuestao)
                            .addComponent(jLblMark2)
                            .addComponent(jLblQuantidadeQuestao)
                            .addComponent(jLblMark3)
                            .addComponent(jLblTemaQuestao)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLblDisciplina)
                                .addComponent(jLblMark6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTipoQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jQuantidadeQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTemaQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblNota)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblDescAlternativas)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLblMark5)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextoAlt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextoAlt2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jTextoAlt3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jTextoAlt4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jTextoAlt5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1040, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Oculta alguns componentes iniciais e popula o jTipoQuestao e jDisciplina
    private void inicializandoComponentes(){
        // Componentes Ocultos
         jTextoJustificativa.setVisible(false);
        jLblMark1.setVisible(false);
        jLblMark2.setVisible(false);
        jLblMark3.setVisible(false);
        jLblMark5.setVisible(false);
        jLblMark6.setVisible(false);
        jTextoAlt1.setVisible(false);
        jCheckBox1.setVisible(false);
        jTextoAlt2.setVisible(false);
        jCheckBox2.setVisible(false);
        jTextoAlt3.setVisible(false);
        jCheckBox3.setVisible(false);
        jTextoAlt4.setVisible(false);
        jCheckBox4.setVisible(false);
        jTextoAlt5.setVisible(false);
        jCheckBox5.setVisible(false);
        jLblDescAlternativas.setVisible(false);
        jLblQuantidadeQuestao.setVisible(false);
        jQuantidadeQuestao.setVisible(false);
        jLblTemaQuestao.setVisible(false);
        jTemaQuestao.setVisible(false);
        jScrollPane3.setVisible(false);
        jBotaoSalvar.setVisible(false);
        jLblDisciplina.setVisible(false);
        jDisciplinas.setVisible(false);
        //Obtem os temas e disciplinas do banco
         try {
                DAOFactory.abrirConexão();
            } catch (Exception ex) {
                System.out.println("Erro ao conectar");
          }
         
         ArrayList<String> temas = DAOFactory.getTemas();
         ArrayList<String> disciplina = DAOFactory.getDisciplinas();
         
          try{
                DAOFactory.fecharConexão(DAOFactory.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
          }
        //Populando ComboBox de Temas e Disciplinas
            for(int i = 0; i < temas.size(); i ++){
                jTemaQuestao.addItem(temas.get(i));
            }
        
            for(int i = 0; i < disciplina.size(); i ++){
               jDisciplinas.addItem(disciplina.get(i));
           }
            jTemaQuestao.addItem("Adicionar");
            jDisciplinas.addItem("Adicionar");    
    }
    
    boolean editando = false;
    public DataQuestions questaoEditando;
    //Inicializa os componentes caso o usuario esteja editando uma questão
    public void editandoQuestao(DataQuestions questaoEditar){
        editando = true;
        questaoEditando = questaoEditar;
        
         jLblMark1.setVisible(false);
        jLblMark2.setVisible(false);
        jLblMark3.setVisible(false);
        jLblMark5.setVisible(false);
        jLblMark6.setVisible(false);
        jTextoAlt1.setVisible(false);
        
        jBotaoSalvar.setText("Atualizar Questão");
        
        jTextoEnunciado.setText(questaoEditar.enunciado);
        
        jTxtNota.setText(questaoEditar.nota);
        
        if(!questaoEditar.tipo.equals("")){
            jTipoQuestao.setSelectedItem(questaoEditar.tipo);
        }
        
        try {
                DAOFactory.abrirConexão();
            } catch (Exception ex) {
                System.out.println("Erro ao conectar");
          }
         
         ArrayList<String> temas = DAOFactory.getTemas();
         ArrayList<String> disciplina = DAOFactory.getDisciplinas();
         
          try{
                DAOFactory.fecharConexão(DAOFactory.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
          }
        //Populando ComboBox de Temas e Disciplinas
            for(int i = 0; i < temas.size(); i ++){
                jTemaQuestao.addItem(temas.get(i));
            }
        
            for(int i = 0; i < disciplina.size(); i ++){
               jDisciplinas.addItem(disciplina.get(i));
           }
            jTemaQuestao.addItem("Adicionar");
            jDisciplinas.addItem("Adicionar");   
        
        if(!questaoEditar.tema.equals("")){
            jTemaQuestao.setSelectedItem(questaoEditar.tema);
        }
        if(!questaoEditar.disciplina.equals("")){
            jDisciplinas.setSelectedItem(questaoEditar.disciplina);
        }
        if(jTipoQuestao.getSelectedItem() == "Discursiva"){
            if(!questaoEditar.respostaDiscursiva.equals("")){
            jTextoJustificativa.setText(questaoEditar.respostaDiscursiva);
            }
        }
        if(jTipoQuestao.getSelectedItem() == "Verdadeiro e Falso"){
            AnswerData alt = questaoEditar.alternativa1;
            System.out.println(alt.textoAlternativa);
            System.out.println(alt.estaCorreta);
            if(alt.textoAlternativa != ""){
                jTextoAlt1.setText(alt.textoAlternativa);
                jCheckBox1.setSelected(questaoEditar.alternativa1.estaCorreta);
            }
            alt = questaoEditar.alternativa2;
            if(alt.textoAlternativa != ""){
                 jTextoAlt2.setText(alt.textoAlternativa);
                jCheckBox2.setSelected(questaoEditar.alternativa2.estaCorreta);
            }
        }else if(jTipoQuestao.getSelectedItem() =="Alternativa"){
            AnswerData alt = null;
            AnswerData alt2 = null;
            AnswerData alt3 = null;
            AnswerData alt4 = null;
            AnswerData alt5 = null;
            if(questaoEditar.alternativa1 != null){
                 alt = questaoEditar.alternativa1;
            }
            if(questaoEditar.alternativa2 != null){
                alt2 = questaoEditar.alternativa2;
            }
            if(questaoEditar.alternativa3 != null){
                alt3 = questaoEditar.alternativa3;
            }
            if(questaoEditar.alternativa4 != null){
                alt4 = questaoEditar.alternativa4;
            }
            if(questaoEditar.alternativa5 != null){
                alt5 = questaoEditar.alternativa5;
            }
            if(alt3.textoAlternativa != ""){
                jQuantidadeQuestao.setSelectedItem("3");
                jTextoAlt1.setText(alt.textoAlternativa);
                jCheckBox1.setSelected(alt.estaCorreta);
                 jTextoAlt2.setText(alt2.textoAlternativa);
                jCheckBox2.setSelected(alt2.estaCorreta);
                 jTextoAlt3.setText(alt3.textoAlternativa);
                jCheckBox3.setSelected(alt3.estaCorreta);
            }
            if(alt4.textoAlternativa != ""){
                jQuantidadeQuestao.setSelectedItem("4");
                jTextoAlt4.setText(alt4.textoAlternativa);
                jCheckBox4.setSelected(alt4.estaCorreta);
            }
            if(alt5.textoAlternativa != ""){
                jQuantidadeQuestao.setSelectedItem("5");
                 jTextoAlt5.setText(alt5.textoAlternativa);
                jCheckBox5.setSelected(alt5.estaCorreta);
            }
        }
    }
    //Inicializa os componentes caso o usuario esteja cadastrando uma questão
    public void cadastrandoQuestao(){
        editando = false;
        jBotaoSalvar.setText("Salvar Questão");
        inicializandoComponentes();
    }
    //Ação do jTipoQuestao
    private void jTipoQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipoQuestaoActionPerformed
        // TODO add your handling code here:
        if(jTipoQuestao.getSelectedItem() == "Selecione"){
            jScrollPane3.setVisible(false);
            jLblMark3.setVisible(false);
            jLblMark5.setVisible(false);
            jBotaoSalvar.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);
            jCheckBox5.setVisible(false);
            jTextoAlt1.setVisible(false);
            jTextoAlt2.setVisible(false);
            jTextoAlt3.setVisible(false);
            jTextoAlt4.setVisible(false);
            jTextoAlt5.setVisible(false);
            jLblDescAlternativas.setVisible(false);
            jLblQuantidadeQuestao.setVisible(false);
            jQuantidadeQuestao.setVisible(false);
            jLblTemaQuestao.setVisible(false);
            jTemaQuestao.setVisible(false);
            jLblDisciplina.setVisible(false);
            jDisciplinas.setVisible(false);
        }
        if(jTipoQuestao.getSelectedItem() == "Verdadeiro e Falso"){
            jScrollPane3.setVisible(false);
            jBotaoSalvar.setVisible(true);
            jTextoJustificativa.setVisible(false);
            jQuantidadeQuestao.setVisible(false);
            jLblQuantidadeQuestao.setVisible(false);
            jLblDescAlternativas.setVisible(true);
            jLblTemaQuestao.setVisible(true);
            jTemaQuestao.setVisible(true);
            jTextoAlt1.setVisible(true);
            jCheckBox1.setVisible(true);
            jTextoAlt2.setVisible(true);
            jCheckBox2.setVisible(true);
            jTextoAlt3.setVisible(false);
            jCheckBox3.setVisible(false);
            jTextoAlt4.setVisible(false);
            jCheckBox4.setVisible(false);
            jTextoAlt5.setVisible(false);
            jCheckBox5.setVisible(false);
            jDisciplinas.setVisible(true);
            jLblDisciplina.setVisible(true);
        }else if(jTipoQuestao.getSelectedItem() == "Alternativa"){
            jScrollPane3.setVisible(false);
            jBotaoSalvar.setVisible(true);
            jTextoJustificativa.setVisible(false);
            jQuantidadeQuestao.setVisible(true);
            jLblQuantidadeQuestao.setVisible(true);
            jLblTemaQuestao.setVisible(true);
            jTemaQuestao.setVisible(true);
            jDisciplinas.setVisible(true);
            jLblDisciplina.setVisible(true);
            jQuantidadeQuestao.setSelectedItem("Selecione");
            if(jQuantidadeQuestao.getSelectedItem() == "Selecione"){
                jLblDescAlternativas.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jTextoAlt1.setVisible(false);
                jTextoAlt2.setVisible(false);
                jTextoAlt3.setVisible(false);
                jTextoAlt4.setVisible(false);
                jTextoAlt5.setVisible(false);
            }else if(jQuantidadeQuestao.getSelectedItem() == "2"){
                jTipoQuestao.setSelectedItem("Verdadeiro e Falso");
            }else if(jQuantidadeQuestao.getSelectedItem() == "3"){
                jLblDescAlternativas.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jTextoAlt1.setVisible(true);
                jTextoAlt2.setVisible(true);
                jTextoAlt3.setVisible(true);
                jTextoAlt4.setVisible(false);
                jTextoAlt5.setVisible(false);
            }else if(jQuantidadeQuestao.getSelectedItem() == "4"){
                jLblDescAlternativas.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jCheckBox5.setVisible(false);
                jTextoAlt1.setVisible(true);
                jTextoAlt2.setVisible(true);
                jTextoAlt3.setVisible(true);
                jTextoAlt4.setVisible(true);
                jTextoAlt5.setVisible(false);
            }else if(jQuantidadeQuestao.getSelectedItem() == "5"){
                jLblDescAlternativas.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jCheckBox5.setVisible(true);
                jTextoAlt1.setVisible(true);
                jTextoAlt2.setVisible(true);
                jTextoAlt3.setVisible(true);
                jTextoAlt4.setVisible(true);
                jTextoAlt5.setVisible(true);
            }
        }else if(jTipoQuestao.getSelectedItem() == "Discursiva"){
            jTemaQuestao.setVisible(true);
            jLblTemaQuestao.setVisible(true);
            jScrollPane3.setVisible(true);
            jBotaoSalvar.setVisible(true);
            jTextoJustificativa.setVisible(true);
            jQuantidadeQuestao.setVisible(false);
            jLblQuantidadeQuestao.setVisible(false);
            jLblDescAlternativas.setVisible(false);
            jTextoAlt1.setVisible(false);
            jCheckBox1.setVisible(false);
            jTextoAlt2.setVisible(false);
            jCheckBox2.setVisible(false);
            jTextoAlt3.setVisible(false);
            jCheckBox3.setVisible(false);
            jTextoAlt4.setVisible(false);
            jCheckBox4.setVisible(false);
            jTextoAlt5.setVisible(false);
            jCheckBox5.setVisible(false);
            jLblDisciplina.setVisible(true);
            jDisciplinas.setVisible(true);
        }
    }//GEN-LAST:event_jTipoQuestaoActionPerformed
    //Ação do jQuantidadeQuestao
    private void jQuantidadeQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuantidadeQuestaoActionPerformed
        // TODO add your handling code here:
        if(jQuantidadeQuestao.getSelectedItem() == "Selecione"){
            jBotaoSalvar.setVisible(false);
        }else if(jQuantidadeQuestao.getSelectedItem() == "2"){
            jTipoQuestao.setSelectedItem("Verdadeiro e Falso");
            jBotaoSalvar.setVisible(true);
        }else if(jQuantidadeQuestao.getSelectedItem() == "3"){
            jLblDescAlternativas.setVisible(true);
            jTextoAlt1.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox1.setText("");
            jTextoAlt2.setVisible(true);
            jCheckBox2.setVisible(true);
            jTextoAlt3.setVisible(true);
            jCheckBox3.setVisible(true);
            jTextoAlt4.setVisible(false);
            jCheckBox4.setVisible(false);
            jTextoAlt5.setVisible(false);
            jCheckBox5.setVisible(false);
            jBotaoSalvar.setVisible(true);
        }else if(jQuantidadeQuestao.getSelectedItem() == "4"){
            jLblDescAlternativas.setVisible(true);
            jTextoAlt1.setVisible(true);
            jCheckBox1.setVisible(true);
            jTextoAlt2.setVisible(true);
            jCheckBox2.setVisible(true);
            jTextoAlt3.setVisible(true);
            jCheckBox3.setVisible(true);
            jTextoAlt4.setVisible(true);
            jCheckBox4.setVisible(true);
            jTextoAlt5.setVisible(false);
            jCheckBox5.setVisible(false);
            jBotaoSalvar.setVisible(true);
        }else if(jQuantidadeQuestao.getSelectedItem() == "5"){
            jLblDescAlternativas.setVisible(true);
            jTextoAlt1.setVisible(true);
            jCheckBox1.setVisible(true);
            jTextoAlt2.setVisible(true);
            jCheckBox2.setVisible(true);
            jTextoAlt3.setVisible(true);
            jCheckBox3.setVisible(true);
            jTextoAlt4.setVisible(true);
            jCheckBox4.setVisible(true);
            jTextoAlt5.setVisible(true);
            jCheckBox5.setVisible(true);
            jBotaoSalvar.setVisible(true);
        }
    }//GEN-LAST:event_jQuantidadeQuestaoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected()){
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox4.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox5.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jBotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSalvarActionPerformed
        // TODO add your handling code here:
        //Testes de condições para que a questão seja salva
        boolean mensage = false;

        if(jTextoEnunciado.getText().equals("")){
            jLblMark1.setVisible(true);
            mensage = true;
        }else{
            jLblMark1.setVisible(false);
        }

        if(jTipoQuestao.getSelectedItem()== "Selecione"){
            jLblMark2.setVisible(true);
            mensage = true;
        }else{
            jLblMark2.setVisible(false);
        }

        if(jQuantidadeQuestao.getSelectedItem() == "Selecione" && jQuantidadeQuestao.isVisible() == true){
            jLblMark3.setVisible(true);
            mensage = true;
        }else{
            jLblMark3.setVisible(false);
        }

        if(jDisciplinas.getSelectedItem() == "Selecione" && jDisciplinas.isVisible() == true){
            jLblMark6.setVisible(true);
            mensage = true;
        }else{
            jLblMark6.setVisible(false);
        }

        if(jTipoQuestao.getSelectedItem() == "Alternativa" || jTipoQuestao.getSelectedItem() == "Verdadeiro e Falso"){
            jLblMark5.setVisible(false);
            if(jTextoAlt1.isVisible() == true && jTextoAlt1.getText().equals("") && jLblDescAlternativas.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextoAlt2.isVisible() == true && jTextoAlt2.getText().equals("") && jLblDescAlternativas.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextoAlt3.isVisible() == true && jTextoAlt3.getText().equals("") && jLblDescAlternativas.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextoAlt4.isVisible() == true && jTextoAlt4.getText().equals("") && jLblDescAlternativas.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextoAlt5.isVisible() == true && jTextoAlt5.getText().equals("") && jLblDescAlternativas.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jCheckBox1.isSelected() == false && jCheckBox2.isSelected() == false && jCheckBox3.isSelected() == false && jCheckBox4.isSelected() == false && jCheckBox5.isSelected() == false && jLblDescAlternativas.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
        }
        if(mensage){
            JOptionPane.showMessageDialog(null, "( * ) Campo Obrigatório!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                DAOFactory.abrirConexão();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar ao Banco de Dados!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            
            if(editando){
                if(jTipoQuestao.getSelectedItem() == "Discursiva"){
                    int primaryDisciplina = 0;
                    ArrayList<DisciplinaKey> chave = DAOFactory.getDisciplinasKey();
                    DisciplinaKey c;
                    System.out.println(chave.size());
                    for(int j = 0; j < chave.size(); j++){
                        System.out.println("for");
                        c = chave.get(j);
                        System.out.println(c.id);
                        System.out.println(c.disciplina);
                        
                        
                            System.out.println(c.disciplina);
                            System.out.println(jDisciplinas.getSelectedItem().toString());
                        if(c.disciplina.equals(jDisciplinas.getSelectedItem().toString())){
                            primaryDisciplina = c.id;
                            System.out.println(c.id);
                        }
                        System.out.println(primaryDisciplina);
                        System.out.println(j);
                    }
                    
                    DAOFactory.updateQuestaoFinalDisertativa(primaryDisciplina, questaoEditando.idQuestao, jTipoQuestao.getSelectedItem().toString(), jTextoEnunciado.getText(), jTemaQuestao.getSelectedItem().toString(), jTipoQuestao.getSelectedItem().toString(), jTextoJustificativa.getText());
                }
            }else{
                
                if(arquivoF != null){
                    
                    File dir = new File(javax.swing.filechooser.FileSystemView.getFileSystemView().getDefaultDirectory() + "\\BancodeQuestões");
                    if(!dir.exists())
                        dir.mkdir();
                    File dir2 = new File(javax.swing.filechooser.FileSystemView.getFileSystemView().getDefaultDirectory() + "\\BancodeQuestões\\Imagens");
                    if(!dir2.exists())
                        dir2.mkdir();
                    File dir3 = new File(javax.swing.filechooser.FileSystemView.getFileSystemView().getDefaultDirectory() + "\\BancodeQuestões\\Provas");
                    if(!dir3.exists())
                        dir3.mkdir();
                    File dir4 = new File(javax.swing.filechooser.FileSystemView.getFileSystemView().getDefaultDirectory() + "\\BancodeQuestões\\Gabaritos");
                    if(!dir4.exists())
                        dir4.mkdir();
                    
                    try {
                        //copiando para novo diretorio;
                        FileInputStream origem = new FileInputStream(arquivoF);
                        FileOutputStream destino = new FileOutputStream(new File(dir2.getAbsolutePath()+"\\Questao_"+arquivoF.getName()));
                        FileChannel fcOrigem = origem.getChannel();
                        FileChannel fcDestino = destino.getChannel();
                        fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);
                        origem.close();
                        destino.close();
                        pastaFoto = dir2.getAbsolutePath().replace("\\", "/") + "/Questao_"+ arquivoF.getName();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Cadastra.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Cadastra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                boolean igual = false;
                DataQuestions questaoACadastrar = new DataQuestions();
                
                questaoACadastrar.disciplina = jDisciplinas.getSelectedItem().toString();
                questaoACadastrar.enunciado = jTextoEnunciado.getText();
                questaoACadastrar.tema = jTemaQuestao.getSelectedItem().toString();
                questaoACadastrar.tipo = jTipoQuestao.getSelectedItem().toString();
                questaoACadastrar.nota = jTxtNota.getText();
                
                if(pastaFoto != ""){
                    questaoACadastrar.caminhoImagem = pastaFoto;
                }else{
                    questaoACadastrar.caminhoImagem = "";
                }
                if(jTextoJustificativa.getText() != ""){
                    questaoACadastrar.respostaDiscursiva = jTextoJustificativa.getText();
                }
                if(jTextoAlt1.getText() != ""){
                    questaoACadastrar.alternativa1 = new AnswerData(jTextoAlt1.getText(), jCheckBox1.isSelected());
                }
                if(jTextoAlt2.getText() != ""){
                    questaoACadastrar.alternativa2 = new AnswerData(jTextoAlt2.getText(), jCheckBox2.isSelected());
                }
                if(jTextoAlt3.getText() != ""){
                    questaoACadastrar.alternativa3 = new AnswerData(jTextoAlt3.getText(), jCheckBox3.isSelected());
                }
                if(jTextoAlt4.getText() != ""){
                    questaoACadastrar.alternativa4 = new AnswerData(jTextoAlt4.getText(), jCheckBox4.isSelected());
                }
                if(jTextoAlt5.getText() != ""){
                    questaoACadastrar.alternativa5 = new AnswerData(jTextoAlt5.getText(), jCheckBox5.isSelected());
                }
                
                ArrayList<DataQuestions> todasAsQuestoes = DAOFactory.getQuestoes("");
                
                for(int i = 0; i < todasAsQuestoes.size(); i++){
                    int count = 0;
                    DataQuestions questaoAtual = todasAsQuestoes.get(i);
                    
                    if(questaoACadastrar.disciplina.equals(questaoAtual.disciplina)){
                        count++;
                    }
                    if(questaoACadastrar.enunciado.equals(questaoAtual.enunciado)){
                       count++;
                    }
                    if(questaoACadastrar.respostaDiscursiva.equals(questaoAtual.respostaDiscursiva)){
                        count++;
                    }
                    
                    if(questaoACadastrar.tema.equals(questaoAtual.tema)){
                       count++;
                    }
                    if(questaoACadastrar.tipo.equals(questaoAtual.tipo)){
                        count++;
                    }
                    if(questaoACadastrar.caminhoImagem.equals(questaoAtual.caminhoImagem)){
                        count++;
                    }
                    if(questaoACadastrar.nota.equals(questaoAtual.nota)){
                        count++;
                    }
                    
                    AnswerData altComp = questaoAtual.alternativa1;
                    AnswerData altAtual = questaoACadastrar.alternativa1;
                    if(altComp.textoAlternativa.equals(altAtual.textoAlternativa) && altComp.estaCorreta == altAtual.estaCorreta){
                        count++;
                    }
                    altComp = questaoAtual.alternativa2;
                    altAtual = questaoACadastrar.alternativa2;
                    if(altComp.textoAlternativa.equals(altAtual.textoAlternativa) && altComp.estaCorreta == altAtual.estaCorreta){
                       count++;
                    }
                    altComp = questaoAtual.alternativa3;
                    altAtual = questaoACadastrar.alternativa3;
                    if(altComp.textoAlternativa.equals(altAtual.textoAlternativa) && altComp.estaCorreta == altAtual.estaCorreta){
                        count++;
                    }
                    altComp = questaoAtual.alternativa4;
                    altAtual = questaoACadastrar.alternativa4;
                    if(altComp.textoAlternativa.equals(altAtual.textoAlternativa) && altComp.estaCorreta == altAtual.estaCorreta){
                        count++;
                    }
                    altComp = questaoAtual.alternativa5;
                    altAtual = questaoACadastrar.alternativa5;
                    if(altComp.textoAlternativa.equals(altAtual.textoAlternativa) && altComp.estaCorreta == altAtual.estaCorreta){
                        count++;
                    }
                    
                    if(count == 12)
                        igual = true;
                }
                
                if(igual){
                    JOptionPane.showMessageDialog(null, "Questão ja existe no Banco de Dados!");
                }else{
                    if(jTipoQuestao.getSelectedItem() == "Verdadeiro e Falso"){
                        DAOFactory.inserirQuestaoVF(jDisciplinas.getSelectedItem().toString(), jTextoEnunciado.getText(), jTipoQuestao.getSelectedItem().toString(), jTemaQuestao.getSelectedItem().toString(), pastaFoto, jTxtNota.getText(),  jCheckBox1, jCheckBox2, jTextoAlt1.getText(), jTextoAlt2.getText());
                        jTextoEnunciado.setText("");
                            jTipoQuestao.setSelectedItem("Selecione");
                            jQuantidadeQuestao.setSelectedItem("Selecione");
                            jTemaQuestao.setSelectedItem("Selecione");
                            jDisciplinas.setSelectedItem("Selecione");
                            jTxtNota.setText("");
                            jTextoAlt1.setText("");
                            jTextoAlt2.setText("");
                            jTextoAlt3.setText("");
                            jTextoAlt4.setText("");
                            jTextoAlt5.setText("");
                            jTextoJustificativa.setText("");
                            jCheckBox1.setSelected(false);
                            jCheckBox2.setSelected(false);
                            jCheckBox3.setSelected(false);
                            jCheckBox4.setSelected(false);
                            jCheckBox5.setSelected(false);
                            jLblIcon.setIcon(null);
                        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                    }else if(jTipoQuestao.getSelectedItem() == "Discursiva"){
                        DAOFactory.inserirQuestaoD(jDisciplinas.getSelectedItem().toString(), jTextoEnunciado.getText(), jTipoQuestao.getSelectedItem().toString(), jTemaQuestao.getSelectedItem().toString(), pastaFoto, jTxtNota.getText(),  jTextoJustificativa.getText());
                        jTextoEnunciado.setText("");
                            jTipoQuestao.setSelectedItem("Selecione");
                            jQuantidadeQuestao.setSelectedItem("Selecione");
                            jTemaQuestao.setSelectedItem("Selecione");
                            jDisciplinas.setSelectedItem("Selecione");
                            jTxtNota.setText("");
                            jTextoAlt1.setText("");
                            jTextoAlt2.setText("");
                            jTextoAlt3.setText("");
                            jTextoAlt4.setText("");
                            jTextoAlt5.setText("");
                            jTextoJustificativa.setText("");
                            jCheckBox1.setSelected(false);
                            jCheckBox2.setSelected(false);
                            jCheckBox3.setSelected(false);
                            jCheckBox4.setSelected(false);
                            jCheckBox5.setSelected(false);
                            jLblIcon.setIcon(null);
                        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                    }
                    else if(jTipoQuestao.getSelectedItem() == "Alternativa"){
                        if(jQuantidadeQuestao.getSelectedItem() == "2"){
                            DAOFactory.inserirQuestaoVF(jDisciplinas.getSelectedItem().toString(), jTextoEnunciado.getText(), jTipoQuestao.getSelectedItem().toString(), jTemaQuestao.getSelectedItem().toString(), pastaFoto, jTxtNota.getText(),  jCheckBox1, jCheckBox2, jTextoAlt1.getText(), jTextoAlt2.getText());
                            jTextoEnunciado.setText("");
                            jTipoQuestao.setSelectedItem("Selecione");
                            jQuantidadeQuestao.setSelectedItem("Selecione");
                            jTemaQuestao.setSelectedItem("Selecione");
                            jDisciplinas.setSelectedItem("Selecione");
                            jTxtNota.setText("");
                            jTextoAlt1.setText("");
                            jTextoAlt2.setText("");
                            jTextoAlt3.setText("");
                            jTextoAlt4.setText("");
                            jTextoAlt5.setText("");
                            jTextoJustificativa.setText("");
                            jCheckBox1.setSelected(false);
                            jCheckBox2.setSelected(false);
                            jCheckBox3.setSelected(false);
                            jCheckBox4.setSelected(false);
                            jCheckBox5.setSelected(false);
                            jLblIcon.setIcon(null);
                            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                        }else if(jQuantidadeQuestao.getSelectedItem() == "3"){
                            DAOFactory.inserirEmAlternativas(jDisciplinas.getSelectedItem().toString(), jTextoEnunciado.getText(), jTipoQuestao.getSelectedItem().toString(), jTemaQuestao.getSelectedItem().toString(), pastaFoto, jTxtNota.getText(), jCheckBox1, jCheckBox2, jCheckBox3, jTextoAlt1.getText(), jTextoAlt2.getText(), jTextoAlt3.getText());
                            jTextoEnunciado.setText("");
                            jTipoQuestao.setSelectedItem("Selecione");
                            jQuantidadeQuestao.setSelectedItem("Selecione");
                            jTemaQuestao.setSelectedItem("Selecione");
                            jDisciplinas.setSelectedItem("Selecione");
                            jTxtNota.setText("");
                            jTextoAlt1.setText("");
                            jTextoAlt2.setText("");
                            jTextoAlt3.setText("");
                            jTextoAlt4.setText("");
                            jTextoAlt5.setText("");
                            jTextoJustificativa.setText("");
                            jCheckBox1.setSelected(false);
                            jCheckBox2.setSelected(false);
                            jCheckBox3.setSelected(false);
                            jCheckBox4.setSelected(false);
                            jCheckBox5.setSelected(false);
                            jLblIcon.setIcon(null);
                            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                        }else if(jQuantidadeQuestao.getSelectedItem() == "4"){
                            DAOFactory.inserirEmAlternativas(jDisciplinas.getSelectedItem().toString(), jTextoEnunciado.getText(), jTipoQuestao.getSelectedItem().toString(), jTemaQuestao.getSelectedItem().toString(), pastaFoto, jTxtNota.getText(), jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jTextoAlt1.getText(), jTextoAlt2.getText(), jTextoAlt3.getText(), jTextoAlt4.getText());
                            jTextoEnunciado.setText("");
                            jTipoQuestao.setSelectedItem("Selecione");
                            jQuantidadeQuestao.setSelectedItem("Selecione");
                            jTemaQuestao.setSelectedItem("Selecione");
                            jDisciplinas.setSelectedItem("Selecione");
                            jTxtNota.setText("");
                            jTextoAlt1.setText("");
                            jTextoAlt2.setText("");
                            jTextoAlt3.setText("");
                            jTextoAlt4.setText("");
                            jTextoAlt5.setText("");
                            jTextoJustificativa.setText("");
                            jCheckBox1.setSelected(false);
                            jCheckBox2.setSelected(false);
                            jCheckBox3.setSelected(false);
                            jCheckBox4.setSelected(false);
                            jCheckBox5.setSelected(false);
                            jLblIcon.setIcon(null);
                            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                        }else if(jQuantidadeQuestao.getSelectedItem() == "5"){
                            DAOFactory.inserirEmAlternativas(jDisciplinas.getSelectedItem().toString(), jTextoEnunciado.getText(), jTipoQuestao.getSelectedItem().toString(), jTemaQuestao.getSelectedItem().toString(), pastaFoto, jTxtNota.getText(), jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jTextoAlt1.getText(), jTextoAlt2.getText(), jTextoAlt3.getText(), jTextoAlt4.getText(), jTextoAlt5.getText());
                            jTextoEnunciado.setText("");
                            jTipoQuestao.setSelectedItem("Selecione");
                            jQuantidadeQuestao.setSelectedItem("Selecione");
                            jTemaQuestao.setSelectedItem("Selecione");
                            jDisciplinas.setSelectedItem("Selecione");
                            jTxtNota.setText("");
                            jTextoAlt1.setText("");
                            jTextoAlt2.setText("");
                            jTextoAlt3.setText("");
                            jTextoAlt4.setText("");
                            jTextoAlt5.setText("");
                            jTextoJustificativa.setText("");
                            jCheckBox1.setSelected(false);
                            jCheckBox2.setSelected(false);
                            jCheckBox3.setSelected(false);
                            jCheckBox4.setSelected(false);
                            jCheckBox5.setSelected(false);
                            jLblIcon.setIcon(null);
                            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                        }
                    }
                }
            }

            try{
                DAOFactory.fecharConexão(DAOFactory.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
            }
        }

    }//GEN-LAST:event_jBotaoSalvarActionPerformed

    private void jTemaQuestaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTemaQuestaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTemaQuestaoMouseClicked

    private void jTemaQuestaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTemaQuestaoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTemaQuestaoMouseEntered

    private void jTemaQuestaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTemaQuestaoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTemaQuestaoMouseExited

    private void jTemaQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTemaQuestaoActionPerformed
        // TODO add your handling code here:
        if(jTemaQuestao.getSelectedItem() == "Adicionar"){
            try {
                DAOFactory.abrirConexão();
            } catch (Exception ex) {
                System.out.println("Erro ao conectar");
            }
          
            String str = JOptionPane.showInputDialog(null, "Adicionar tema:");
            ArrayList<String> temas = new ArrayList();
            temas = DAOFactory.getTemas();
            
            if(str == null || str == ""){
                jTemaQuestao.setSelectedItem("Selecione");
            }else{
                if(!temas.contains(str)){
                    jTemaQuestao.removeAllItems();
                    jTemaQuestao.addItem("Selecione");
                    for(int i = 0; i < temas.size(); i ++){
                        jTemaQuestao.addItem(temas.get(i));
                    }
                    jTemaQuestao.addItem(str);
                    jTemaQuestao.addItem("Adicionar");
                    jTemaQuestao.setSelectedItem(str);
                }else{
                    JOptionPane.showMessageDialog(null, "Tema ja existe!");
                    jTemaQuestao.setSelectedItem("Selecione");
                }
            }
            try{
                DAOFactory.fecharConexão(DAOFactory.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
            }
        }
        /*if(jTQuestion.getSelectedItem() == "Adicionar"){
            String fodase = JOptionPane.showInputDialog(null, "Digite");
        }*/
    }//GEN-LAST:event_jTemaQuestaoActionPerformed
    String pastaFoto = "";
    File arquivoF;
    private void jLblIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblIconMouseClicked
        // TODO add your handling code here:
        String foto = "";
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas imagens JPG", "jpg");
        filechooser.setFileFilter(filtro);
        filechooser.addChoosableFileFilter(filtro);
        if(filechooser.showOpenDialog(jLblIcon) == JFileChooser.APPROVE_OPTION){
            File arquivo = filechooser.getSelectedFile();
            if(arquivo != null){
                foto = arquivo.getPath();
                arquivoF = arquivo;
            }
            ImageIcon imagem = new ImageIcon(foto);
            imagem.setImage(imagem.getImage().getScaledInstance(jLblIcon.getWidth(), jLblIcon.getHeight(), 0));
            Icon icon = imagem;
            jLblIcon.setIcon(icon);
        }
    }//GEN-LAST:event_jLblIconMouseClicked

    private void jDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisciplinasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisciplinasMouseClicked

    private void jDisciplinasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisciplinasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisciplinasMouseEntered

    private void jDisciplinasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisciplinasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisciplinasMouseExited

    private void jDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisciplinasActionPerformed
        // TODO add your handling code here:
       if(jDisciplinas.getSelectedItem() == "Adicionar"){
            try {
                DAOFactory.abrirConexão();
            } catch (Exception ex) {
                System.out.println("Erro ao conectar");
            }
          
            String str = JOptionPane.showInputDialog(null, "Adicionar Disciplina:");
            ArrayList<String> allDisciplina = new ArrayList();
            allDisciplina = DAOFactory.getDisciplinas();
            
            if(str == null || str == ""){
                jDisciplinas.setSelectedItem("Selecione");
            }else{
                if(!allDisciplina.contains(str)){
                    jDisciplinas.removeAllItems();
                    jDisciplinas.addItem("Selecione");
                    for(int i = 0; i < allDisciplina.size(); i ++){
                        jDisciplinas.addItem(allDisciplina.get(i));
                    }
                    jDisciplinas.addItem(str);
                    jDisciplinas.addItem("Adicionar");
                    jDisciplinas.setSelectedItem(str);
                }else{
                    JOptionPane.showMessageDialog(null, "Tema ja existe!");
                    jDisciplinas.setSelectedItem("Selecione");
                }
            }
            try{
                DAOFactory.fecharConexão(DAOFactory.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
            }
       }
    }//GEN-LAST:event_jDisciplinasActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        //Retornar ao menu principal
        ListarQuestoes pp;
        Principal pp2;
        if(editando){
            pp = new ListarQuestoes("Digite");
            pp.setVisible(true);
            pp.pack();
            pp.setLocationRelativeTo(null);
            pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pp.pesquisar();
        }else{
            pp2 = new Principal();
            pp2.setVisible(true);
            pp2.pack();
            pp2.setLocationRelativeTo(null);
            pp2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }          
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        this.setState(Frame.ICONIFIED);//MINIMIZANDO TELA PRINCIPAL
    }//GEN-LAST:event_exit1MousePressed

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exit1MouseClicked
    int xx, xy;
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        int continuar = 1;
            continuar = JOptionPane.showConfirmDialog(null,"Tem Certeza que deseja fechar o programa?");
            if(continuar == 0){
                System.exit(0);
            }
    }//GEN-LAST:event_exitMousePressed

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
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JButton jBotaoSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox<String> jDisciplinas;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblDescAlternativas;
    private javax.swing.JLabel jLblDisciplina;
    private javax.swing.JLabel jLblEnunciado;
    private javax.swing.JLabel jLblIcon;
    private javax.swing.JLabel jLblMark1;
    private javax.swing.JLabel jLblMark2;
    private javax.swing.JLabel jLblMark3;
    private javax.swing.JLabel jLblMark5;
    private javax.swing.JLabel jLblMark6;
    private javax.swing.JLabel jLblNota;
    private javax.swing.JLabel jLblQuantidadeQuestao;
    private javax.swing.JLabel jLblTemaQuestao;
    private javax.swing.JLabel jLblTipoQuestao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jQuantidadeQuestao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jTemaQuestao;
    private javax.swing.JTextField jTextoAlt1;
    private javax.swing.JTextField jTextoAlt2;
    private javax.swing.JTextField jTextoAlt3;
    private javax.swing.JTextField jTextoAlt4;
    private javax.swing.JTextField jTextoAlt5;
    private javax.swing.JTextArea jTextoEnunciado;
    private javax.swing.JTextArea jTextoJustificativa;
    private javax.swing.JComboBox<String> jTipoQuestao;
    private javax.swing.JFormattedTextField jTxtNota;
    // End of variables declaration//GEN-END:variables
}
