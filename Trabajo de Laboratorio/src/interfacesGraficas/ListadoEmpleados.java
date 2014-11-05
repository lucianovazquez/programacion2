/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import java.awt.Rectangle;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultRowSorter;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import trabajodelaboratorio.Administrativo;
import trabajodelaboratorio.Empleado;
import trabajodelaboratorio.EmpleadoNominaJefe;
import trabajodelaboratorio.GestionEmpleados;
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
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        
       //Ordena la tabla en forma descendiente, según columna 0 (Nro de Legajo)
        
        TableRowSorter sorter = new TableRowSorter(tableModel);
        List<RowSorter.SortKey> sortKeys = new ArrayList();
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.toggleSortOrder(0);
        jTable1.setRowSorter(sorter);
        tableModel.fireTableDataChanged();
        revalidate();
        
        //Cargo desde array empleados a jTable
        ArrayList<Empleado> lista = GestionEmpleados.getEmpleados();
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
         
           //Centrar texto de columna 0 (N° Legajo)
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.getColumnModel().getColumn(0).setCellRenderer(tcr);
            
            //Boton mostrar todos
           if(tableModel.getRowCount()==1)
               jButton8.setEnabled(true);
           else
               jButton8.setEnabled(false);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Legajo", "Nombre", "Apellido", "Cargo", "Ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacesGraficas/Icono_lupa.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar Datos Personales");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Modificar Datos Laborales");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacesGraficas/impresora-icono-6704-128.png"))); // NOI18N
        jButton7.setToolTipText("Imprimir Listado");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listado de Empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacesGraficas/ic_lis (2).png"))); // NOI18N
        jButton8.setText("Ver todos");
        jButton8.setToolTipText("Mostrar todos los empleados");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Volver a Menu Principal
        this.setVisible(false);
        ventana.setContentPane(panel);
        panel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Eliminar empleado seleccionado
        //Comprobación de selección de fila
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");
            return;
        }
        
        //Comprobación para eliminar empleado definitivamente
        int seleccion = JOptionPane.showOptionDialog(
        this, // Componente padre
        "¿Desea eliminar el Empleado?", //Mensaje
        "Seleccione una opción", // Título
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,    // null para icono por defecto.
        new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
        "Si");
        
        if (seleccion != -1)
        {
           if((seleccion + 1)==1)
           {
              DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        
        /* Obtener desde el array empleados, el empleado seleccionado en la tabla recibo el indice del objeto en el array */
        int nroLeg = (int)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        Empleado emp = GestionEmpleados.getEmpleadoConEsteLegajo(nroLeg);
        //Recibo el índice del objeto en el array
        int indice = GestionEmpleados.getPosicionEmpleadoConEsteLegajo(nroLeg);
        
        
        /* Compruebo Si es operario o administrador */
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
        
        /* Compruebo Si es un jefe*/
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
                GestionEmpleados.getEmpleados().remove(indice);
                
                /* Borrar empleado del jTable*/
                tableModel.removeRow(indice);
           }
           else
           {
              return;
           }
        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //Ver Familia a Cargo del Empleado seleccionado
        if(jTable1.getSelectedRow()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");       
        }
        else{
            //Capturo Nro. de Legajo del empleado seleccionado
            int nroLeg = (int)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            int indice = GestionEmpleados.getPosicionEmpleadoConEsteLegajo(nroLeg);
            
            this.setVisible(false);
            ListadoFamiliares panelSig = new ListadoFamiliares(this,ventana,indice);
            ventana.setContentPane(panelSig);
            panelSig.setVisible(true);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Buscar empleado ingresando NRo. de Legajo
        int indice,legajo=0;
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número de legajo.");
            return;}
        
        try{
        legajo=Integer.parseInt(jTextField1.getText().trim());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,ex +" Debe ingresar un valor numérico.");
            return;
        }
        if(GestionEmpleados.existeEmpleadoConEsteLegajo(legajo)){
            indice=GestionEmpleados.getPosicionEmpleadoConEsteLegajo(legajo);
            
            System.out.println(indice);
        }
        else{
            JOptionPane.showMessageDialog(this, "No se encontraron resultados.");
            return;
        }
        
        //Filtra la fila con el N° de legajo ingresado.
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        TableRowSorter sorter = new TableRowSorter(tableModel); 
        //sorter.setRowFilter (RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, legajo)); 
        sorter.setRowFilter (RowFilter.regexFilter(jTextField1.getText().trim(),0));
        jTable1.setRowSorter (sorter);
       
        jButton8.setEnabled(true);
        /*
        Rectangle r = jTable1.getCellRect (indice, 0, true);
        jTable1.scrollRectToVisible(r);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.fireTableDataChanged();
        jTable1.getSelectionModel().setSelectionInterval(indice, indice);*/
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if(jTable1.getSelectedRow()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");
           return;
        }
        //Capturo Nro. de Legajo del empleado seleccionado
        int nroLeg = (int)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        int indice = GestionEmpleados.getPosicionEmpleadoConEsteLegajo(nroLeg);
        
        this.setVisible(false);
        ModificarEmpleado panelSig = new ModificarEmpleado(indice,panel,ventana);
        ventana.setContentPane(panelSig);
        panelSig.setVisible(true);
  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        if(jTable1.getSelectedRow()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.");
           return;
        }
        int nroLeg = (int)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        int indice = GestionEmpleados.getPosicionEmpleadoConEsteLegajo(nroLeg);
      //Verifico el tipo de cargo para saltar a la interfaz donde modifica datos laborales
       if(GestionEmpleados.getEmpleado(indice).getTipoCargo().equals("Vendedor")){
           ModificarVendedor panelSig = new ModificarVendedor(indice,panel,ventana);
           this.setVisible(false);
           ventana.setContentPane(panelSig);
           panelSig.setVisible(true);
       }
       if(GestionEmpleados.getEmpleado(indice).getTipoCargo().equals("Jefe de Área")){
           ModificarJefe panelSig = new ModificarJefe(indice,panel,ventana);
           this.setVisible(false);
           ventana.setContentPane(panelSig);
           panelSig.setVisible(true);
       }
       //Administrativo y Operario, poseen mismo datos laborales, opción de modificar solo fecha de ingreso
       if(GestionEmpleados.getEmpleado(indice).getTipoCargo().equals("Administrativo")||GestionEmpleados.getEmpleado(indice).getTipoCargo().equals("Operario")){
           ModificarAdminOperarioGer panelSig = new ModificarAdminOperarioGer(indice,panel,ventana);
           this.setVisible(false);
           ventana.setContentPane(panelSig);
           panelSig.setVisible(true);
       }
       if(GestionEmpleados.getEmpleado(indice).getTipoCargo().equals("Gerente")){
           ModificarAdminOperarioGer panelSig = new ModificarAdminOperarioGer(indice,panel,ventana);
           this.setVisible(false);
           ventana.setContentPane(panelSig);
           panelSig.setVisible(true);
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            jTable1.print(); // Abre Cuadro de impresión predeterminado
        } catch (PrinterException ex) { 
        System.out.println(ex);}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        this.setVisible(false);
        ListadoEmpleados panelSig = new ListadoEmpleados(ventana,panel);
        ventana.setContentPane(panelSig);
        panelSig.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
