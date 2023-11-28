
package Vista;
//import Controlador.*;
import Controlador.*;
import Modelo.*;
import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;
/**
 *
 * @author irene
 */
public class JPanelEntrar extends javax.swing.JPanel {
    ControladorTutor controladorT;
    
    public JPanelEntrar() {
        initComponents();
        controladorT =new ControladorTutor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        jLabelUsuario.setText("Usuario:");

        jLabelContrasena.setText("Contraseña:");

        txtUsuario.setText("tutoralumno");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtContrasena.setText("tutoralumno");
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        jButtonAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelContrasena))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrasena)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAceptar))
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        //Prueba
        System.out.println("Has aceptado");
//        if(txtUsuario.getText().equals("tutoralumno")){
//            if(txtContrasena.getText().equals("tutoralumno")){
//                ((JFramePrincipal) SwingUtilities.getWindowAncestor(this)).mostrarMenu(true);
//        
////                JFramePrincipal framePrincipal = (JFramePrincipal) SwingUtilities.getWindowAncestor(this);
////                framePrincipal.cambiarPanel(framePrincipal.getJPanelDetalle());
//            }
//        }else{
//            System.out.println("El usuario o la contraseña son incorrectos");
//            txtUsuario.setText("");
//            txtContrasena.setText("");
//        }


      boolean ok=controladorT.entrar(txtUsuario.getText(),txtContrasena.getText());
        
       if(ok){
           
        JOptionPane.showMessageDialog(this, "Se ha conectado exitosamente");
        ((JFramePrincipal) SwingUtilities.getWindowAncestor(this)).mostrarMenu(true); 
//        JFramePrincipal framePrincipal = (JFramePrincipal) SwingUtilities.getWindowAncestor(this);
//        framePrincipal.cambiarPanel(framePrincipal.getJPanelDetalle());
        
       }
       else{
           JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos");
       }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Prueba
        System.out.println("Has cancelado");
        
          //Ocultar los elementos del menu del JFramePrincipal
        ((JFramePrincipal) SwingUtilities.getWindowAncestor(this)).mostrarMenu(false);
        
        //Volver al JFramePrincipal
        JFramePrincipal framePrincipal = (JFramePrincipal) SwingUtilities.getWindowAncestor(this);
        framePrincipal.cambiarPanel(framePrincipal.getJFramePricipal());
        
    
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
Tutor tutor;


}
