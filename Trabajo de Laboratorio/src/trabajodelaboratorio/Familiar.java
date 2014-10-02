/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;
import java.time.LocalDate;

/**
 *
 * @author Luciano
 */
public class Familiar extends Persona {
    
    private String parentezco;
    
    public Familiar (String nombre,String apellido,Domicilio domicilio,int dni,LocalDate fechaNacimiento, String parentezco){
   
        super(nombre,apellido,domicilio,dni,fechaNacimiento);
        this.parentezco=parentezco;
    }

    /**
     * @return the parentezco
     */
    public String getParentezco() {
        return parentezco;
    }

    /**
     * @param parentezco the parentezco to set
     */
    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }
}
