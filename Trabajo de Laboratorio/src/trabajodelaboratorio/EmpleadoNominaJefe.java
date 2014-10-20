package trabajodelaboratorio;

import excepciones.YaTieneUnJefeException;

/**
 * Esta interfaz es implementada por operario y administrador para poder acceder
 * a los metodos necesarios en el manejos de los empleados de la nomina del jefe
 * a cargo.
 * @author Roque
 */
public interface EmpleadoNominaJefe {
    
   
    public Jefe getJefe();
    public void addJefe(Jefe jefe) throws YaTieneUnJefeException;
    public void deleteJefe();
    public void setJefe(Jefe jefe);
}
