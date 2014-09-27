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
public class DatosPersonales {
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private int dni;
    private LocalDate fecha;
    
    public DatosPersonales(String nombre, String apellido, String calle, int numero, int dni, int diaNac, int mesNac, int añoNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = new Domicilio(calle,numero);
        this.dni = dni;
        this.fecha = LocalDate.of(añoNac,mesNac,diaNac);
    }
    
}
