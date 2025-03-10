
package eliabjarabalipermiclienteimc.vistas;

import eliabRjaraba.seminario.imc.rmi.lib.*;
import java.awt.Color;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;


import javax.swing.JOptionPane;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Client;


public class VentanaPrincipal extends javax.swing.JFrame {

    CallHandler invocadorRemoto;
    String ipServidor = "localhost";
    int puerto = 9007;
    IRemotaCalculoImc calculoImcRemoto;
    Client cliente;
    
    public VentanaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        campoIPServisor = new javax.swing.JTextField();
        campoPuerto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        campoPeso = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        btnIniciar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE IMC");

        btnIniciar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 255, 0));
        btnIniciar.setText("Conectar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel2.setText("DIRECCION IP:");

        jLabel3.setText("PUERTO DE RED:");

        jLabel4.setText("ESTADO:");

        txtEstado.setForeground(new java.awt.Color(255, 51, 51));
        txtEstado.setText("Descorectado");

        campoIPServisor.setText("localhost");
        campoIPServisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIPServisorActionPerformed(evt);
            }
        });

        campoPuerto.setText("9007");
        campoPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPuertoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(campoPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(campoIPServisor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(campoIPServisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEstado))
                        .addGap(9, 9, 9)))
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("CONEXION", jPanel1);

        campoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesoActionPerformed(evt);
            }
        });

        jLabel6.setText("PESO:");

        jLabel7.setText("ALTURA:");

        jLabel8.setText("IMC:");

        txtResultado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 0, 51));
        txtResultado.setText("0.0");

        btnIniciar1.setBackground(new java.awt.Color(204, 204, 204));
        btnIniciar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnIniciar1.setForeground(new java.awt.Color(0, 204, 0));
        btnIniciar1.setText("CALCULAR");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtResultado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoPeso)
                            .addComponent(campoAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnIniciar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtResultado)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("CALCULAR IMC", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
       try {
            if (btnIniciar.getText().equalsIgnoreCase("Conectar")) {
                puerto = Integer.parseInt(campoPuerto.getText());
                ipServidor = campoIPServisor.getText();
                invocadorRemoto = new CallHandler();
                cliente = new Client(ipServidor, puerto, invocadorRemoto ) ;
                calculoImcRemoto= (IRemotaCalculoImc) cliente.getGlobal(IRemotaCalculoImc.class);
              
                btnIniciar.setText("Desconectar");
                btnIniciar.setForeground(Color.RED);
                txtEstado.setText("Conectar");
                txtEstado.setForeground(Color.GREEN);
            } else if (btnIniciar.getText().equalsIgnoreCase("Desconectar")) {
               
                    cliente.close();
                
                btnIniciar.setText("Conectar");
                txtEstado.setText("Desconectado");
                btnIniciar.setForeground(Color.GREEN);
                txtEstado.setForeground(Color.RED);
            } 
        }catch (IOException ex) {
            System.out.println("ERROR AL CONECTAR");
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void campoPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPuertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPuertoActionPerformed

    private void campoIPServisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIPServisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIPServisorActionPerformed

    private void campoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesoActionPerformed

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
       float peso =Float.parseFloat(campoPeso.getText());
       float altura =Float.parseFloat(campoAltura.getText());
       Thread hilo = new Thread(){
           @Override
           public void run(){
               try {
                   System.out.println("peso: " + peso);
                   System.out.println("peso: " + altura);
                   DatosImc  datos = new DatosImc();
                   datos.setAltura(altura);
                   datos.setPeso(peso);
                   System.out.println("Enviando los datos\nEsperando respuesta");
                   datos = calculoImcRemoto.calcularImc(datos);
                   System.out.println("IMC: " + datos.getResultado() + "\nMesage: " + datos.getInterpretacion());
                   txtResultado.setText(datos.getResultado() + "");
                   txtMensaje.setText(datos.getInterpretacion());
               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(VentanaPrincipal.this, "ERROR con el cliente" + ex.getMessage());
                   System.out.println("ERROR con el cliente " + ex.getMessage());
                   ex.printStackTrace();
               }
           }
       };
       hilo.start();
    }//GEN-LAST:event_btnIniciar1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoIPServisor;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoPuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
