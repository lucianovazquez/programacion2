package trabajodelaboratorio;

import excepciones.YaTieneUnJefeException;
import java.time.LocalDate;

/**
 * Clase para crear objetos que representan empleados de tipo administrado.
 * @author RoqueG
 * @author LucianoVazquez
 */
public class Administrativo extends Empleado implements EmpleadoNominaJefe{
    /** Jefe que tiene asignado el empleado administrativo */
    private Jefe jefe;
    
    /**
     * Constructor sin parametros
     */
    public Administrativo(){
    
    }
    /**
     * Constructor que recibe toda la informacion personal y laboral del empleado
     * @param nombre 
     * @param apellido 
     * @param sexo representado por una letra F o M
     * @param domicilio 
     * @param dni 
     * @param fec_nacimiento 
     * @param nro_legajo 
     */
    public Administrativo(String nombre, String apellido,char sexo, Domicilio domicilio, int dni, LocalDate fec_nacimiento, int nro_legajo, LocalDate fec_ingreso) {
        super(nombre,apellido,sexo,domicilio,dni,fec_nacimiento,nro_legajo,fec_ingreso,"Administrativo");
    }
        
    /**
     * @return the jefe
     */
    public Jefe getJefe() {
        return jefe;
    }
    
    /**
     * Agrega un jefe, no debe tener un jefe ya asignado, si lo tiene lanza
     * excepcion.
     * @param jefe the jefe to set
     * @throws excepciones.YaTieneUnJefeException
     */
    @Override
    public void addJefe(Jefe jefe) throws YaTieneUnJefeException{
        if(this.jefe==null){
            this.jefe = jefe;
        }
        else{
            throw new YaTieneUnJefeException("Ya tiene un jefe asignado");
        }
    }
    
    /**
     * Quita el jefe que tenia asignado.
     */
    @Override
    public void deleteJefe(){
        
        this.jefe = null;
    }
    
    /**
     * Modifica el jefe que tiene asignado
     * @param jefe nuevo jefe que tendra asignado;
     */
    @Override
    public void setJefe(Jefe jefe){
        this.jefe = jefe;
    }
}
