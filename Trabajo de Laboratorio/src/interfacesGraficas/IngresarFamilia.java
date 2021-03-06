package interfacesGraficas;

import excepciones.TipoEmpleadoNoValidoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import trabajodelaboratorio.Administrativo;
import trabajodelaboratorio.Conyuge;
import trabajodelaboratorio.Empleado;
import trabajodelaboratorio.Familiar;
import trabajodelaboratorio.Gerente;
import trabajodelaboratorio.GestionEmpleados;
import trabajodelaboratorio.Hijo;
import trabajodelaboratorio.Jefe;
import trabajodelaboratorio.Operario;
import trabajodelaboratorio.Persona;
import trabajodelaboratorio.Vendedor;

/**
 *
 * @author Luciano
 */
public class IngresarFamilia extends javax.swing.JPanel {

    /**
     * Creates new form IngresarFamilia
     */
    Empleado emp;
    javax.swing.JPanel panel0;
    javax.swing.JFrame ventana;
    javax.swing.JPanel panelPrincipal;
    
    public IngresarFamilia(javax.swing.JPanel panelPrincipal,Empleado emp,javax.swing.JPanel panel0, javax.swing.JFrame ventana) {
        
        initComponents();
        this.emp=emp;
        this.panel0=panel0;
        this.ventana=ventana;
        this.panelPrincipal=panelPrincipal;
        this.setSize(420, 330);
     
        jLabel4.setText(emp.getNombre()+" "+emp.getApellido());
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        /* Cargar Tabla con los familiares del empleado*/
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        ArrayList<Familiar> lista = emp.getFamiliares();
        Object[] fila = new Object[tableModel.getColumnCount()];
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Conyuge){
                Conyuge con=(Conyuge)lista.get(i);      
                fila[0] = con.getNombre();
                fila[1] = con.getApellido();
                fila[2] = ("Conyuge");
                fila[3] = con.getDni();
                tableModel.addRow(fila);
            }
            else{
                Hijo hijo=(Hijo)lista.get(i);
                fila[0] = hijo.getNombre();
                fila[1] = hijo.getApellido();
                char a= hijo.getSexo();
                if(a=='M'){
                fila[2] = ("Hijo");}
                else{
                fila[2] = ("Hija");} 
                fila[3] = hijo.getDni();
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(420, 330));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Familia a Cargo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Parentesco", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Listado:");

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Empleado:");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(343, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton2)
                .addGap(111, 111, 111)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Comprueba si esta cargando por primera vez o se esta modificando
        
        if(panel0 instanceof ModificarEmpleado){
            this.setVisible(false);
            ventana.setContentPane(panel0);
            panel0.setVisible(true);
        return;}
       
            
       
        /* Mostrar siguiente panel segun el tipo de empleado tratado */
        if(emp instanceof Vendedor){    
            this.setVisible(false);
            DatosLaboralesVendedor  panelSig = new DatosLaboralesVendedor(panelPrincipal,(Vendedor) emp,this,ventana);
            ventana.setContentPane(panelSig);
        }
        if(emp instanceof Jefe){    
            this.setVisible(false);
            DatosLaboralesJefe  panelSig = new DatosLaboralesJefe(panelPrincipal,(Jefe) emp,this,ventana);
            ventana.setContentPane(panelSig);
        }
        if(emp instanceof Administrativo){
            this.setVisible(false);
            DatosLaboralesEmpleado panelSig = new DatosLaboralesEmpleado(panelPrincipal,(Administrativo) emp,this,ventana);
            ventana.setContentPane(panelSig);
        }
        if(emp instanceof Operario){
            this.setVisible(false);
            DatosLaboralesEmpleado panelSig = new DatosLaboralesEmpleado(panelPrincipal,(Operario) emp,this,ventana);
            ventana.setContentPane(panelSig);
        }
        if(emp instanceof Gerente){
            this.setVisible(false);
            DatosLaboralesEmpleado panelSig = new DatosLaboralesEmpleado(panelPrincipal,(Gerente) emp,this,ventana);
            ventana.setContentPane(panelSig);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     /* Ir al panel para ingresar los familiares a cargo*/
        if(panel0 instanceof ModificarEmpleado){
            this.setVisible(false);
            IngresarFamiliarDatosPersonales panel = new IngresarFamiliarDatosPersonales(this,emp,panel0,ventana);
             ventana.setContentPane(panel);
        return;}
       this.setVisible(false);
       IngresarFamiliarDatosPersonales panel = new IngresarFamiliarDatosPersonales(panelPrincipal,emp,this,ventana);
       ventana.setContentPane(panel);    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un familiar.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        /* Eliminar familiar seleccionado de la table y de emp */
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        ArrayList<Familiar> lista = emp.getFamiliares();
        lista.remove(jTable1.getSelectedRow());
        tableModel.removeRow(jTable1.getSelectedRow());   
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
