
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author edson vieira da silva ra: 743674
 */
public class NovaContaCorrente extends javax.swing.JFrame {
    
    boolean formInvalido = false;

    private static NovaContaCorrente instancia;
    
    private static final ServidorDoBanco
            servidor = ServidorDoBanco.getInstance();
    
    private static ContaCorrente contaCorrente;
    
    public NovaContaCorrente() {
        initComponents();
    }

    public static NovaContaCorrente getInstance(){
    
        if(instancia == null){
            instancia = new NovaContaCorrente();
        }
            return instancia;
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldCidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldEstado = new javax.swing.JTextField();
        fieldCEP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abrir Nova Conta Corrente");
        setResizable(false);

        jLabel1.setText("ABERTURA DE NOVA CONTA CORRENTE");

        jLabel2.setText("Digite as Informações:");

        fieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNomeKeyPressed(evt);
            }
        });

        jLabel3.setText("Nome do Titular:");

        jLabel4.setText("CPF:");

        fieldCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldCPFKeyPressed(evt);
            }
        });

        jLabel5.setText("Telefone:");

        fieldTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldTelefoneKeyPressed(evt);
            }
        });

        jLabel6.setText("E-mail:");

        fieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldEmailKeyPressed(evt);
            }
        });

        jLabel7.setText("Informe o Endereço do Tiitular:");

        fieldRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldRuaKeyPressed(evt);
            }
        });

        jLabel8.setText("Rua:");

        fieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNumeroKeyPressed(evt);
            }
        });

        jLabel9.setText("numero:");

        fieldCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldCidadeKeyPressed(evt);
            }
        });

        jLabel10.setText("Cidade:");

        jLabel11.setText("Estado:");

        fieldEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldEstadoKeyPressed(evt);
            }
        });

        fieldCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldCEPKeyPressed(evt);
            }
        });

        jLabel12.setText("CEP:");

        btnEnviar.setBackground(new java.awt.Color(102, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(255, 51, 51));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(painelLayout.createSequentialGroup()
                                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(fieldCPF)
                                        .addComponent(fieldTelefone)
                                        .addComponent(fieldEmail)))
                                .addComponent(jLabel1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                            .addGap(261, 261, 261)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelLayout.createSequentialGroup()
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLayout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel7)))
                                .addGroup(painelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(fieldCEP))))
                            .addGap(30, 30, 30)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(fieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btVoltar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        criarConta();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void fieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNomeKeyPressed
        if(formInvalido){
        restaurarBordas();
        formInvalido = false;
        }
    }//GEN-LAST:event_fieldNomeKeyPressed

    private void fieldCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCPFKeyPressed
       if(formInvalido){
           restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldCPFKeyPressed

    private void fieldTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTelefoneKeyPressed
       if(formInvalido){
           restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldTelefoneKeyPressed

    private void fieldEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEmailKeyPressed
        if(formInvalido){
            restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldEmailKeyPressed

    private void fieldRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldRuaKeyPressed
        if(formInvalido){
           restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldRuaKeyPressed

    private void fieldNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNumeroKeyPressed
        if(formInvalido){
           restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldNumeroKeyPressed

    private void fieldCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCidadeKeyPressed
        if(formInvalido){
           restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldCidadeKeyPressed

    private void fieldEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEstadoKeyPressed
        if(formInvalido){
           restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldEstadoKeyPressed

    private void fieldCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCEPKeyPressed
        if(formInvalido){
           restaurarBordas();
           formInvalido = false;
       }
    }//GEN-LAST:event_fieldCEPKeyPressed

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
            java.util.logging.Logger.getLogger(NovaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaContaCorrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JTextField fieldCEP;
    private javax.swing.JTextField fieldCPF;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldEstado;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldRua;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables

    
    private void criarConta() {
        
        contaCorrente = new ContaCorrente();
        
        String nome = fieldNome.getText().trim();
        
        if(nome.isBlank() || !nome.matches
        ("^[A-Za-zÀ-ú]+(?:\\s[A-Za-zÀ-ú]+)*$")){
            
            fieldNome.setBorder(BorderFactory.
                    createLineBorder(Color.RED));
            
            fieldNome.requestFocus();
            
            formInvalido = true;
        }
        else{
            contaCorrente.getTitular().setNome(fieldNome.getText());       
        }
        
        try{
        int cpf = Integer.parseInt(fieldCPF.getText().trim());
        contaCorrente.getTitular().setCpf(cpf);
        }
        catch(NumberFormatException ex){
        
            fieldCPF.setBorder(BorderFactory.
                    createLineBorder(Color.RED));
            
            fieldCPF.requestFocus();
            
            formInvalido = true;
        }
        
        String telefone = fieldTelefone.getText().trim();
        
        if(telefone.isBlank() || !telefone.matches("^0?\\(?\\d+\\)?[/\\d\\s]*([.-]?\\d+)*$")){
          fieldTelefone.setBorder(BorderFactory.
                    createLineBorder(Color.RED));
          
          fieldTelefone.requestFocus();
          formInvalido = true;
        }
        else{
            contaCorrente.getTitular().setTelefone(telefone);
        }
        
        String rua = fieldRua.getText().trim();
        
        if(rua.isBlank() || !rua.matches("^[A-Za-zÀ-ú]+(?:\\s[A-Za-zÀ-ú]+)*$")){
             fieldRua.setBorder(BorderFactory.
                    createLineBorder(Color.RED));
          fieldRua.requestFocus();
          formInvalido = true;
        }
        else{
            contaCorrente.getTitular().getEndereco().setRua(rua);       
         }
       
       try{
            int numero = Integer.parseInt(fieldNumero.getText().trim());
            contaCorrente.getTitular().getEndereco().setNumero(numero);
       } 
       catch(NumberFormatException ex){
           fieldNumero.setBorder(BorderFactory.
                    createLineBorder(Color.RED));
          formInvalido = true;
          fieldNumero.requestFocus();
       
       } 
       
       String cidade = fieldCidade.getText().trim();
       
       if(cidade.isBlank() || !cidade.matches("^[A-Za-zÀ-ú]+(?:\\s[A-Za-zÀ-ú]+)*$")){
           fieldCidade.setBorder(BorderFactory.
                    createLineBorder(Color.RED));
          formInvalido = true;
          fieldCidade.requestFocus();
       }
       else{
           contaCorrente.getTitular().getEndereco().setCidade(cidade);
       }
       
        String estado = fieldEstado.getText().trim();
        
        if(estado.isBlank() || !estado.matches("^[A-Za-zÀ-ú]+(?:\\s[A-Za-zÀ-ú]+)*$")){
          fieldEstado.setBorder(BorderFactory.
                    createLineBorder(Color.RED)); 
          formInvalido = true;
          fieldEstado.requestFocus();
        }
        else{
            contaCorrente.getTitular().getEndereco().setEstado(estado);
        }
       
        String cep = fieldCEP.getText().trim();
        
        if(cep.isBlank() || !cep.matches("^\\(?\\d{1,}\\)?[/\\d]*([.-]?\\d+)*$")){
        fieldCEP.setBorder(BorderFactory.
                    createLineBorder(Color.RED));
          formInvalido = true;
          fieldCEP.requestFocus();
        }
       
        if(!formInvalido){
             
       JOptionPane.showMessageDialog(this,
               "Conta Corrente Criada Com Sucesso!\n"
                       + "Anote o numero da sua conta: "
                       + contaCorrente.getNumeroDaConta(),
               "conta Criada",JOptionPane.INFORMATION_MESSAGE);
        
       
       try{
           int saldoInicial = Integer.parseInt(JOptionPane.showInputDialog(this,
                   "Deseja Adicionar Saldo Inicial a sua Conta",
                   "Conta Corrente",
                   JOptionPane.PLAIN_MESSAGE));
        
           contaCorrente.setSaldo(saldoInicial);
       }
       catch(NumberFormatException ex){
       
       }
       
        servidor.getListaDeContasCorrentes().add(contaCorrente);
        
        contaCorrente.imprimirInformacoes();
        
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog( this,
                "Preencha todos os campos corretamente",
                "Conta nao criada!",
                JOptionPane.ERROR_MESSAGE);
            
          fieldNome.requestFocus();
       
        }
             
    }//fim criarConta()      
    
    
    private void restaurarBordas(){
    
        fieldNome.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldCPF.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldTelefone.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldEmail.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldRua.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldNumero.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldCidade.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldEstado.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        fieldCEP.setBorder(BorderFactory.createLineBorder( Color.GRAY));
        
    }
    

    
}//fim da classe
