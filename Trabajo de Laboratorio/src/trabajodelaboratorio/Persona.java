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
    private LocalDate fechaNacimiento;
    private char sexo;
    
    public Persona(String nombre, String apellido,char sexo, Domicilio domicilio, int dni,LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
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
     * @return the fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void imprimirDatos(){
        System.out.println("Apellido y nombre:"+apellido+" "+nombre+" Sexo: "+sexo+" Fecha nacimiento: "+fechaNacimiento);
        System.out.println("Domicilio: "+domicilio.getCalle()+" "+domicilio.getNumero());
    }
    
}
