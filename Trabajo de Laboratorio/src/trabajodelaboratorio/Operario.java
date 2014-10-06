/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajodelaboratorio;

import java.time.LocalDate;

/**
 *
 * @author Net
 */
public class Operario extends Empleado{

    public Operario(String nombre, String apellido,char sexo, Domicilio domicilio, int dni, LocalDate fec_nacimiento, int nro_legajo, LocalDate fec_ingreso) {
        super(nombre,apellido,sexo,domicilio,dni,fec_nacimiento,nro_legajo,fec_ingreso,"Operario");
    }
    public Operario(){}
}
