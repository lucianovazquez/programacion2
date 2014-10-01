/**
 * Clase que contiene Datos Personales.
 * Inicialmente sera usado por los objetos Empleado para almacenar los datos personales
 * del empleado como los datos personales de sus familiares a cargo
 */
package trabajodelaboratorio;
import java.time.LocalDate;
/**
 *
 * @author RoqueG
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private int dni;
    private LocalDate fecha;
    
    public Persona(String nombre, String apellido, String calle, int numero, int dni, int diaNac, int mesNac, int añoNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = new Domicilio(calle,numero);
        this.dni = dni;
        this.fecha = LocalDate.of(añoNac,mesNac,diaNac);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the domicilio
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
