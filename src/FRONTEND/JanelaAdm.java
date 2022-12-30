package FRONTEND;

public class JanelaAdm extends javax.swing.JFrame {

    public JanelaAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ListaMusicos = new javax.swing.JButton();
        ListaAlbuns = new javax.swing.JButton();
        ListaProdutores = new javax.swing.JButton();
        ListaMusicas = new javax.swing.JButton();
        ListaInstrumentos = new javax.swing.JButton();
        ListaReposicoes = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        ListaEstatiscas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel2.setText("Administrador");

        ListaMusicos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ListaMusicos.setText("Musicos");
        ListaMusicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMusicosActionPerformed(evt);
            }
        });

        ListaAlbuns.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ListaAlbuns.setText("Albuns");
        ListaAlbuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaAlbunsActionPerformed(evt);
            }
        });

        ListaProdutores.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ListaProdutores.setText("Produtores");
        ListaProdutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaProdutoresActionPerformed(evt);
            }
        });

        ListaMusicas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ListaMusicas.setText("Músicas");
        ListaMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMusicasActionPerformed(evt);
            }
        });

        ListaInstrumentos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ListaInstrumentos.setText("Instrumentos");
        ListaInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaInstrumentosActionPerformed(evt);
            }
        });

        ListaReposicoes.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ListaReposicoes.setText("Requisições");
        ListaReposicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaReposicoesActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        ListaEstatiscas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ListaEstatiscas.setText("Estatísticas");
        ListaEstatiscas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaEstatiscasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Sair)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ListaInstrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListaMusicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListaAlbuns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListaMusicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListaProdutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListaReposicoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListaEstatiscas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(ListaProdutores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListaMusicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListaAlbuns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListaMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListaInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListaReposicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListaEstatiscas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Sair)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaMusicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMusicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaMusicosActionPerformed

    private void ListaAlbunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaAlbunsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaAlbunsActionPerformed

    private void ListaProdutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaProdutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaProdutoresActionPerformed

    private void ListaMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMusicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaMusicasActionPerformed

    private void ListaInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaInstrumentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaInstrumentosActionPerformed

    private void ListaReposicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaReposicoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaReposicoesActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void ListaEstatiscasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaEstatiscasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaEstatiscasActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListaAlbuns;
    private javax.swing.JButton ListaEstatiscas;
    private javax.swing.JButton ListaInstrumentos;
    private javax.swing.JButton ListaMusicas;
    private javax.swing.JButton ListaMusicos;
    private javax.swing.JButton ListaProdutores;
    private javax.swing.JButton ListaReposicoes;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
