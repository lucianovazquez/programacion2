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
public interface Familiar {
    public String getNombre();
    public String getApellido();
    public Domicilio getDomicilio();
    public int getDni();
    public LocalDate getFechaNacimiento();
    public char getSexo();
}
