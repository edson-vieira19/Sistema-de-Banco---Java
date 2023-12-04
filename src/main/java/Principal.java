
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Apache NetBeans IDE 19
 *
 * @author Edson Vieira da Silva ra: 743674
 * 
 */
public class Principal extends javax.swing.JFrame {

    private static Principal instancia;
    
    public Principal() {
        initComponents();
    }

    public static Principal getInstance(){
        if(instancia == null){
            instancia = new Principal();
        }
        return instancia;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        btnCorrente = new javax.swing.JButton();
        btnPoupanca = new javax.swing.JButton();
        btnSalario = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Banco");
        setResizable(false);

        lblBemVindo.setText("BEM VINDO AO NOSSO SISTEMA DE BANCO!");

        lblTipo.setText("Qual o tipo de conta deseja operar?");

        btnCorrente.setText("Conta Corrente...");
        btnCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrenteActionPerformed(evt);
            }
        });

        btnPoupanca.setText("Conta Poupança...");

        btnSalario.setText("Conta Salário...");

        btnSair.setBackground(new java.awt.Color(255, 153, 153));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(lblBemVindo))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnCorrente)
                                    .addGap(31, 31, 31)
                                    .addComponent(btnPoupanca)
                                    .addGap(11, 11, 11))
                                .addComponent(lblTipo))
                            .addGap(18, 18, 18)
                            .addComponent(btnSalario))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblBemVindo)
                .addGap(55, 55, 55)
                .addComponent(lblTipo)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPoupanca)
                    .addComponent(btnCorrente)
                    .addComponent(btnSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(35, 35, 35))
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

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrenteActionPerformed
        
        abrirJanelaContaCorrente();
        
    }//GEN-LAST:event_btnCorrenteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorrente;
    private javax.swing.JButton btnPoupanca;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables

    private void sair() {

        int resposta = JOptionPane.showConfirmDialog(
                this, "Deseja realmente sair?", "Sair da Aplicação",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {
            // Se o usuário escolher "Sim", fecha a aplicação
            this.dispose();
            System.exit(0);
        }
    }

    private void abrirJanelaContaCorrente() {

        AcessarContaCorrente janelaContaCorrente = AcessarContaCorrente.getInstance();

        Principal.segundoPlano(this,true);
                
        janelaContaCorrente.setVisible(true);
    }
    
    
    public static void segundoPlano(JFrame janela, boolean valor){
        
       janela.setEnabled(valor);  
    
    }
    
    
}


