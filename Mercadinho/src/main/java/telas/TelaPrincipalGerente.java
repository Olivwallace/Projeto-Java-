/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;

/**
 *
 * @author resid
 */
public class TelaPrincipalGerente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalGerente() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        jMenuBar1.setBackground(Color.WHITE);
        jMenu1.setBackground(Color.WHITE);
        jMenuBar1.setForeground(Color.BLACK);
        jMenu1.setForeground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem10.setText("jMenuItem10");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu10.setText("jMenu10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercearia MGW");

        jInternalFrame1.setTitle("Mercearia GMW");
        jInternalFrame1.setVisible(true);

        jTextField1.setText("Digite aqui...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Pesquise o que está procurando:");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\pesquisa.png")); // NOI18N

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\usuario.png")); // NOI18N
        jMenu1.setText("Usuário");
        jMenu1.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        jMenu1.setIconTextGap(-2);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\add usuario.png")); // NOI18N
        jMenu5.setText("Cadastrar");
        jMenu5.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\funcionario.png")); // NOI18N
        jMenuItem1.setText("Funcionario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem4.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\produtos.png")); // NOI18N
        jMenuItem4.setText("Produtos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenu1.add(jMenu5);

        jMenu9.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\editar usuario.png")); // NOI18N
        jMenu9.setText("Editar");
        jMenu9.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\funcionario.png")); // NOI18N
        jMenuItem8.setText("Funcionario");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\produtos.png")); // NOI18N
        jMenuItem9.setText("Produto");
        jMenu9.add(jMenuItem9);

        jMenu1.add(jMenu9);

        jMenu8.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\ex usuario.png")); // NOI18N
        jMenu8.setText("Excluir");

        jMenuItem11.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\gerente.png")); // NOI18N
        jMenuItem11.setText("Gerente");
        jMenu8.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\atendente.png")); // NOI18N
        jMenuItem12.setText("Atendente");
        jMenu8.add(jMenuItem12);

        jMenu1.add(jMenu8);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\relatorio.png")); // NOI18N
        jMenu2.setText("Relatórios");
        jMenu2.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\cliente.png")); // NOI18N
        jMenuItem6.setText("Clientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\usuario.png")); // NOI18N
        jMenuItem5.setText("Funcionarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\vendas.png")); // NOI18N
        jMenuItem7.setText("Vendas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem13.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\carrinho-de-mao.png")); // NOI18N
        jMenuItem13.setText("Estoque");
        jMenuItem13.setToolTipText("");
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\agenda.png")); // NOI18N
        jMenu3.setText("Agenda");
        jMenu3.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu7.setIcon(new javax.swing.ImageIcon("C:\\Users\\resid\\Documents\\gmw\\ajudando.png")); // NOI18N
        jMenu7.setText("Ajuda");
        jMenu7.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaCadastroProduto telaCadPro = new TelaCadastroProduto();
        jDesktopPane1.add(telaCadPro);
        telaCadPro.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaCadastroFuncionario telaCadFun = new TelaCadastroFuncionario();
        jDesktopPane1.add(telaCadFun);
        telaCadFun.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        TelaListaFuncionario telaListFun = new TelaListaFuncionario();
        jDesktopPane1.add(telaListFun);
        telaListFun.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     */
    public static void mainPrincipal() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipalGerente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}