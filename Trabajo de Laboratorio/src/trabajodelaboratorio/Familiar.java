/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

/**
 *
 * @author Luciano
 */
public class Familiar extends Persona {
    
    private String parentezco;
    
    public Familiar (String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac, String parentezco){
    
        super(nombre,apellido,calle,numero,dni,diaNac,mesNac,añoNac);
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
