package FRONTEND;

import BACKEND.Produtor;
import BACKEND.Sistema;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JanelaAdmProdutores extends javax.swing.JFrame {

    Sistema s;
    DefaultTableModel model;
    
    public JanelaAdmProdutores(Sistema s) {
        initComponents();
        this.s = s;
        model = (DefaultTableModel) tabelaProdutores.getModel();
    }
    
    public void update(){
        model.setRowCount(0);
        Object coluna[] = new Object[2];
        for(Produtor p: s.getListaUtilizadores().getProdutores()){
            coluna[0] = p.getNome();
            coluna[1] = p.getUsername();
            model.addRow(coluna);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutores = new javax.swing.JTable();
        pesquisa = new javax.swing.JTextField();
        editarProdutor = new javax.swing.JButton();
        removerProdutor = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel3.setText("Produtores");

        voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        tabelaProdutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Username", "Data Nasc", "Morada", "Nº BI"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutores);

        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        editarProdutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editarProdutor.setText("Editar");
        editarProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProdutorActionPerformed(evt);
            }
        });

        removerProdutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removerProdutor.setText("Remover");
        removerProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProdutorActionPerformed(evt);
            }
        });

        adicionar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(editarProdutor)
                        .addGap(18, 18, 18)
                        .addComponent(adicionar)
                        .addGap(18, 18, 18)
                        .addComponent(removerProdutor)
                        .addGap(18, 18, 18)
                        .addComponent(voltar)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(editarProdutor)
                    .addComponent(removerProdutor)
                    .addComponent(adicionar))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        JanelaAdm janela = new JanelaAdm();
        janela.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tabelaProdutores.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(pesquisa.getText()));
    }//GEN-LAST:event_pesquisaActionPerformed

    private void editarProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProdutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarProdutorActionPerformed

    private void removerProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerProdutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removerProdutorActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton editarProdutor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton removerProdutor;
    private javax.swing.JTable tabelaProdutores;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
