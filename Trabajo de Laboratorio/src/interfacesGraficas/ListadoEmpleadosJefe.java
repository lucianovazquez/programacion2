/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import excepciones.TipoEmpleadoNoValidoException;
import excepciones.YaTieneUnJefeException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabajodelaboratorio.Administrativo;
import trabajodelaboratorio.Empleado;
import trabajodelaboratorio.Jefe;
import trabajodelaboratorio.Operario;

/**
 *
 * @author Luciano
 */
public class ListadoEmpleadosJefe extends javax.swing.JPanel {

    /**
     * Creates new form ListadoEmpleadosJefe
     */
    Jefe emp;
    javax.swing.JPanel panel;
    javax.swing.JFrame ventana;
    javax.swing.JPanel panelAnt;
    javax.swing.JPanel panelPrincipal;
    ArrayList <Empleado> arrayRoque = new ArrayList();
    
    
    public ListadoEmpleadosJefe(Jefe emp,javax.swing.JPanel panel,javax.swing.JFrame ventana,javax.swing.JPanel panelAnt,javax.swing.JPanel panelPrincipal) {
        initComponents();
        this.emp=emp;
        this.panel=panel;
        this.ventana=ventana;
        this.panelAnt=panelAnt;
        this.panelPrincipal=panelPrincipal;
        
        jLabel2.setText(emp.getNombre()+" "+emp.getApellido());
        
        VentanaPrincipal vp = (VentanaPrincipal)ventana;
        ArrayList<Empleado> lista = vp.getEmpleados();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Operario || lista.get(i) instanceof Administrativo)
                arrayRoque.add(lista.get(i));
        }
 
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        Object[] fila = new Object[tableModel.getColumnCount()];
     
         for (int i = 0; i < arrayRoque.size(); i++) {
            {
            fila[0] = arrayRoque.get(i).getNroLegajo();
            fila[1] = arrayRoque.get(i).getNombre();
            fila[2] = arrayRoque.get(i).getApellido();
            fila[3] = arrayRoque.get(i).getTipoCargo();
            fila[4] = arrayRoque.get(i).getFecIngreso();
            tableModel.addRow(fila);
            }
         }
         jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Legajo", "Nombre", "Apellido", "Cargo", "Ingreso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Seleccionar los empleados a cargo del Jefe de Área:");

        jLabel2.setText("jLabel2");

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
  
    int indice;
    indice= jTable1.getSelectedRow();
    if(indice==-1){
        JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");       
        return;
    }
     Empleado empleado = (Empleado)arrayRoque.get(indice);
    for(int i=0;i<emp.getNominaEmpleados().size();i++){
        if(emp.getNominaEmpleados().get(i).getNroLegajo()==empleado.getNroLegajo()){
            JOptionPane.showMessageDialog(this, "El empleado seleccionado ya se encuentra en la lista.");
            this.setVisible(false);
            DatosLaboralesJefe panelSig = new DatosLaboralesJefe(panelPrincipal,(Jefe)emp,panelAnt,ventana);
            ventana.setContentPane(panelSig);
            panelSig.setVisible(true);
            return;
        }
    }
    if(empleado instanceof Operario){
        try {
            Operario operario = (Operario)empleado;
            try {
                emp.addEmpleadoANomina(empleado);
            } catch (TipoEmpleadoNoValidoException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }

        } catch (YaTieneUnJefeException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
     
    if(empleado instanceof Administrativo){
        try {
            Administrativo administrativo = (Administrativo)empleado;
            try {
                emp.addEmpleadoANomina(empleado);
            } catch (TipoEmpleadoNoValidoException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        } catch (YaTieneUnJefeException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
     
     this.setVisible(false);
     DatosLaboralesJefe panelSig = new DatosLaboralesJefe(panelPrincipal,(Jefe)emp,panelAnt,ventana);
     ventana.setContentPane(panelSig);
     panelSig.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
