package FRONTEND;

import BACKEND.EstadoProducao;
import BACKEND.Sistema;
import static java.time.Month.*;

public class JanelaAdmEstatisticas extends javax.swing.JFrame {
    
    Sistema s;
    
    public JanelaAdmEstatisticas(Sistema s) {
        initComponents();
        this.s = s;
        Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstado(EstadoProducao.Pendente).size());
        Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstado(EstadoProducao.Concluida).size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        Edicao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Concluido = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel3.setText("Estatísticas");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Voltar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        Edicao.setBackground(new java.awt.Color(204, 204, 204));
        Edicao.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Edicao.setForeground(new java.awt.Color(18, 30, 49));
        Edicao.setText("Albuns em Edição:");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 30, 49));
        jLabel8.setText("Média da percentagem de sessões de gravação concluídas:");

        Concluido.setBackground(new java.awt.Color(204, 204, 204));
        Concluido.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Concluido.setForeground(new java.awt.Color(18, 30, 49));
        Concluido.setText("Total de álbuns concluídos:");

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        Mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MesMouseClicked(evt);
            }
        });
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Concluido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 139, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Edicao)
                .addGap(32, 32, 32)
                .addComponent(Concluido)
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void MesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MesMouseClicked

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed
        if (Mes.getSelectedItem().toString().equals("Todos")){
            Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstado(EstadoProducao.Pendente).size());
            Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstado(EstadoProducao.Concluida).size());
        } else {
            switch(Mes.getSelectedItem().toString()){
                case "Janeiro": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, JANUARY).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, JANUARY).size());
                    break;
                case "Fevereiro": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, FEBRUARY).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, FEBRUARY).size());
                    break;
                case "Março": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, MARCH).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, MARCH).size());
                    break;
                case "Abril": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, APRIL).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, APRIL).size());
                    break;
                case "Maio": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, MAY).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, MAY).size());
                    break;
                case "Junho": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, JUNE).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, JUNE).size());
                    break;
                case "Julho": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, JULY).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, JULY).size());
                    break;
                case "Agosto": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, AUGUST).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, AUGUST).size());
                    break;
                case "Setembro": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, SEPTEMBER).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, SEPTEMBER).size());
                    break;
                case "Outubro": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, OCTOBER).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, OCTOBER).size());
                    break;
                case "Novembro": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, NOVEMBER).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, NOVEMBER).size());
                    break;
                case "Dezembro": 
                    Edicao.setText("Albuns em edição: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Pendente, DECEMBER).size());
                    Concluido.setText("Total de álbuns concluídos: " + s.getListaAlbuns().filtrarPorEstadoMes(EstadoProducao.Concluida, DECEMBER).size());
                    break;
            }
        }
    }//GEN-LAST:event_MesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Concluido;
    private javax.swing.JLabel Edicao;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
