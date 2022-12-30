package FRONTEND;

import BACKEND.Musico;
import BACKEND.Sistema;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JanelaAdmMusicos extends javax.swing.JFrame {

    Sistema s;
    DefaultTableModel model;
    
    public JanelaAdmMusicos(Sistema s) {
        initComponents();
        this.s = s;
        model = (DefaultTableModel) tabelaMusicos.getModel();
    }

    public void update(){
        model.setRowCount(0);
        Object coluna[] = new Object[6];
        for(Musico m: s.getListaUtilizadores().getMusicos()){
            coluna[0] = m.getNome();
            coluna[1] = m.getUsername();
            coluna[2] = m.getDataNasc();
            coluna[3] = m.getMorada();
            coluna[4] = m.getnBI();
            coluna[5] = m.getInstrumento();
            model.addRow(coluna);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMusicos = new javax.swing.JTable();
        pesquisa = new javax.swing.JTextField();
        editarMusico = new javax.swing.JButton();
        adicionarMusico = new javax.swing.JButton();
        removerMusico = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel3.setText("Músicos");

        voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        tabelaMusicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Username", "Data Nasc", "Morada", "Nº BI", "Instrumento"
            }
        ));
        jScrollPane1.setViewportView(tabelaMusicos);

        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        editarMusico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editarMusico.setText("Editar");
        editarMusico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMusicoActionPerformed(evt);
            }
        });

        adicionarMusico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adicionarMusico.setText("Adicionar");
        adicionarMusico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMusicoActionPerformed(evt);
            }
        });

        removerMusico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removerMusico.setText("Remover");
        removerMusico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMusicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(191, 191, 191))
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarMusico)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarMusico)
                        .addGap(18, 18, 18)
                        .addComponent(removerMusico)
                        .addGap(18, 18, 18)
                        .addComponent(voltar)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(editarMusico)
                    .addComponent(removerMusico)
                    .addComponent(adicionarMusico))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        JanelaAdm janela = new JanelaAdm();
        janela.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tabelaMusicos.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(pesquisa.getText()));
    }//GEN-LAST:event_pesquisaActionPerformed

    private void editarMusicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMusicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarMusicoActionPerformed

    private void adicionarMusicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMusicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarMusicoActionPerformed

    private void removerMusicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMusicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removerMusicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarMusico;
    private javax.swing.JButton editarMusico;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton removerMusico;
    private javax.swing.JTable tabelaMusicos;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
