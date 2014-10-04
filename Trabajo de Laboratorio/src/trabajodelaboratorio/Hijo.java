package trabajodelaboratorio;

import java.time.LocalDate;

/**
 *
 * @author Luciano
 */
public class Hijo extends Persona implements Familiar {

    public Hijo(String nombre, String apellido, char sexo, Domicilio domicilio, int dni, LocalDate fechaNacimiento) {
        super(nombre, apellido, sexo, domicilio, dni, fechaNacimiento);
    }
    
}
