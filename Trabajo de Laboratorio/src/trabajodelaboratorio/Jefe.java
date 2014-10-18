/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import excepciones.TipoEmpleadoNoValidoException;
import excepciones.YaTieneUnJefeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciano
 */
public class Jefe extends Empleado{
    
    private String area; //Area de la cual es Jefe
    private ArrayList<Empleado> nominaEmpleados  = new ArrayList<>();  // ArrayList con todos los empleados a cargo
   
    public Jefe(String nombre, String apellido,char sexo,Domicilio domicilio, int dni,LocalDate fechaNacimiento, int nro_legajo, LocalDate fec_ingreso, String area){
        super(nombre,apellido,sexo,domicilio,dni,fechaNacimiento,nro_legajo,fec_ingreso,"Jefe de Área");
        this.area=area;
    }   
    public Jefe(){}

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }
    
    public void addEmpleadoANomina(Empleado emp1) throws TipoEmpleadoNoValidoException, YaTieneUnJefeException{
            if(emp1 instanceof Operario || emp1 instanceof Administrativo){
                if(emp1 instanceof Operario){
                    Operario op = (Operario)emp1;
                    op.addJefe(this);
                }
                else{
                    Administrativo ad = (Administrativo)emp1;
                    ad.addJefe(this);
                }
                nominaEmpleados.add(emp1);

            }
            else
                throw new TipoEmpleadoNoValidoException("No es operario ni administrador");        
    }
    
    public void eliminarEmpleadoDeNomina(Empleado emp1){
        
        nominaEmpleados.remove(emp1);           
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
