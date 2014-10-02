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
    private int sucursal; //Sucursal de venta
    private Float porcentajeCom; //Porcentaje de Comision de Venas
    
   public Vendedor(String nombre, String apellido,Domicilio domicilio, int dni, LocalDate fechaNacimiento,int nro_legajo, LocalDate fec_ingreso,int sucursal,Float porcentaje_com){
       
       super(nombre,apellido,domicilio,dni,fechaNacimiento,nro_legajo,fec_ingreso);
       this.sucursal=sucursal;
       this.porcentajeCom=porcentaje_com;
       setTipoCargo("Vendedor");
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
     * @return the porcentajeCom
     */
    public Float getPorcentajeCom() {
        return porcentajeCom;
    }

    /**
     * @param porcentajeCom the porcentajeCom to set
     */
    public void setPorcentajeCom(Float porcentajeCom) {
        this.porcentajeCom = porcentajeCom;
    }
}
