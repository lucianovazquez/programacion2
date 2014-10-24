/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import trabajodelaboratorio.*;
import excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author Luciano
 */

public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() throws UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
        initComponents();
        jPanel1.setSize(450, 400);
        this.setSize(450, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.rootPane.setContentPane(jPanel1);
        this.setTitle("Empresa - Gestor de Empleados");
        Empleado empleado1 = new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción");
        Empleado empleado2 = new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f);
        Empleado empleado3 = new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2));
        Empleado empleado4 = new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15));
        Empleado empleado5 = new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12));
        Empleado empleado6 = new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11));
        Empleado empleado7 = new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección");
        Empleado empleado8 = new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración");
        try {
            empleado1.addFamiliar((Familiar)new Conyuge("Teresita","Condori",'F',new Domicilio("Av.SiempreViva",123),32405326,LocalDate.of(1993,8,4)));
            empleado1.addFamiliar((Familiar)new Hijo("Maria","Condori",'F',new Domicilio("Av.SiempreViva",123),45402326,LocalDate.of(2014,8,4)));
        } catch (YaTieneUnConyugeException ex) {
            System.out.println(ex.getMessage());
        }
        
        GestionEmpleados.addEmpleado(empleado1);
        GestionEmpleados.addEmpleado(empleado2);
        GestionEmpleados.addEmpleado(empleado3);
        GestionEmpleados.addEmpleado(empleado4);
        GestionEmpleados.addEmpleado(empleado5);
        GestionEmpleados.addEmpleado(empleado6);
        GestionEmpleados.addEmpleado(empleado7);
        GestionEmpleados.addEmpleado(empleado8);

        Jefe emp=(Jefe)empleado1;
        try{    
            emp.addEmpleadoANomina(empleado3);
            emp.addEmpleadoANomina(empleado4);
            emp.addEmpleadoANomina(empleado5);
        } catch (TipoEmpleadoNoValidoException ex) {
            System.out.print(ex);
        } catch (YaTieneUnJefeException ex) {
            System.out.print(ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(450, 420));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor de Empleados");

        jButton1.setText("Ingresar Empleado");
        jButton1.setToolTipText("Agregar un Nuevo Empleado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver Empleados");
        jButton2.setToolTipText("Listado de Todos los Empleados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ver Jefes de Área");
        jButton3.setToolTipText("Listado de Jefes de Área");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator2)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.setVisible(false);
        
        ListadoEmpleados panel = new ListadoEmpleados(this,jPanel1);
        this.rootPane.setContentPane(panel);
        panel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
     IngresarEmpleadoDatosLaborales panel1 = new IngresarEmpleadoDatosLaborales(jPanel1,this);
     this.setContentPane(panel1);
     panel1.setVisible(true);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jPanel1.setVisible(false);
       ListadoJefes panelSig = new ListadoJefes(jPanel1,this);
       this.setContentPane(panelSig);
       panelSig.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
   
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
                try {
                    new VentanaPrincipal().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
