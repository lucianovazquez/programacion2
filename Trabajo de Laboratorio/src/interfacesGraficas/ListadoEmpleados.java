/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabajodelaboratorio.Administrativo;
import trabajodelaboratorio.Empleado;
import trabajodelaboratorio.EmpleadoNominaJefe;
import trabajodelaboratorio.Jefe;
import trabajodelaboratorio.Operario;

/**
 *
 * @author Luciano
 */
public class ListadoEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form ListadoEmpleados
     */
    javax.swing.JFrame ventana;
    javax.swing.JPanel panel;
    
    public ListadoEmpleados( javax.swing.JFrame ventana,javax.swing.JPanel panel) {
        
        initComponents();
        this.ventana=ventana;
        this.panel=panel;
        this.setSize(420, 330);
        
       
        //jLabel1.setText(vp.getEmpleados().get(0).getNombre());
        VentanaPrincipal vp = (VentanaPrincipal)ventana;
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
     ArrayList<Empleado> lista = vp.getEmpleados();
     Object[] fila = new Object[tableModel.getColumnCount()];
 
         for (int i = 0; i < lista.size(); i++) {
         
            fila[0] = lista.get(i).getNroLegajo();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getApellido();
            fila[3] = lista.get(i).getTipoCargo();
            fila[4] = lista.get(i).getFecIngreso();
            tableModel.addRow(fila);
            
         }
         jTable1.setModel(tableModel);
    }
 public ListadoEmpleados(){}
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Legajo", "Nombre", "Apellido", "Cargo", "Ingreso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Volver");
        jButton1.setToolTipText("Regresar al Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listado de Empleados");

        jButton2.setText("Eliminar");
        jButton2.setToolTipText("Eliminar al Empleado Seleccionado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ver Familia");
        jButton3.setToolTipText("Familiares a Cargo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por N° de Legajo:");

        jTextField1.setToolTipText("Ingrese N° de legajo");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton1)))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        ventana.setContentPane(panel);
       panel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opcion");
            return;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        
        /* Obtener el empleado que se desea eliminar seleccionado en la tabla, obtenerlo desde el array empleados */
        Empleado emp = VentanaPrincipal.empleados.get(jTable1.getSelectedRow());
        
        /* Si es operario o administrador */
        if(emp instanceof Operario || emp instanceof Administrativo){
            /* Castear el empleado para acceder a los metodos de empleadoNominaJefe*/
            EmpleadoNominaJefe empleadoNominaJefe = (EmpleadoNominaJefe)emp;
            /* Obtener jefe del empleado*/
            Jefe jefe = empleadoNominaJefe.getJefe();
            if(jefe != null){
                /* Si tiene un jefe asignado eliminarlo de la nomina de ese jefe*/
                jefe.eliminarEmpleadoDeNomina(emp);
            }
        }
        
        /* Si es un jefe*/
        if(emp instanceof Jefe){
            Jefe jefe =(Jefe)emp;
            ArrayList<Empleado> nominaEmpleados = jefe.getNominaEmpleados();
            /* Desvincular el jefe de todos los empleados que tenia a cargo */
            for(int i=0;i<nominaEmpleados.size();i++){
                Empleado empleadoNomina = nominaEmpleados.get(i);
                if(empleadoNomina instanceof Operario || empleadoNomina instanceof Administrativo){
                    EmpleadoNominaJefe empleadoNominaJefe = (EmpleadoNominaJefe)empleadoNomina;
                    empleadoNominaJefe.deleteJefe();
                }
            }
        }
        
        /* Borrar empleado del array empleados*/
        VentanaPrincipal.empleados.remove(jTable1.getSelectedRow());
        tableModel.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int indice = jTable1.getSelectedRow();
        if(indice==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");       
        }
        else{
            this.setVisible(false);
            ListadoFamiliares panelSig = new ListadoFamiliares(this,ventana,indice);
            ventana.setContentPane(panelSig);
            panelSig.setVisible(true);
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTextField1.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Debe ingresar un número de legajo.");
        int nroLeg;
        int ok=0;
        int nroBuscar=Integer.parseInt(jTextField1.getText().trim());
        Empleado empBuscado= new Empleado() {};
        VentanaPrincipal vp=(VentanaPrincipal)ventana;
        jButton4.setEnabled(false);
        
        for (int i = 0; i < vp.getEmpleados().size(); i++) {
            nroLeg=vp.getEmpleados().get(i).getNroLegajo();
            if(nroLeg==nroBuscar){
                empBuscado=vp.getEmpleados().get(i);
                ok=1;
            }
        }
        if(ok==0)
            JOptionPane.showMessageDialog(this, "No se encontraron resultados.");
            
        else{
            
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        Object[] fila = new Object[tableModel.getColumnCount()];
        
        
            for (int i = 0; i < vp.getEmpleados().size(); i++){
                tableModel.removeRow(0);
           }
        
       
            fila[0] = empBuscado.getNroLegajo();
            fila[1] = empBuscado.getNombre();
            fila[2] = empBuscado.getApellido();
            fila[3] = empBuscado.getTipoCargo();
            fila[4] = empBuscado.getFecIngreso();
            
            tableModel.addRow(fila);
            jTable1.setModel(tableModel);
    }//GEN-LAST:event_jButton4ActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
