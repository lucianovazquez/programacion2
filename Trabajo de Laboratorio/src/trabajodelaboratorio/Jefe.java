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
    private ArrayList <Empleado> empleados  = new ArrayList(); 
    /* Crear una excepción que controle que los unicos que se pueden acceder al array  "Empleados"
    son empleados de tipo operarios o administrativos, utilizar atributo "tipo_cargo" */
   
    public Jefe(String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac, String tipo_cargo, int nro_legajo, LocalDate fec_ingreso, String area, ArrayList empleados){
     
        super(nombre,apellido,calle,numero,dni,diaNac,mesNac,añoNac,tipo_cargo,nro_legajo,fec_ingreso);
        this.area=area;
        this.empleados=(ArrayList<Empleado>) empleados;
        
    }   

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
}
