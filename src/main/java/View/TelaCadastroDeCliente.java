/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastrodeplanoController;
import Controller.ClienteController;
import Model.Cadastrodeplano;
import Model.ClienteModel;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author ALUNO
 */
public class TelaCadastroDeCliente extends javax.swing.JFrame {
    
    ClienteController controler = new ClienteController();
    
    
    /**
     * Creates new form telaCadastro
     */
    public TelaCadastroDeCliente() {
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

        painelCadastro1 = new javax.swing.JPanel();
        telefoneCliente = new javax.swing.JFormattedTextField();
        nomeCompleto = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        campoCpf = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        endereço = new javax.swing.JLabel();
        enderecoCliente = new javax.swing.JTextField();
        emailCliente = new javax.swing.JTextField();
        nomeCompletocampo = new javax.swing.JTextField();
        cadastrarCliente = new javax.swing.JButton();
        cpfCliente = new javax.swing.JFormattedTextField();
        editarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        planoCliente = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        voltarMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        butonHome = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCadastro1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefoneCliente.setBackground(new java.awt.Color(102, 0, 102));
        telefoneCliente.setForeground(new java.awt.Color(255, 255, 255));
        try {
            telefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        painelCadastro1.add(telefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 340, 30));

        nomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        nomeCompleto.setText("NOME COMPLETO:");
        painelCadastro1.add(nomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, -1));

        email.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("E-MAIL:");
        painelCadastro1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        campoCpf.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        campoCpf.setForeground(new java.awt.Color(255, 255, 255));
        campoCpf.setText("CPF:");
        painelCadastro1.add(campoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        telefone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        telefone.setForeground(new java.awt.Color(255, 255, 255));
        telefone.setText("TELEFONE:");
        painelCadastro1.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        endereço.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        endereço.setForeground(new java.awt.Color(255, 255, 255));
        endereço.setText("ENDEREÇO:");
        painelCadastro1.add(endereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        enderecoCliente.setBackground(new java.awt.Color(102, 0, 102));
        enderecoCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        enderecoCliente.setForeground(new java.awt.Color(255, 255, 255));
        enderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoClienteActionPerformed(evt);
            }
        });
        painelCadastro1.add(enderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 340, 30));

        emailCliente.setBackground(new java.awt.Color(102, 0, 102));
        emailCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        emailCliente.setForeground(new java.awt.Color(255, 255, 255));
        emailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteActionPerformed(evt);
            }
        });
        painelCadastro1.add(emailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 340, -1));

        nomeCompletocampo.setBackground(new java.awt.Color(102, 0, 102));
        nomeCompletocampo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        nomeCompletocampo.setForeground(new java.awt.Color(255, 255, 255));
        painelCadastro1.add(nomeCompletocampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 340, -1));

        cadastrarCliente.setBackground(new java.awt.Color(102, 0, 102));
        cadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarCliente.setText("CADASTRAR");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        painelCadastro1.add(cadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 130, 30));

        cpfCliente.setBackground(new java.awt.Color(102, 0, 102));
        cpfCliente.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        painelCadastro1.add(cpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 340, 30));

        editarCliente.setBackground(new java.awt.Color(102, 0, 102));
        editarCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editarCliente.setForeground(new java.awt.Color(255, 255, 255));
        editarCliente.setText("EDITAR");
        painelCadastro1.add(editarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXCLUIR");
        painelCadastro1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 110, -1));

        planoCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        planoCliente.setForeground(new java.awt.Color(255, 255, 255));
        planoCliente.setText("PLANO:");
        painelCadastro1.add(planoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 116, 70, 30));

        jComboBox1.setBackground(new java.awt.Color(102, 0, 102));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        painelCadastro1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 290, -1));

        voltarMenu.setBackground(new java.awt.Color(102, 0, 102));
        voltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        voltarMenu.setForeground(new java.awt.Color(255, 255, 255));
        voltarMenu.setText("VOLTAR");
        voltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuActionPerformed(evt);
            }
        });
        painelCadastro1.add(voltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 130, -1));

        tabelaCliente.setBackground(new java.awt.Color(102, 0, 102));
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome do Cliente", "Email", "CPF", "Telefone", "Endereço", "Plano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        painelCadastro1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 900, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cadastro (2).png"))); // NOI18N
        painelCadastro1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 680));

        butonHome.setText("HOME");
        jMenuBar1.add(butonHome);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoClienteActionPerformed

    private void emailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailClienteActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        // TODO add your handling code here:
       ClienteModel cliente = new ClienteModel();

      cliente.setNomeCliente((String)nomeCompletocampo.getText());
      cliente.setEmailCliente((String)emailCliente.getText());
      cliente.setCpfCliente((String)cpfCliente.getText());
      cliente.setTelefoneCliente((String)telefoneCliente.getText());
      cliente.setEnderecoCliente((String)enderecoCliente.getText());
     
      // boolean result = controler.CadastroCliente(cliente);
            
      if (controler.CadastroCliente(cliente)!=false){
            JOptionPane.showMessageDialog(null, "Cadastro de cliente realizado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar");
        }
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuActionPerformed
        // TODO add your handling code here:
        TelaHome voltarMenu = new TelaHome() ;
        voltarMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroDeCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu butonHome;
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JLabel campoCpf;
    private javax.swing.JFormattedTextField cpfCliente;
    private javax.swing.JButton editarCliente;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailCliente;
    private javax.swing.JTextField enderecoCliente;
    private javax.swing.JLabel endereço;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeCompleto;
    private javax.swing.JTextField nomeCompletocampo;
    private javax.swing.JPanel painelCadastro1;
    private javax.swing.JLabel planoCliente;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JLabel telefone;
    private javax.swing.JFormattedTextField telefoneCliente;
    private javax.swing.JButton voltarMenu;
    // End of variables declaration//GEN-END:variables
}
