/**
 * Clase que contiene Datos Personales.
 * Inicialmente sera usado por los objetos Empleado para almacenar los datos personales
 * del empleado como los datos personales de sus familiares a cargo
 */
package trabajodelaboratorio;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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
    public Persona(){}
    
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
    
    public void setFechaNacimiento(Date fechaNacimiento) {
            int dia;
            int mes;
            int año;
            
            año = Integer.parseInt(new SimpleDateFormat("yyyy").format(fechaNacimiento));
            mes = Integer.parseInt(new SimpleDateFormat("MM").format(fechaNacimiento));
            dia = Integer.parseInt(new SimpleDateFormat("dd").format(fechaNacimiento));
            this.fechaNacimiento=LocalDate.of(año, mes, dia);
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

}
