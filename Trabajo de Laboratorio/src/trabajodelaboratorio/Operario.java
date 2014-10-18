/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajodelaboratorio;

import excepciones.YaTieneUnJefeException;
import java.time.LocalDate;

/**
 *
 * @author Net
 */
public class Operario extends Empleado{
    private Jefe jefe;

    public Operario(String nombre, String apellido,char sexo, Domicilio domicilio, int dni, LocalDate fec_nacimiento, int nro_legajo, LocalDate fec_ingreso) {
        super(nombre,apellido,sexo,domicilio,dni,fec_nacimiento,nro_legajo,fec_ingreso,"Operario");
    }
    public Operario(){}
    
    /**
     * @return the jefe
     */
    public Jefe getJefe() {
    return jefe;
    }

    /**
     * @param jefe the jefe to set
     */
    
    public void addJefe(Jefe jefe) throws YaTieneUnJefeException{
        
        if(this.jefe==null){
            this.jefe = jefe;
        }
        else{
            throw new YaTieneUnJefeException("Ya tiene un jefe asignado");
        }
    }
    
    /**
     * @param jefe the jefe to set
     */
    public void deleteJefe(){
        
        this.jefe = null;
    }
    
    /**
     * @param jefe the jefe to set
     */
    public void setJefe(Jefe jefe){
        this.jefe = jefe;
    }
}
