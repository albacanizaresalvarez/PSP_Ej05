package Vista;

import Controlador.*;
import Modelo.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JFramePrincipal extends javax.swing.JFrame {

    public JFramePrincipal() throws SQLException {

        initComponents();
        this.setLocationRelativeTo(null);
        java.awt.Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        tutor = new Tutor(usuario, contrasena);

        jPanelInicio = new JPanelInicio();
        this.cambiarPanel(jPanelInicio);
        mostrarMenu(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuValidar = new javax.swing.JMenu();
        jMenuItemEntrar = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuVisualizar = new javax.swing.JMenu();
        jMenuItemDetalle = new javax.swing.JMenuItem();
        jMenuItemResumen = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenu();
        jMenuItemAutor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Práctica Java 5 BDs - Derby");
        setAlwaysOnTop(true);

        jMenuValidar.setText("Validar");

        jMenuItemEntrar.setText("Entrar");
        jMenuItemEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntrarActionPerformed(evt);
            }
        });
        jMenuValidar.add(jMenuItemEntrar);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuValidar.add(jMenuItemSalir);

        jMenuBar1.add(jMenuValidar);

        jMenuVisualizar.setText("Visualizar");

        jMenuItemDetalle.setText("Detalle");
        jMenuItemDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDetalleActionPerformed(evt);
            }
        });
        jMenuVisualizar.add(jMenuItemDetalle);

        jMenuItemResumen.setText("Resumen");
        jMenuItemResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemResumenActionPerformed(evt);
            }
        });
        jMenuVisualizar.add(jMenuItemResumen);

        jMenuBar1.add(jMenuVisualizar);

        jMenuAcercaDe.setText("Acerca de");

        jMenuItemAutor.setText("Autor");
        jMenuItemAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAutorActionPerformed(evt);
            }
        });
        jMenuAcercaDe.add(jMenuItemAutor);

        jMenuBar1.add(jMenuAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAutorActionPerformed

        JDialogAutor jDialogAutor = new JDialogAutor(this, true);

        jDialogAutor.setResizable(false);
        jDialogAutor.setLocationRelativeTo(null);
        jDialogAutor.setVisible(true);
    }//GEN-LAST:event_jMenuItemAutorActionPerformed

    private void jMenuItemEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntrarActionPerformed
        jPanelEntrar = new JPanelEntrar();
        this.cambiarPanel(jPanelEntrar);

    }//GEN-LAST:event_jMenuItemEntrarActionPerformed

    private void jMenuItemDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDetalleActionPerformed
        try{
        jPanelDetalle = new JPanelDetalle(tutor);
        this.cambiarPanel(jPanelDetalle);
        } catch (SQLException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jMenuItemDetalleActionPerformed

    private void jMenuItemResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemResumenActionPerformed
        jPanelResumen = new JPanelResumen();
        this.cambiarPanel(jPanelResumen);
    }//GEN-LAST:event_jMenuItemResumenActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        mostrarMenu(false);
        this.cambiarPanel(jPanelInicio);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed
    public void mostrarMenu(boolean mostrar) {
        jMenuAcercaDe.setVisible(mostrar);
        jMenuVisualizar.setVisible(mostrar);
    }

    public void cambiarPanel(javax.swing.JPanel panel) {
        this.setContentPane(panel);
        this.pack();
    }

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFramePrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAcercaDe;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAutor;
    private javax.swing.JMenuItem jMenuItemDetalle;
    private javax.swing.JMenuItem jMenuItemEntrar;
    private javax.swing.JMenuItem jMenuItemResumen;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuValidar;
    private javax.swing.JMenu jMenuVisualizar;
    // End of variables declaration//GEN-END:variables
    private final JPanelInicio jPanelInicio;
    private JPanelEntrar jPanelEntrar;
    private  JPanelResumen jPanelResumen;
    private JPanelDetalle jPanelDetalle;

    Tutor tutor;
    String usuario = "";
    String contrasena = "";

    JPanel getJFramePricipal() {
        return jPanelInicio;
    }

    JPanel getJPanelDetalle() {
        return jPanelDetalle;
    }

}
