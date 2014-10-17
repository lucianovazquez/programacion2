/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import excepciones.TipoEmpleadoNoValidoException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class Jefe extends Empleado{
    
    private String area; //Area de la cual es Jefe
    private ArrayList<Empleado> nominaEmpleados  = new ArrayList<>();  // ArrayList con todos los empleados a cargo
   
    public Jefe(String nombre, String apellido,char sexo,Domicilio domicilio, int dni,LocalDate fechaNacimiento, int nro_legajo, LocalDate fec_ingreso, String area){
        super(nombre,apellido,sexo,domicilio,dni,fechaNacimiento,nro_legajo,fec_ingreso,"Jefe de area");
        this.area=area;
    }   
    public Jefe(){}

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }
    
    public void addEmpleadoANomina(Empleado emp1){
            getNominaEmpleados().add(emp1);
    }
    
    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Area a cargo: "+area+"");
    }

    /**
     * @return the nominaEmpleados
     */
    public ArrayList<Empleado> getNominaEmpleados() {
        return nominaEmpleados;
    }

    /**
     * @param nominaEmpleados the nominaEmpleados to set
     */
    public void setNominaEmpleados(ArrayList<Empleado> nominaEmpleados) {
        this.nominaEmpleados = nominaEmpleados;
    }

}
