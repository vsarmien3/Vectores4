/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author vsarmien3
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    double v[];
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadomanual = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdllenadoautomatico = new javax.swing.JButton();
        cmdnumerorepetido = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("OPERACIONES CON VECTORES");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 21, -1, 20));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, -1));

        cmdLlenadomanual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenadomanual.setText("Llenado manual");
        cmdLlenadomanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadomanualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadomanual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        cmdBorrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, -1));

        cmdllenadoautomatico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdllenadoautomatico.setText("Llenado automatico");
        cmdllenadoautomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdllenadoautomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdllenadoautomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        cmdnumerorepetido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdnumerorepetido.setText("Número repetido");
        cmdnumerorepetido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdnumerorepetidoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdnumerorepetido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, -1));

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 170, 250));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 100));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 180));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 340));

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

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int longitud;

        if(txtLongitud.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite la longitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        }else if(txtLongitud.getText().trim().equals("0")){
            JOptionPane.showMessageDialog(this, "La longitud debe ser mayor que cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }else{

            longitud = Integer.parseInt(txtLongitud.getText());
            v = new double[longitud];
           

            JOptionPane.showMessageDialog(this, "Vector a sido creado satisfactoriamente!");

            cmdCrear.setEnabled(false);
            cmdLlenadomanual.setEnabled(true);
            cmdllenadoautomatico.setEnabled(true);
            cmdnumerorepetido.setEnabled(false);
            cmdBorrar.setEnabled(true);
            txtLongitud.setEditable(false);

        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadomanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadomanualActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog(this,"Ingrese el elemento número:"+ (i+1)) +"de V" );
            v[i] = n;
           
            cmdCrear.setEnabled(false);
            cmdLlenadomanual.setEnabled(false);
            cmdllenadoautomatico.setEnabled(false);
            cmdnumerorepetido.setEnabled(true);
            cmdBorrar.setEnabled(true);

        }
    }//GEN-LAST:event_cmdLlenadomanualActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
        txtLongitud.setText("");
        txtLongitud.requestFocusInWindow();
        v = null;
        

        cmdCrear.setEnabled(true);
        cmdLlenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdnumerorepetido.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(true);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdllenadoautomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdllenadoautomaticoActionPerformed
        // TODO add your handling code here:
        double f, d;
        {
            f= Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el limite del llenado automatico "));
            while (f<v.length){
                JOptionPane.showMessageDialog(this, "El número no puede ser menor que "+v.length);
                f = Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el limite del llenado automatico "));
            }
            for (int i = 0; i < v.length; i++) {

                d =(int)(Math.random()*f + 1);
                v[i]=d;
            }
            
        }

        JOptionPane.showMessageDialog(this,"Vector llenado satisfactorio");

        cmdCrear.setEnabled(false);
        cmdLlenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdnumerorepetido.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdllenadoautomaticoActionPerformed

    private void cmdnumerorepetidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnumerorepetidoActionPerformed
        // TODO add your handling code here:
        double contador = 1, numero = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
           if(v[i]==v[j]&&(i!=j)){
               contador = contador+1;
               numero = v[i];
           }     
          }
        }
   if(contador>1){
       txtResultado.append("Número más repetido "+numero);
   } 
   else{
       txtResultado.append("No hay número repetido"); 
   }
    }//GEN-LAST:event_cmdnumerorepetidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
else{
        for (int i=0 ; i<v.length ; i++){
    txtResultado.append(v[i]+"\n");
        }
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenadomanual;
    private javax.swing.JButton cmdllenadoautomatico;
    private javax.swing.JButton cmdnumerorepetido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
