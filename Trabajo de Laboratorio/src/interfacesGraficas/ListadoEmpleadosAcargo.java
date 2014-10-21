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
public class ListadoEmpleadosAcargo extends javax.swing.JPanel {

    /**
     * Creates new form ListadoEmpleadosAcargo
     */
    int indice;
    javax.swing.JPanel panel;
    javax.swing.JFrame ventana;
    private ArrayList<Jefe> arrayJefes;
    private Jefe empJefe;
    public ListadoEmpleadosAcargo(ArrayList<Jefe> arrayJefes,int indice,javax.swing.JPanel panel,javax.swing.JFrame ventana ) {
        initComponents();
        
        this.arrayJefes=arrayJefes;
        this.indice=indice;
        this.panel=panel;
        this.ventana=ventana;
        
        empJefe = (Jefe)arrayJefes.get(indice);
        ArrayList<Empleado> lista = empJefe.getNominaEmpleados();
        
        /* Crear tabla con la nomina de empleados del jefe */
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        Object[] fila = new Object[tableModel.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            {
                fila[0] = lista.get(i).getNroLegajo();
                fila[1] = lista.get(i).getNombre();
                fila[2] = lista.get(i).getApellido();
                fila[3] = lista.get(i).getTipoCargo();
                fila[4] = lista.get(i).getFecIngreso();
                tableModel.addRow(fila);
            }
         }
         jTable1.setModel(tableModel);
         
         jLabel2.setText(empJefe.getNombre()+" "+empJefe.getApellido()+" ("+empJefe.getTipoCargo()+" en "+empJefe.getArea()+")");
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Legajo", "Nombre", "Apellido", "Cargo", "Ingreso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Volver");
        jButton1.setToolTipText("Regresar a Listado de Jefes de Área");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Empleados a Cargo de:");

        jLabel2.setText("jLabel2");

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 180, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(47, 47, 47))
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
        ArrayList<Empleado> lista = empJefe.getNominaEmpleados();

        /* Obtener el empleado que se desea eliminar seleccionado en la tabla, obtenerlo desde el array empleados */
        EmpleadoNominaJefe emp = (EmpleadoNominaJefe)lista.get(jTable1.getSelectedRow());
        lista.remove(emp);
        emp.deleteJefe();
        tableModel.removeRow(jTable1.getSelectedRow());

    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
