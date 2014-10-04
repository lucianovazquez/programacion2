package trabajodelaboratorio;

import java.time.LocalDate;

/**
 *
 * @author Luciano
 */
public class Conyuge extends Persona implements Familiar{
    public Conyuge (String nombre,String apellido,char sexo,Domicilio domicilio,int dni,LocalDate fechaNacimiento){
   
        super(nombre,apellido,sexo,domicilio,dni,fechaNacimiento);
    }
}
