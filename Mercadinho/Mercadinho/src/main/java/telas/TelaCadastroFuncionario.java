/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import classes.Funcionarios;
import conexaoClasse.FuncionariosDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author resid
 */
public class TelaCadastroFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        TableFun.setBackground(Color.WHITE);
        DefaultTableModel modelo = (DefaultTableModel)TableFun.getModel();
        TableFun.setRowSorter(new TableRowSorter(modelo));
        LerTabelaFun();
    }                                        

    public void LerTabelaFun (){
        
        DefaultTableModel modelo = (DefaultTableModel)TableFun.getModel();
        modelo.setNumRows(0);
        FuncionariosDAO fdao = new FuncionariosDAO();
        for( Funcionarios f: fdao.buscaTodosFuncionarios()){
            modelo.addRow(new Object []{
                f.getMatricula(),
                f.getNome(),
                f.getCargo(),
                f.getSalario(),
                f.getSenha()
            });
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtCargo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFun = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Mercearia GMW");

        jLabel13.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        jLabel13.setText("Gerenciamento de Funcionarios");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel11.setText("Nome:");

        jLabel12.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel12.setText("Matricula:");

        jLabel14.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel14.setText("Cargo:");

        jLabel15.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel15.setText("Salario:");

        jLabel16.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel16.setText("Senha:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TableFun.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TableFun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Cargo", "Salario", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFunMouseClicked(evt);
            }
        });
        TableFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableFunKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TableFun);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton3)
                        .addGap(357, 357, 357)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(jLabel13)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (TableFun.getSelectedRow() != -1) {

            Funcionarios f = new Funcionarios();
            FuncionariosDAO fdao = new FuncionariosDAO();

            f.setMatricula((String) TableFun.getValueAt(TableFun.getSelectedRow(), 0));
            
            fdao.ExcluiFuncionario(f);

            txtMatricula.setText("");
            txtNome.setText("");
            txtCargo.setText("");
            txtSalario.setText("");

            LerTabelaFun();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (TableFun.getSelectedRow() != -1) {

            Funcionarios f = new Funcionarios();
            FuncionariosDAO fdao = new FuncionariosDAO();

            f.setMatricula((String)TableFun.getValueAt(TableFun.getSelectedRow(), 0));
            f.setNome(txtNome.getText());
            f.setCargo(txtCargo.getText());
            f.setSalario(Float.parseFloat(txtSalario.getText()));
            fdao.AtualizaFuncionario(f);

           txtMatricula.setText("");
           txtNome.setText("");
           txtCargo.setText("");
           txtSalario.setText("");
           txtSenha.setText("");
          

            LerTabelaFun();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Funcionarios f = new Funcionarios();
        FuncionariosDAO fdao = new FuncionariosDAO();
        
        f.setMatricula(txtMatricula.getText());
        f.setNome(txtNome.getText());
        f.setCargo(txtCargo.getText());
        f.setSalario((float) Double.parseDouble(txtSalario.getText()));
        f.setSenha(txtSenha.getText());
        fdao.cria(f);
        
        txtMatricula.setText("");
        txtNome.setText("");
        txtCargo.setText("");
        txtSalario.setText("");
        txtSenha.setText("");
        
        LerTabelaFun();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TableFunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFunMouseClicked
        // TODO add your handling code here:
        if (TableFun.getSelectedRow() != -1) {

            txtMatricula.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 0).toString());
            txtNome.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 1).toString());
            txtCargo.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 2).toString());
            txtSalario.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 3).toString());
            txtSenha.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 4).toString());

        }

        
        
    }//GEN-LAST:event_TableFunMouseClicked

    private void TableFunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableFunKeyReleased
        // TODO add your handling code here:
        if (TableFun.getSelectedRow() != -1) {

            txtMatricula.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 0).toString());
            txtNome.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 1).toString());
            txtCargo.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 2).toString());
            txtSalario.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 3).toString());
            txtSenha.setText(TableFun.getValueAt(TableFun.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_TableFunKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableFun;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
