/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import java.time.LocalDate;

/**
 *
 * @author Luciano
 */
public class Vendedor extends Empleado {
    private int sucursal;
    private int porcentaje_com;
    
   public Vendedor(String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac, String tipo_cargo, int nro_legajo, LocalDate fec_ingreso,int sucursal,int porcentaje_com){
       
       super(nombre,apellido,calle,numero,dni,diaNac,mesNac,añoNac,tipo_cargo,nro_legajo,fec_ingreso);
       this.sucursal=sucursal;
       this.porcentaje_com=porcentaje_com;
   }
}
