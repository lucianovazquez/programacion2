/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Luciano
 */
public class Vendedor extends Empleado {
    private int sucursal;
    private int porcentaje_com;
    
   public Vendedor(String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac, String tipo_cargo, int nro_legajo, LocalDate fec_ingreso,int sucursal,int porcentaje_com, ArrayList familiares){
       
       super(nombre,apellido,calle,numero,dni,diaNac,mesNac,añoNac,tipo_cargo,nro_legajo,fec_ingreso, familiares);
       this.sucursal=sucursal;
       this.porcentaje_com=porcentaje_com;
   }

    /**
     * @return the sucursal
     */
    public int getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * @return the porcentaje_com
     */
    public int getPorcentaje_com() {
        return porcentaje_com;
    }

    /**
     * @param porcentaje_com the porcentaje_com to set
     */
    public void setPorcentaje_com(int porcentaje_com) {
        this.porcentaje_com = porcentaje_com;
    }
}
