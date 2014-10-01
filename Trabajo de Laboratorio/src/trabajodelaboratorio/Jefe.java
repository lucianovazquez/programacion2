/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class Jefe extends Empleado{
    
    private String area;
    List empleados  = new ArrayList(); 
    /* Crear una excepción que controle que los unicos que se pueden acceder al array  "Empleados"
    son empleados de tipo operarios o administrativos, utilizar atributo "tipo_cargo" */
    
    public Jefe(String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac, String tipo_cargo, int nro_legajo, LocalDate fec_ingreso, String area, List empleados){
     
        super(nombre,apellido,calle,numero,dni,diaNac,mesNac,añoNac,tipo_cargo,nro_legajo,fec_ingreso);
        this.area=area;
        this.empleados=empleados;
        
    }   
}
