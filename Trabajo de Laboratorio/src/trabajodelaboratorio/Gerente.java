package trabajodelaboratorio;

import java.time.LocalDate;

/**
 *
 * @author Net
 */
public class Gerente extends Empleado{

    public Gerente(String nombre,String apellido,char sexo,Domicilio domicilio, int dni, LocalDate fec_nacimiento, int nro_legajo, LocalDate fec_ingreso) {
        super(nombre,apellido,sexo,domicilio,dni,fec_nacimiento,nro_legajo,fec_ingreso,"Gerente");
    }
    public Gerente() {
    }
}
