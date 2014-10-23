/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
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
     jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
        jButton6 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Legajo", "Nombre", "Apellido", "Cargo", "Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        jButton5.setText("Modificar Datos Personales");
        jButton5.setToolTipText("Modificar Datos del empleado seleccionado.");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Modificar Datos Laborales");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        int indice=0;
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número de legajo.");
            return;}
        int nroLeg;
        int ok=0;
        int nroBuscar=Integer.parseInt(jTextField1.getText().trim());
        Empleado empBuscado= new Empleado() {};
        VentanaPrincipal vp=(VentanaPrincipal)ventana;
        
        
        for (int i = 0; i < vp.getEmpleados().size(); i++) {
            nroLeg=vp.getEmpleados().get(i).getNroLegajo();
            if(nroLeg==nroBuscar){
                empBuscado=vp.getEmpleados().get(i);
                indice=i;
                ok=1;
                jTable1.getSelectionModel().setSelectionInterval(i, i);
            }
        }
        if(ok==0){
            JOptionPane.showMessageDialog(this, "No se encontraron resultados.");
        return;
        }
    
        Rectangle r = jTable1.getCellRect (indice, 0, true);
        jTable1.scrollRectToVisible(r);
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.fireTableDataChanged();
        jTable1.getSelectionModel().setSelectionInterval(indice, indice);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int indice = jTable1.getSelectedRow();
        if(indice==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");
           return;
        }
        
        this.setVisible(false);
        ModificarEmpleado panelSig = new ModificarEmpleado(indice,panel,ventana);
        ventana.setContentPane(panelSig);
        panelSig.setVisible(true);
  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       int indice = jTable1.getSelectedRow();
        if(indice==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");
           return;
        }
       
       VentanaPrincipal vp = (VentanaPrincipal)ventana;
       if(vp.getEmpleados().get(indice).getTipoCargo().equals("Vendedor")){
           ModificarVendedor panelSig = new ModificarVendedor(indice,panel,ventana);
           this.setVisible(false);
           ventana.setContentPane(panelSig);
           panelSig.setVisible(true);
       }
       if(vp.getEmpleados().get(indice).getTipoCargo().equals("Administrativo")||vp.getEmpleados().get(indice).getTipoCargo().equals("Operario")){
           ModificarAdminOperario panelSig = new ModificarAdminOperario(indice,panel,ventana);
           this.setVisible(false);
           ventana.setContentPane(panelSig);
           panelSig.setVisible(true);
       }
       if(vp.getEmpleados().get(indice).getTipoCargo().equals("Jefe")){
           ModificarJefe panelSig = new ModificarJefe(indice,panel,ventana);
           this.setVisible(false);
           ventana.setContentPane(panelSig);
           panelSig.setVisible(true);
       }
       
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
