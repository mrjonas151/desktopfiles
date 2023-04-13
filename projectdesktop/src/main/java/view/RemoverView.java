/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.SeriesControl;
import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class RemoverView extends javax.swing.JFrame {

    /**
     * Creates new form RemoverView
     */
    public RemoverView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btChecar = new javax.swing.JButton();
        txtASerie = new javax.swing.JScrollPane();
        txtASeries = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVoltar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        btVoltar.setText("⬅️ Voltar");
        btVoltar.setActionCommand("⬅️ ");
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        btRemover.setText("Remover 🗑️");
        btRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRemoverMouseClicked(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("Digite o ID:");

        btChecar.setForeground(new java.awt.Color(51, 51, 255));
        btChecar.setText("🔎");
        btChecar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btChecarMouseClicked(evt);
            }
        });
        btChecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChecarActionPerformed(evt);
            }
        });

        txtASeries.setColumns(20);
        txtASeries.setRows(5);
        txtASerie.setViewportView(txtASeries);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setText("Remoção de séries");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(20, 20, 20))
        );

        lblObs.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblObs.setText("Obs: Cheque o ID do conteúdo se necessário.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtASerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btChecar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblObs))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btRemover)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btVoltar)
                .addGap(17, 17, 17)
                .addComponent(lblObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChecar))
                .addGap(18, 18, 18)
                .addComponent(txtASerie, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btRemover)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        this.dispose();
        new SeriesView().setVisible(true);
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btChecarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btChecarMouseClicked
        txtASeries.setText(SeriesControl.lerSeriePorId(Integer.parseInt(txtId.getText())));
    }//GEN-LAST:event_btChecarMouseClicked

    private void btChecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChecarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btChecarActionPerformed

    private void btRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRemoverMouseClicked
        if(SeriesControl.removerSerie(Integer.parseInt(txtId.getText()))){
            JOptionPane.showMessageDialog(this,
                        "Removido com sucesso",
                        "Arquivo gravado",
                        JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,
                    "Erro na remocao",
                    "Arquivo não gravado",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btRemoverMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChecar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane txtASerie;
    private javax.swing.JTextArea txtASeries;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
